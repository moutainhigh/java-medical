package com.vpu.mp.service.shop.order.action;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.vpu.mp.db.shop.tables.records.OrderInfoRecord;
import com.vpu.mp.db.shop.tables.records.UserRecord;
import com.vpu.mp.service.foundation.jedis.JedisManager;
import com.vpu.mp.service.foundation.util.BigDecimalUtil;
import com.vpu.mp.service.foundation.util.DateUtil;
import com.vpu.mp.service.foundation.util.IncrSequenceUtil;
import com.vpu.mp.service.pojo.shop.member.card.CardConstant;
import com.vpu.mp.service.pojo.shop.payment.PaymentVo;
import com.vpu.mp.service.pojo.shop.store.store.StorePojo;
import com.vpu.mp.service.pojo.wxapp.order.CreateOrderBo;
import com.vpu.mp.service.pojo.wxapp.order.CreateOrderVo;
import com.vpu.mp.service.pojo.wxapp.order.CreateParam;
import com.vpu.mp.service.shop.activity.factory.OrderBeforeMpProcessorFactory;
import com.vpu.mp.service.shop.activity.factory.OrderCreatePayBeforeMpProcessorFactory;
import com.vpu.mp.service.shop.activity.factory.ProcessorFactoryBuilder;
import com.vpu.mp.service.shop.config.ShopReturnConfigService;
import com.vpu.mp.service.shop.coupon.CouponService;
import com.vpu.mp.service.shop.member.MemberService;
import com.vpu.mp.service.shop.order.action.base.Calculate;
import com.vpu.mp.service.shop.member.BaseScoreCfgService;
import com.vpu.mp.service.shop.order.action.base.ExecuteResult;
import com.vpu.mp.service.shop.order.atomic.AtomicOperation;
import com.vpu.mp.service.shop.order.goods.OrderGoodsService;
import com.vpu.mp.service.shop.order.invoice.InvoiceService;
import com.vpu.mp.service.shop.order.must.OrderMustService;
import com.vpu.mp.service.shop.order.trade.OrderPayService;
import com.vpu.mp.service.shop.payment.PaymentService;
import com.vpu.mp.service.shop.store.store.StoreService;
import com.vpu.mp.service.shop.user.cart.CartService;
import jodd.util.StringUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vpu.mp.db.shop.tables.records.GoodsRecord;
import com.vpu.mp.db.shop.tables.records.GoodsSpecProductRecord;
import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.goods.GoodsConstant;
import com.vpu.mp.service.pojo.shop.member.address.UserAddressVo;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderServiceCode;
import com.vpu.mp.service.pojo.wxapp.order.OrderBeforeParam;
import com.vpu.mp.service.pojo.wxapp.order.OrderBeforeParam.Goods;
import com.vpu.mp.service.pojo.wxapp.order.goods.OrderGoodsBo;
import com.vpu.mp.service.pojo.wxapp.order.OrderBeforeVo;
import com.vpu.mp.service.shop.config.TradeService;
import com.vpu.mp.service.shop.goods.GoodsService;
import com.vpu.mp.service.shop.goods.GoodsSpecProductService;
import com.vpu.mp.service.shop.member.AddressService;
import com.vpu.mp.service.shop.member.UserCardService;
import com.vpu.mp.service.shop.order.action.base.IorderOperate;
import com.vpu.mp.service.shop.order.info.OrderInfoService;

import static com.vpu.mp.service.pojo.shop.order.OrderConstant.NO;
import static com.vpu.mp.service.pojo.shop.order.OrderConstant.YES;

/**
 * 下单逻辑处理
 *
 * @author: ws
 * @create: 2019-10-23 16:15
 **/
@Component
public class CreateService extends ShopBaseService implements IorderOperate<OrderBeforeParam, CreateParam> {

    @Autowired
    private OrderInfoService orderInfo;

    @Autowired
    private AddressService address;

    @Autowired
    private TradeService tradeCfg;

    @Autowired
    private ShopReturnConfigService returnCfg;

    @Autowired
    private UserCardService userCard;

    @Autowired
    private GoodsSpecProductService goodsSpecProduct;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private OrderGoodsService orderGoods;

    @Autowired
    private StoreService store;

    @Autowired
    private Calculate calculate;

    @Autowired
    private PaymentService payment;

    @Autowired
    private BaseScoreCfgService scoreCfg;

    @Autowired
    private MemberService member;

    @Autowired
    private InvoiceService invoice;

    @Autowired
    private CouponService coupon;

    @Autowired
    private OrderMustService must;

    @Autowired
    private OrderPayService orderPay;

    @Autowired
    private ProcessorFactoryBuilder processorFactoryBuilder;

    @Autowired
    private AtomicOperation atomicOperation;

    @Autowired
    private CartService cart;
    
    @Override
    public OrderServiceCode getServiceCode() {
        return OrderServiceCode.CREATE;
    }

    /**
     * 订单创建前，结算页面数据查询
     */
    @Override
    public Object query(OrderBeforeParam param) throws MpException {
        OrderBeforeVo result = OrderBeforeVo.builder().
            // 地址
            address(getDefaultAddress(param.getWxUserInfo().getUserId(), param.getAddressId())).
            // 支持的配送方式
            expressList(getExpressList()).
        build();
        // goods info init
        initGoods(param.getGoods());
        // process
        processParam(param, result);

        return result;
    }

    @Override
    public ExecuteResult execute(CreateParam param) {
        logger().info("下单start");
        //vo
        CreateOrderVo createVo = new CreateOrderVo();
        //初始化bo
        CreateOrderBo orderBo;
        //OrderBeforeVo
        final OrderBeforeVo orderBeforeVo;
        //订单入库后数据
        OrderInfoRecord orderAfterRecord = null;
        //order before data ready
        try {
            //TODO 营销相关
            if(null != param.getActivityId() && null != param.getActivityType()) {
                //初始化param里营销相关的内容（活动价格等）
                OrderCreatePayBeforeMpProcessorFactory processorFactory = processorFactoryBuilder.getProcessorFactory(OrderCreatePayBeforeMpProcessorFactory.class);
                processorFactory.initMarketOrderCreateParam(param);
            }else {
                purchase(param, param.getWxUserInfo().getUserId(), param.getStoreId());
            }
            orderBo = initCreateOrderBo(param);
            //校验
            checkCreateOrderBo(orderBo, param);
            orderBeforeVo = OrderBeforeVo.builder().
                address(orderBo.getAddress()).
                build();
            //处理orderBeforeVo
            processOrderBeforeVo(param, orderBeforeVo, orderBo.getOrderGoodsBo());
            //校验
            checkOrder(orderBeforeVo, orderBo, param);
        } catch (MpException e) {
            return ExecuteResult.create(e.getErrorCode(), null,  e.getCodeParam());
        }
        try{
            //生成orderSn
            String orderSn = IncrSequenceUtil.generateOrderSn(OrderConstant.ORDER_SN_PREFIX);
            //record入库
            transaction(()->{
                //初始化订单（赋值部分数据）
                OrderInfoRecord order = orderInfo.addRecord(orderSn, param, orderBo, orderBo.getOrderGoodsBo(), orderBeforeVo);
                //普通营销活动处理
                processNormalActivity(order, orderBo, orderBeforeVo);
                //计算其他数据（需关联去其他模块）
                setOtherValue(order, orderBo, orderBeforeVo);
                //订单入库
                order.store();
                order.refresh();
                //支付系统金额
                orderPay.payMethodInSystem(order, order.getUseAccount(), order.getScoreDiscount(), order.getMemberCardBalance());
                //商品退款退货配置
                calculate.setGoodsReturnCfg(orderBo.getOrderGoodsBo(), order.getGoodsType(), order.getPosFlag());
                orderGoods.addRecord(order, orderBo.getOrderGoodsBo());
                //必填信息
                must.addRecord(param.getMust());
                //TODO exchang、好友助力
                orderBo.setOrderId(order.getOrderId());
            });
        orderAfterRecord = orderInfo.getRecord(orderBo.getOrderId());
        createVo.setOrderSn(orderAfterRecord.getOrderSn());
        if(!(OrderConstant.PAY_CODE_COD.equals(orderAfterRecord.getPayCode()) ||
            OrderConstant.PAY_CODE_BALANCE_PAY.equals(orderAfterRecord.getPayCode()) ||
            (OrderConstant.PAY_CODE_SCORE_PAY.equals(orderAfterRecord.getPayCode()) && BigDecimalUtil.compareTo(orderAfterRecord.getMoneyPaid(), BigDecimal.ZERO) == 0))) {
                //货到付款、余额、积分(非微信混合)付款，生成订单时加销量减库存
                atomicOperation.updateStockAndSales(orderAfterRecord, orderBo.getOrderGoodsBo(), false);
        }
    } catch (DataAccessException e) {
        logger().error("下单捕获mp异常", e);
        Throwable cause = e.getCause();
        if (cause instanceof MpException) {
            return ExecuteResult.create(((MpException) cause).getErrorCode(), null,  ((MpException) cause).getCodeParam());
        } else {
            return ExecuteResult.create(JsonResultCode.CODE_ORDER_DATABASE_ERROR);
        }
    } catch (Exception e) {
        logger().error("下单捕获mp异常", e);
        return ExecuteResult.create(JsonResultCode.CODE_ORDER);
    }
        //购物车删除
        if(OrderConstant.CART_Y.equals(param.getIsCart())){
            cart.removeCartByProductIds(param.getWxUserInfo().getUserId(), param.getProductIds());
        }
        //TODO 欧派、嗨购、CRM、自动同步订单微信购物单
        try {
            createVo.setWebPayVo(orderPay.isContinuePay(orderAfterRecord, orderAfterRecord.getOrderSn(), orderAfterRecord.getMoneyPaid(), orderPay.getGoodsNameForPay(orderAfterRecord, orderBo.getOrderGoodsBo()), param.getClientIp(), param.getWxUserInfo().getWxUser().getOpenId(), param.getActivityType()));
            return ExecuteResult.create(createVo);
        } catch (MpException e) {
            return ExecuteResult.create(e.getErrorCode());
        }
    }

    /**
     * 初始化
     * @param param CreateParam
     * @return CreateOrderBo
     */
    private CreateOrderBo initCreateOrderBo(CreateParam param) throws MpException {
        logger().info("初始化CreateOrderBo,start-end");
        return CreateOrderBo.builder().
            //地址
            address(address.get(param.getAddressId(), param.getWxUserInfo().getUserId())).
            //门店
            store(param.getStoreId() == null ? null : store.getStore(param.getStoreId())).
            //支付方式
            payment(param.getOrderPayWay() == null ? null : payment.getPaymentInfo(OrderConstant.MP_PAY_CODE_TO_STRING[param.getOrderPayWay()])).
            //发票
            invoice(param.getInvoiceId() == null ? null : invoice.get(param.getInvoiceId())).
            //TODO 自提时间

            // 会员卡
            currencyMember(StringUtil.isBlank(param.getMemberCardNo()) ? null : userCard.userCardDao.getValidByCardNo(param.getMemberCardNo())).
            //优惠卷
            currencyCupon(StringUtil.isBlank(param.getCouponSn()) ? null : coupon.getValidCoupons(param.getCouponSn())).
            //ordergoods
            orderGoodsBo(initOrderGoods(param, param.getGoods(), param.getWxUserInfo().getUserId(), param.getMemberCardNo(), param.getStoreId())).
            build();

    }

    /**
     * 校验
     * @param bo 业务对象
     * @param param 参数
     * @throws MpException 见throw语句
     */
    public void checkCreateOrderBo(CreateOrderBo bo, CreateParam param) throws MpException {
        logger().info("校验checkCreateOrderBo,start");
        //非送礼 非门店 校验地址
        if(bo.getOrderType().contains(OrderConstant.GOODS_TYPE_GIVE_GIFT) && bo.getStore() == null && bo.getAddress() == null){
            throw new MpException(JsonResultCode.CODE_ORDER_ADDRESS_NO_NULL);
        }
        //会员卡失效
        if(StringUtil.isNotBlank(param.getMemberCardNo()) && bo.getCurrencyMember() == null) {
            throw new MpException(JsonResultCode.CODE_ORDER_CARD_INVALID);
        }
        //优惠卷失效
        if(StringUtil.isNotBlank(param.getCouponSn()) && bo.getCurrencyCupon() == null) {
            throw new MpException(JsonResultCode.CODE_ORDER_COUPON_INVALID);
        }
        logger().info("校验checkCreateOrderBo,end");
    }

    /**
     * 获取默认地址
     *
     * @param userId
     * @param addressId
     * @return
     */
    public UserAddressVo getDefaultAddress(Integer userId, Integer addressId) {
        UserAddressVo defaultAddress = null;
        if (addressId != null) {
            // 输入addressId
            defaultAddress = address.get(addressId, userId);
        }
        // 输入地址无效
        if (defaultAddress == null) {
            // 没输入addressId
            defaultAddress = orderInfo.getLastOrderAddress(userId);
            // TODO 更新经纬度
        }
        return defaultAddress;
    }

    /**
     * 配送方式
     *
     * @return
     */
    public Byte[] getExpressList() {
        Byte[] expressList = new Byte[]{0 , 0 , 0};
        // 快递
        expressList[OrderConstant.DELIVER_TYPE_COURIER] = tradeCfg.getExpress();
        // 自提
        expressList[OrderConstant.DELIVER_TYPE_SELF] = tradeCfg.getFetch();
        //TODO 同城配送
        // expressList[OrderConstant.DELIVER_TYPE_COURIER] =
        // trade.getCityExpressService();
        return expressList;
    }

    /**
     * 初始化购买商品信息(初始化param里的goods信息)
     * @param goods
     * @return
     */
    public void initGoods(List<Goods> goods) {
        // TODO 以下参数为模拟参数
        for (Goods temp : goods) {
            // 商品参与的促销活动id
            temp.setStraId(null);
            // 购买价格id
            temp.setPurchasePriceId(null);
            // 购买规则id
            temp.setPurchasePriceRuleId(null);
            // ?crm?
            temp.setPromoteInfo(null);
        }
    }

    public void processParam(OrderBeforeParam param, OrderBeforeVo vo) throws MpException {

        //初始化所有可选支付方式
        vo.setPaymentList(getSupportPayment());

        if (param.getActivityId() != null && param.getActivityType() != null) {
            // 唯一并互斥的商品营销处理
            // 可能的ActivityType ：我要送礼、限次卡兑换、拼团、砍价、积分兑换、秒杀、拼团抽奖、打包一口价、预售、抽奖、支付有礼、测评、好友助力、满折满减购物车下单
            OrderBeforeMpProcessorFactory processorFactory = processorFactoryBuilder.getProcessorFactory(OrderBeforeMpProcessorFactory.class);
            processorFactory.doProcess(param,vo);

            //营销购买
            purchaseForMarket(param, param.getStoreId());
        } else {
            // 普通商品下单，不指定唯一营销活动时的订单处理（需要考虑首单特惠、限时降价、会员价、赠品、满折满减直接下单）
            if (Boolean.TRUE) {
                // 非购物车
                if (Boolean.FALSE) {
                    // 送礼 或 批量换购
                } else {
                    //单次购买
                    purchase(param, param.getWxUserInfo().getUserId(), param.getStoreId());
                }
            }
        }
        this.setOrderBeforeVoInfo(param,param.getWxUserInfo().getUserId(), param.getStoreId(),vo);
    }

    /**
     * 非营销初始化商品
     * @param param
     * @param userId
     * @param storeId
     * @throws MpException
     */
    public void purchase(OrderBeforeParam param, Integer userId, Integer storeId) throws MpException {
        logger().info("非营销初始化商品start(purchase)");
        //TODO 返利信息
        Boolean isNewUser = orderInfo.isNewUser(userId, true);
        //规格信息,key proId
        Map<Integer, GoodsSpecProductRecord> productInfo = goodsSpecProduct.selectSpecByProIds(param.getProductIds(), storeId);
        //goods type,key goodsId
        Map<Integer, Byte> goodsTypes = goodsService.getGoodsType(param.getGoodsIds());
        //非营销默认0
        param.setActivityType(OrderConstant.GOODS_TYPE_GENERAL);
        //赋值
        for (Goods temp : param.getGoods()) {
            GoodsSpecProductRecord product = productInfo.get(temp.getProductId());
            Byte goodsType = goodsTypes.get(temp.getGoodsId());
            if (product == null || goodsType == null) {
                //商品规格不存在（逻辑上不会出现）
                throw new MpException(JsonResultCode.CODE_ORDER);
            }
            //方便计算，临时存储
            temp.setProductInfo(product);
            //规格价格
            temp.setProductPrice(product.getPrdPrice());
            //规格数量
            temp.setProductNumbers(product.getPrdNumber());
            //商品goodsType
            temp.setGoodsType(goodsType);
            //首单特惠处理
            if (isNewUser) {
                //TODO
                temp.setIsFirstSpecial(YES);
                temp.setIsFirstSpecial(NO);
            }
        }
        logger().info("非营销初始化商品end(purchase)");
    }

    /**
     * 唯一性的营销活动下单
     * @param param
     * @param storeId
     * @throws MpException
     */
    private void purchaseForMarket(OrderBeforeParam param, Integer storeId) throws MpException {
        //规格信息,key proId
        Map<Integer, GoodsSpecProductRecord> productInfo = goodsSpecProduct.selectSpecByProIds(param.getProductIds(), storeId);
        //goods type,key goodsId
        Map<Integer, Byte> goodsTypes = goodsService.getGoodsType(param.getGoodsIds());
        //赋值
        for (Goods temp : param.getGoods()) {
            GoodsSpecProductRecord product = productInfo.get(temp.getProductId());
            Byte goodsType = goodsTypes.get(temp.getGoodsId());
            if (product == null || goodsType == null) {
                //商品规格不存在（逻辑上不会出现）
                logger().info("下单商品规格不存在");
                throw new MpException(JsonResultCode.CODE_ORDER);
            }
            //方便计算，临时存储
            temp.setProductInfo(product);
            //规格价格(经过营销活动处理的规格价格)
            temp.setProductPrice(temp.getProductPrice());
            //规格原价
            //temp.setMarketPrice(temp.getMarketPrice());
            //规格数量（库存）
            temp.setProductNumbers(product.getPrdNumber());
            //商品goodsType
            temp.setGoodsType(goodsType);

        }
    }

    /**
     * 根据处理过的param和其他信息填充下单确认页返回信息
     * @param param
     * @param userId
     * @param storeId
     * @param vo
     */
    private void setOrderBeforeVoInfo(OrderBeforeParam param, Integer userId, Integer storeId, OrderBeforeVo vo) throws MpException {
        // 初始化
        vo.setOrderGoods(initOrderGoods(param, param.getGoods(), userId, param.getMemberCardNo(), storeId));
        //默认选择配送方式
        vo.setDeliverType(Objects.isNull(param.getDeliverType()) ? vo.getDefaultDeliverType() : param.getDeliverType());
        //配送方式支持的门店列表（自提、同城配送）
        List<StorePojo>[] storeLists = store.filterExpressList(vo.getExpressList(), param.getProductIds(), vo.getAddress(), NO);
        //处理配送方式及门店信息;设置门店列表
        processExpressList(storeLists, vo);
        //计算金额相关、vo赋值
        processOrderBeforeVo( param, vo, vo.getOrderGoods());
        //服务条款
        setServiceTerms(vo);
        // 积分使用规则
        setScorePayRule(vo);
        //订单必填信息处理
        vo.setMust(calculate.getOrderMust(vo.getOrderGoods()));
    }

    /**
     * 营销、非营销处理后初始化orderGoods对象
     * @param param 结算参数
     * @param goods 购买商品列表
     * @param userId 会员id
     * @param memberCardNo 会员卡no
     * @param storeId   门店id
     * @throws MpException 校验异常
     * @return  bo
     */
    public List<OrderGoodsBo> initOrderGoods(OrderBeforeParam param, List<Goods> goods, Integer userId, String memberCardNo, Integer storeId) throws MpException {
        logger().info("initOrderGoods开始");
        // 会员卡类型
        Byte cardType = StringUtil.isBlank(memberCardNo) ? null : userCard.getCardType(memberCardNo);
        // 会员等级
        String userGrade = userCard.getUserGrade(userId);
        //
        List<OrderGoodsBo> boList = new ArrayList<>(goods.size());
        //规格信息,key proId
        Map<Integer, GoodsSpecProductRecord> productInfo = goodsSpecProduct.selectSpecByProIds(param.getProductIds(), storeId);
        //下单时获取goods
        Map<Integer, GoodsRecord> goodsRecords = goodsService.getGoodsToOrder(param.getGoodsIds());
        for (Goods temp : goods) {
            GoodsRecord goodsRecord = goodsRecords.get(temp.getGoodsId());
            //TODO 去别的class写：不满足需要推出11111
            //分销返利（return）
            //首单特惠（return）
            //会员等级->限时降价/等级会员卡专享价格/商品价格（三取一）return
            //限时降价

            //商品校验
            checkGoodsAndProduct(goodsRecord, temp);
            //会员专享校验

            //预售商品，不支持现购买

            //非加价购 && 非限次卡，限购

            //price 副本

            //if else 加价购-straid

            //非加价购 复制 11111分支

            //判断副本与实际计算价格大小、

            //初始化ordergoods

            //TODO temp goodsprice 取规格
            boList.add(orderGoods.initOrderGoods(temp, goodsRecord));
        }
        param.setBos(boList);
        return boList;
    }

    /**
     * 校验
     *
     * @param goodsRecord
     * @param goods
     * @throws MpException
     */
    public void checkGoodsAndProduct(GoodsRecord goodsRecord, Goods goods) throws MpException {
        if (goodsRecord == null || goodsRecord.getDelFlag() == DelFlag.DISABLE.getCode()) {
            logger().error("checkGoodsAndProduct,商品不存在");
            throw new MpException(JsonResultCode.CODE_ORDER_GOODS_NOT_EXIST, goodsRecord.getGoodsName());
        }
        if (!GoodsConstant.ON_SALE.equals(goodsRecord.getIsOnSale())) {
            logger().error("checkGoodsAndProduct,商品已下架,id:" + goodsRecord.getGoodsId());
            throw new MpException(JsonResultCode.CODE_ORDER_GOODS_NO_SALE, null, goodsRecord.getGoodsName());
        }
        if (goods.getGoodsNumber() > goods.getProductNumbers()) {
            logger().error("checkGoodsAndProduct,库存不足,id:" + goods.getProductId());
            throw new MpException(JsonResultCode.CODE_ORDER_GOODS_OUT_OF_STOCK, goodsRecord.getGoodsName());
        }
        if (goods.getGoodsNumber() == null || goods.getGoodsNumber() <= 0) {
            logger().error("checkGoodsAndProduct,商品数量不能为0,id:" + goods.getProductId());
            throw new MpException(JsonResultCode.CODE_ORDER_GOODS_NO_ZERO, goodsRecord.getGoodsName());
        }
    }

    /**
     * 处理配送方式及门店信息;设置门店列表
     * @param storeLists 门店
     * @param vo vo
     */
    public void processExpressList(List<StorePojo>[] storeLists, OrderBeforeVo vo){

        //自提、同城快递处理
        for (int i = 1, length = vo.getExpressList().length ; i < length ; i++){
            if(CollectionUtils.isEmpty(storeLists[i])){
                //不支持该配送方式
                vo.getExpressList()[i] = NO;
            }else if(vo.getDeliverType() == i){
                /*
                 *   TODO 处理当前配送方式的门店列表
                 *   1.自提:根据前端传的经纬度排序（当前门店、距离）
                 *   2.同城配送：根据vo.getAddress()地址排序（当前门店、距离）
                 */
                vo.setStoreList(null);
            }
        }
    }

    /**
     * 支付方式
     */
    public Map<String, PaymentVo> getSupportPayment(){
        return payment.getSupportPayment();
        //TODO 营销活动
    }

    /**
     * 金额处理 赋值
     * @param param
     * @param vo
     * @param bos
     */
    public void processOrderBeforeVo(OrderBeforeParam param, OrderBeforeVo vo, List<OrderGoodsBo> bos) {
        logger().info("金额处理赋值(processOrderBeforeVo),start");
        //积分抵扣金额
        BigDecimal scoreDiscount = param.getScoreDiscount();
        //余额抵扣金额
        BigDecimal useAccount = param.getBalance();
        //会员卡抵扣金额
        BigDecimal cardBalance = param.getCardBalance();
        //总价、总数量
        BigDecimal[] tolalNumberAndPrice = calculate.getTolalNumberAndPriceByType(bos, null, null);
        //处理会员卡
        calculate.calculateCardInfo(param, vo);
        //处理当前会员卡
        BigDecimal memberDiscount = calculate.calculateOrderGoodsDiscount(vo.getDefaultMemberCard(), bos, OrderConstant.D_T_MEMBER_CARD);
        //处理优惠卷
        calculate.calculateCoupon(param, vo);
        //处理当前优惠卷
        BigDecimal couponDiscount = calculate.calculateOrderGoodsDiscount(vo.getDefaultCoupon(), bos, OrderConstant.D_T_COUPON);
        //计算运费
        if(vo.getAddress() != null){
            //没有可用地址的用户
            vo.setShippingFee(calculate.calculateShippingFee(vo.getAddress().getDistrictCode(), bos, param.getStoreId(), null));
            //判断是否可以发货
            vo.setCanShipping(isShipping(bos));
        }else{
            vo.setShippingFee(BigDecimal.ZERO);
            //判断是否可以发货
            vo.setCanShipping(NO);
        }

        //TODO 包邮策略
        //freeDeliveryLogic();
        //折扣金额
        BigDecimal tolalDiscountAfterPrice = BigDecimalUtil.addOrSubtrac(
            BigDecimalUtil.BigDecimalPlus.create(tolalNumberAndPrice[Calculate.BY_TYPE_TOLAL_PRICE], BigDecimalUtil.Operator.subtrac),
            BigDecimalUtil.BigDecimalPlus.create(memberDiscount, BigDecimalUtil.Operator.subtrac),
            BigDecimalUtil.BigDecimalPlus.create(couponDiscount, BigDecimalUtil.Operator.subtrac)
        );
        //折扣金额(使用大额优惠券，支付金额不为负的，等于运费金额)
        if(BigDecimalUtil.compareTo(tolalDiscountAfterPrice, BigDecimal.ZERO) < 0){
            tolalDiscountAfterPrice = BigDecimal.ZERO;
        }
        //TODO 同城配送运费
        //支付金额
        BigDecimal moneyPaid = BigDecimalUtil.addOrSubtrac(
            BigDecimalUtil.BigDecimalPlus.create(tolalDiscountAfterPrice, BigDecimalUtil.Operator.add),
            BigDecimalUtil.BigDecimalPlus.create(vo.getShippingFee(), BigDecimalUtil.Operator.subtrac),
            BigDecimalUtil.BigDecimalPlus.create(scoreDiscount, BigDecimalUtil.Operator.subtrac),
            BigDecimalUtil.BigDecimalPlus.create(useAccount, BigDecimalUtil.Operator.subtrac),
            BigDecimalUtil.BigDecimalPlus.create(cardBalance, null)
        );
        //支付金额(使用大额优惠券，支付金额不为负的，等于运费金额)
        if(BigDecimalUtil.compareTo(moneyPaid, BigDecimal.ZERO) < 0){
            moneyPaid = BigDecimal.ZERO;
        }
        //TODO 支付方式

        //折后订单金额
        BigDecimal moneyAfterDiscount = BigDecimalUtil.add(tolalDiscountAfterPrice, vo.getShippingFee());
        //TODO 积分抵扣比例 用户可使用积分抵扣订单折后金额的50% 不填默认积分抵扣订单折后金额的50%
        Integer scoreDiscountRatio = 50;
        BigDecimal scoreMaxDiscount = BigDecimalUtil.multiplyOrDivide(
            BigDecimalUtil.BigDecimalPlus.create(moneyAfterDiscount, BigDecimalUtil.Operator.multiply),
            BigDecimalUtil.BigDecimalPlus.create(BigDecimal.valueOf(scoreDiscountRatio), BigDecimalUtil.Operator.Divide),
            BigDecimalUtil.BigDecimalPlus.create(BigDecimal.valueOf(100), null)
        );
        //会员信息
        UserRecord user = member.getUserRecordById(param.getWxUserInfo().getUserId());
        //赋值
        vo.setOrderAmount(tolalNumberAndPrice[Calculate.BY_TYPE_TOLAL_PRICE]);
        vo.setTotalGoodsNumber(tolalNumberAndPrice[Calculate.BY_TYPE_TOLAL_NUMBER].intValue());
        vo.setScoreDiscount(scoreDiscount != null ? scoreDiscount : BigDecimalUtil.BIGDECIMAL_ZERO);
        vo.setAccountDiscount(useAccount != null ? useAccount : BigDecimalUtil.BIGDECIMAL_ZERO);
        vo.setMemberCardDiscount(cardBalance  != null ? cardBalance : BigDecimalUtil.BIGDECIMAL_ZERO);
        vo.setMemberCardReduce(memberDiscount  != null ? memberDiscount : BigDecimalUtil.BIGDECIMAL_ZERO);
        vo.setDiscount(couponDiscount  != null ? couponDiscount : BigDecimalUtil.BIGDECIMAL_ZERO);
        vo.setMoneyPaid(moneyPaid  != null ? moneyPaid : BigDecimalUtil.BIGDECIMAL_ZERO);
        vo.setDiscountedMoney(BigDecimalUtil.subtrac(moneyPaid, vo.getShippingFee()));
        vo.setOrderGoods(bos);
        vo.setUserScore(user.getScore());
        vo.setUserAccount(user.getAccount());
        vo.setMemberCardMoney(vo.getDefaultMemberCard() == null ? BigDecimal.ZERO : vo.getDefaultMemberCard().getMoney());
        vo.setMoneyAfterDiscount(moneyAfterDiscount);
        //TODO
        vo.setOrderPayWay(param.getOrderPayWay());
        vo.setExchang(vo.getDefaultMemberCard() == null ? NO : (CardConstant.MCARD_TP_LIMIT.equals(vo.getDefaultMemberCard().getCardType()) ? YES : NO));
        vo.setScoreMaxDiscount(scoreMaxDiscount);
        vo.setInvoiceSwitch(tradeCfg.getInvoice());
        vo.setCancelTime(tradeCfg.getCancelTime());
        vo.setActivityType(param.getActivityType());
        vo.setActivityId(param.getActivityId());
        vo.setIsCardPay(tradeCfg.getCardFirst());
        vo.setIsScorePay(tradeCfg.getScoreFirst());
        vo.setIsBalancePay(tradeCfg.getBalanceFirst());
        logger().info("金额处理赋值(processOrderBeforeVo),end");
    }

    /**
     * 校验
     * @param vo 结算vo
     * @param bo 下单业务对象
     * @param param 下单参数
     * @throws MpException 见throw语句
     */
    public void checkOrder(OrderBeforeVo vo, CreateOrderBo bo, CreateParam param) throws MpException {
        //地址超出配送范围,请重新选择商品后下单
        if(NO == vo.getCanShipping()) {
            throw new MpException(JsonResultCode.CODE_ORDER_CALCULATE_SHIPPING_FEE_ERROR);
        }
        //积分不足
        if(BigDecimalUtil.compareTo(vo.getScoreDiscount(), BigDecimal.valueOf(vo.getUserScore())) == 1){
            throw new MpException(JsonResultCode.CODE_ORDER_SCORE_NOT_ENOUGH);
        }
        //余额不足
        if(BigDecimalUtil.compareTo(vo.getAccountDiscount(), vo.getUserAccount()) == 1){
            throw new MpException(JsonResultCode.CODE_ORDER_ACCOUNT_NOT_ENOUGH);
        }
        //会员卡余额不足
        if(BigDecimalUtil.compareTo(vo.getMemberCardDiscount(), vo.getMemberCardMoney()) == 1){
            throw new MpException(JsonResultCode.CODE_ORDER_CARD_NOT_ENOUGH);
        }
        //订单金额变更，是否继续购买
        if(BigDecimalUtil.compareTo(param.getOrderAmount(), vo.getOrderAmount()) != 0){
            throw new MpException(JsonResultCode.CODE_ORDER_AMOUNT_CHANGE, null, vo.getOrderAmount().toString());
        }
        //不可配送（地址超出配送范围,请重新选择商品后下单）
        if(vo.getCanShipping() == NO) {
            throw new MpException(JsonResultCode.CODE_ORDER_CALCULATE_SHIPPING_FEE_ERROR);
        }
        //积分抵扣金额不能超过
        if(BigDecimalUtil.compareTo(vo.getScoreDiscount(), vo.getScoreMaxDiscount()) == 1){
            throw new MpException(JsonResultCode.CODE_ORDER_SCORE_LIMIT);
        }
        //TODO 限次卡校验
        if(Boolean.FALSE){
            throw new MpException(JsonResultCode.CODE_ORDER_MCARD_TP_LIMIT_LIMIT);
        }
        //TODO 促销活动失效，无法下单

        //配送方式校验
        checkExpress(param.getDeliverType());
        //支付方式校验
        checkPayWay(param.getOrderPayWay(), vo);
    }

    /**
     * 计算替他模块信息并赋值
     * @param order
     * @param orderBo
     * @param beforeVo
     */
    private void setOtherValue(OrderInfoRecord order, CreateOrderBo orderBo, OrderBeforeVo beforeVo){
        //支付信息
        if(BigDecimalUtil.add(beforeVo.getMoneyPaid(), beforeVo.getBkOrderMoney()).compareTo(BigDecimal.ZERO) == 0){
            logger().info("支付信息:余额支付");
            //非补款
            order.setPayCode(OrderConstant.PAY_CODE_BALANCE_PAY);
            //覆盖货到付款（小程序选择货到付款但是如果无需再支付时设置货到付款为否）
            logger().info("支付信息:货到付款");
            order.setIsCod(OrderConstant.IS_COD_NO);
        }else {
            if (orderBo.getPayment() != null) {
                logger().info("支付信息:{}", orderBo.getPayment());
                order.setPayCode(orderBo.getPayment().getPayCode());
                if(OrderConstant.PAY_CODE_COD.equals(orderBo.getPayment().getPayCode())){
                    logger().info("支付信息:货到付款");
                    order.setIsCod(OrderConstant.IS_COD_YES);
                }
            }
        }
        //订单状态
        if(orderBo.getOrderType().contains(OrderConstant.GOODS_TYPE_PRE_SALE) ||
            (OrderConstant.PAY_WAY_FRIEND_PAYMENT == beforeVo.getOrderPayWay() && BigDecimalUtil.compareTo(beforeVo.getInsteadPayMoney(), BigDecimal.ZERO) == 1)) {
            //预售、代付（代付金额大于0）->待支付
            logger().info("订单状态:{}", OrderConstant.ORDER_WAIT_PAY);
            order.setOrderStatus(OrderConstant.ORDER_WAIT_PAY);
        }else {
            if((orderBo.getPayment() != null && OrderConstant.PAY_CODE_COD.equals(orderBo.getPayment().getPayCode()) ||
                BigDecimalUtil.compareTo(order.getMoneyPaid(), BigDecimal.ZERO) == 0)) {
                //货到付款 || 待支付=0
                if(orderBo.getOrderType().contains(OrderConstant.GOODS_TYPE_PIN_GROUP) || orderBo.getOrderType().contains(OrderConstant.GOODS_TYPE_GROUP_DRAW)) {
                    //拼团
                    logger().info("订单状态:{}", OrderConstant.ORDER_PIN_PAYED_GROUPING);
                    order.setOrderStatus(OrderConstant.ORDER_PIN_PAYED_GROUPING);
                }
                else {
                    logger().info("订单状态:{}", OrderConstant.ORDER_WAIT_DELIVERY);
                    order.setOrderStatus(OrderConstant.ORDER_WAIT_DELIVERY);
                }
            }else {
                logger().info("订单状态:{}", OrderConstant.ORDER_WAIT_PAY);
                order.setOrderStatus(OrderConstant.ORDER_WAIT_PAY);
            }
        }
        //设置支付过期时间(默认30minutes)
        Integer cancelTime = tradeCfg.getCancelTime();
        cancelTime = cancelTime < 1 ? OrderConstant.DEFAULT_AUTO_CANCEL_TIME : cancelTime;
        if(orderBo.getOrderType().contains(OrderConstant.GOODS_TYPE_SECKILL)) {
            //TODO 秒杀 activityid
        }
        if(OrderConstant.PAY_WAY_FRIEND_PAYMENT == beforeVo.getOrderPayWay()) {
            //代付
        }else {
            order.setExpireTime(DateUtil.getTimeStampPlus(cancelTime, ChronoUnit.MINUTES));
        }
        /**
         * 配置
         */
        //是否退优惠卷
        order.setIsRefundCoupon(returnCfg.getIsReturnCoupon());
        //order是否支持退款
        order.setReturnTypeCfg(orderBo.getOrderType().contains(OrderConstant.GOODS_TYPE_GIVE_GIFT) ? OrderConstant.CFG_RETURN_TYPE_N : OrderConstant.CFG_RETURN_TYPE_Y);
        //发货后自动确认收货时间设置
        order.setReturnDaysCfg(tradeCfg.getDrawbackDays().byteValue());
        //确认收货后order_timeout_days天，订单完成
        order.setOrderTimeoutDays(tradeCfg.getOrderTimeoutDays().shortValue());
    }

    /**
     * 处理普通的营销活动（下单时以普通商品下单，不指定营销活动的）
     * eg 首单特惠、限时降价、会员价、赠品、满折满减
     * @param order
     * @param orderBo
     * @param beforeVo
     */
    private void processNormalActivity(OrderInfoRecord order, CreateOrderBo orderBo, OrderBeforeVo beforeVo){
        //TODO 分销
        //TODO 使用优惠券使用, CRM核销
        //TODO 送赠品
        // 拼接活动类型

    }

    /**
     * 处理特殊的营销活动（下单时通过activityId和activityType指定）
     *  eg 我要送礼、限次卡兑换、拼团、砍价、积分兑换、秒杀、拼团抽奖、打包一口价、预售、抽奖、支付有礼、测评、好友助力、满折满减购物车下单
     * @param orderBo
     * @param beforeVo
     */
    private void processExclusiveActivity(CreateOrderBo orderBo,OrderBeforeVo beforeVo,int userId) throws MpException {
        List<OrderBeforeVo> capsules = new ArrayList<>();
        capsules.add(beforeVo);
        OrderCreatePayBeforeMpProcessorFactory processorFactory = processorFactoryBuilder.getProcessorFactory(OrderCreatePayBeforeMpProcessorFactory.class);
        processorFactory.doProcess(capsules,userId);

        //拼接活动类型
        orderBo.getOrderType().add(beforeVo.getActivityType());
    }

    /**
     * 设置服务条款
     * @param vo vo
     */
    public void setServiceTerms(OrderBeforeVo vo){
        Byte serviceTerms = tradeCfg.getServiceTerms();
        vo.setIsShowserviceTerms(serviceTerms);
        if(serviceTerms.intValue() == YES){
            vo.setServiceName(tradeCfg.getServiceName());
            vo.setServiceChoose(tradeCfg.getServiceChoose());
        }


    }

    /**
     * 积分使用规则
     * @param vo vo
     */
    public void setScorePayRule(OrderBeforeVo vo){
        //TODO 壮壮需要修改
        Byte scorePayLimit = scoreCfg.getScorePayLimit();
        Integer scorePayNum = null;
        if(NumberUtils.BYTE_ONE.equals(scorePayLimit)){
            scorePayNum = scoreCfg.getScorePayNum();
        }
        vo.setScorePayLimit(scorePayLimit);
        vo.setScorePayNum(scorePayNum);
    }

    /**
     * 判断是否可以发货
     * @param bos bos
     * @return no or yes
     */
    public Byte isShipping(List<OrderGoodsBo> bos){
        for (OrderGoodsBo bo: bos) {
            if(bo.getIsShipping() == NO){
                return NO;
            }
        }
        return YES;
    }

    /**
     *
     * @param deliverType 当前配送方式
     * @throws MpException 当前配送方式不支持
     */
    public void checkExpress(Byte deliverType) throws MpException {
        Byte[] expressList = getExpressList();
        if(expressList[deliverType] == NO){
            //当前配送方式不支持
            throw new MpException(JsonResultCode.CODE_ORDER_DELIVER_TYPE_NO_SUPPORT);
        }
    }
    /**
     *
     * @param orderPayWay 当前配支付方式
     * @throws MpException 当前支付方式不支持
     */
    public void checkPayWay(Byte orderPayWay, OrderBeforeVo vo) throws MpException {
        Map<String, PaymentVo> supportPayment = getSupportPayment();
        if(OrderConstant.MP_PAY_CODE_WX_PAY.equals(orderPayWay) && null == supportPayment.get(OrderConstant.MP_PAY_CODE_TO_STRING[orderPayWay])){
            //wx
            throw new MpException(JsonResultCode.CODE_ORDER_PAY_WAY_NO_SUPPORT_WX);
        }
        if(OrderConstant.MP_PAY_CODE_COD.equals(orderPayWay) && null == supportPayment.get(OrderConstant.MP_PAY_CODE_TO_STRING[orderPayWay])){
            //货到付款
            throw new MpException(JsonResultCode.CODE_ORDER_PAY_WAY_NO_SUPPORT_COD);
        }
        if(vo.getGoodsType() != null &&OrderConstant.GOODS_TYPE_INTEGRAL != vo.getGoodsType() && BigDecimalUtil.compareTo(vo.getScoreDiscount(), BigDecimal.ZERO) == 1 && vo.getIsScorePay() == NO){
            //积分（非积分兑换）
            throw new MpException(JsonResultCode.CODE_ORDER_PAY_WAY_NO_SUPPORT_SCORE);
        }
        //TODO 好友代付校验
    }

    public void updateStockAndSales(){

    }
}
