package com.vpu.mp.service.shop.order;

import com.vpu.mp.db.shop.tables.records.BulkshipmentRecordDetailRecord;
import com.vpu.mp.db.shop.tables.records.BulkshipmentRecordRecord;
import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.data.JsonResultMessage;
import com.vpu.mp.service.foundation.excel.ExcelFactory;
import com.vpu.mp.service.foundation.excel.ExcelReader;
import com.vpu.mp.service.foundation.excel.ExcelTypeEnum;
import com.vpu.mp.service.foundation.excel.ExcelUtil;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.saas.schedule.TaskJobsConstant;
import com.vpu.mp.service.pojo.shop.base.ResultMessage;
import com.vpu.mp.service.pojo.shop.express.ExpressVo;
import com.vpu.mp.service.pojo.shop.goods.GoodsConstant;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.OrderRepurchaseParam;
import com.vpu.mp.service.pojo.shop.order.OrderRepurchaseVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.OrderOperateQueryParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.ship.ShipParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.ship.ShipVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.ship.batch.BatchShipMqParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.ship.batch.BatchShipParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.ship.batch.BatchShipPojo;
import com.vpu.mp.service.pojo.shop.order.write.remark.SellerRemarkParam;
import com.vpu.mp.service.pojo.shop.order.write.remark.SellerRemarkVo;
import com.vpu.mp.service.pojo.shop.order.write.star.StarParam;
import com.vpu.mp.service.pojo.wxapp.cart.CartConstant;
import com.vpu.mp.service.pojo.wxapp.cart.WxAppAddGoodsToCartParam;
import com.vpu.mp.service.pojo.wxapp.order.goods.GoodsAndOrderInfoBo;
import com.vpu.mp.service.shop.express.ExpressService;
import com.vpu.mp.service.shop.goods.GoodsSpecProductService;
import com.vpu.mp.service.shop.order.action.ShipService;
import com.vpu.mp.service.shop.order.action.base.ExecuteResult;
import com.vpu.mp.service.shop.order.goods.OrderGoodsService;
import com.vpu.mp.service.shop.order.refund.ReturnMethodService;
import com.vpu.mp.service.shop.order.ship.BatchShipExcelWrongHandler;
import com.vpu.mp.service.shop.order.ship.BulkshipmentRecordDetailService;
import com.vpu.mp.service.shop.order.ship.BulkshipmentRecordService;
import com.vpu.mp.service.shop.user.cart.CartService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

import static com.vpu.mp.db.shop.tables.OrderInfo.ORDER_INFO;

/**
 * 订单普通写操作
 * 
 * @author 王帅 2019/7/22
 */
@Service
public class OrderWriteService extends ShopBaseService {
    
    @Autowired
    public ReturnMethodService returnMethodService;
	@Autowired
	private OrderGoodsService orderGoods;
	@Autowired
	private CartService cartService;
	@Autowired
	private GoodsSpecProductService goodsSpecProductService;
    @Autowired
    public ShipService ship;
    @Autowired
    public BulkshipmentRecordService batchShipRecord;
    @Autowired
    public BulkshipmentRecordDetailService batchShipDetail;
    @Autowired
    public ExpressService express;

	/**
	 * 订单标星切换
	 * 
	 * @param
	 * @return void
	 */
	public void switchStar(StarParam param) {
		logger().info("订单标星切换参数为:" + param.toString());
		db().update(param.getTable()).set(param.getField(), param.getStarFlag()).where(param.getWhere()).execute();
		logger().info("订单标星切换完成");
	}

	/**
	 * 	卖家备注
	 * 
	 * @param param
	 * @return boolean
	 */
	public SellerRemarkVo sellerRemark(SellerRemarkParam param) {
		SellerRemarkVo vo = null;
		switch (param.getType()) {
		case SellerRemarkParam.TYPE_QUERY:
			logger().info("获取卖家备注参数为:" + param.toString());
			vo = db().select(ORDER_INFO.ORDER_SN, ORDER_INFO.SELLER_REMARK).from(ORDER_INFO)
					.where(ORDER_INFO.ORDER_SN.eq(param.getOrderSn())).fetchAnyInto(SellerRemarkVo.class);
			logger().info("获取卖家备注完成");
			break;
		case SellerRemarkParam.TYPE_UPDATE:
			logger().info("更新卖家备注参数为:" + param.toString());
			db().update(ORDER_INFO).set(ORDER_INFO.SELLER_REMARK, param.getRemark())
					.where(ORDER_INFO.ORDER_SN.eq(param.getOrderSn())).execute();
			logger().info("更新卖家备注完成");
			break;
		default :
			logger().error("卖家备注switch_default");
		}
		return vo;
	}

	/**
	 * 再次购买
	 * @param param
	 * @return
	 */
	public OrderRepurchaseVo orderRepurchase(OrderRepurchaseParam param) {
		OrderRepurchaseVo vo=new OrderRepurchaseVo();
		List<GoodsAndOrderInfoBo> goodsInfos = orderGoods.getGoodsInfoAndOrderInfo(param.getOrderSn());
		List<GoodsAndOrderInfoBo> invalidGoods = goodsInfos.stream().filter(goods -> goods.getDelFlag().equals(DelFlag.DISABLE_VALUE)
				|| goods.getIsOnSale().equals(GoodsConstant.OFF_SALE)
                || goods.getIsGift().equals(OrderConstant.YES)
				|| goods.getPrdNumber().equals(0)).collect(Collectors.toList());
		if (invalidGoods.size()>0){
			vo.setContent("包含"+invalidGoods.size()+"件已失效/已售罄商品，无法再次购买！其他商品已为您加入购物车");
			goodsInfos.removeAll(invalidGoods);
		}
		for (GoodsAndOrderInfoBo next : goodsInfos) {
			WxAppAddGoodsToCartParam addParam = new WxAppAddGoodsToCartParam();
			addParam.setUserId(param.getUserId());
			addParam.setGoodsNumber(next.getGoodsNumber());
			addParam.setPrdId(next.getProductId());
			addParam.setType(WxAppAddGoodsToCartParam.CART_GOODS_NUM_TYPE_ADD);
			ResultMessage resultMessage = cartService.addGoodsToCart(addParam);
			if (!resultMessage.getFlag()) {
				vo.setResultMessage(resultMessage);
				return vo;
			}
		}
		return vo;
	}

    /**
     * 订单标星切换
     *
     * @param
     * @return void
     */
    public void batchShip(BatchShipParam param) throws MpException {
        logger().info("批量发货start");
        MultipartFile file = param.getFile();
        if (file == null) {
            logger().error("文件为null!");
            throw new MpException(JsonResultCode.CODE_EXCEL_ERRO);
        }
        ExcelTypeEnum excelTypeEnum = ExcelUtil.checkFile(file);
        if (excelTypeEnum == null) {
            logger().error("导入格式错误!");
            throw new MpException(JsonResultCode.CODE_EXCEL_ERRO);
        }
        param.setExcelTypeEnum(excelTypeEnum);
        Workbook workbook = null;
        try (InputStream in1 = param.getFile().getInputStream()) {
            workbook = ExcelFactory.createWorkbook(in1, param.getExcelTypeEnum());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BatchShipExcelWrongHandler handler = new BatchShipExcelWrongHandler();
        ExcelReader excelReader = new ExcelReader(param.getLang(), workbook, handler);
        List<BatchShipPojo> list = excelReader.readModelList(BatchShipPojo.class);
        // 调用消息队列
        saas.taskJobMainService.dispatchImmediately(new BatchShipMqParam(getShopId(), param.getAdminInfo(), list), BatchShipMqParam.class.getName(), getShopId(),
            TaskJobsConstant.TaskJobEnum.BATCH_SHIP.getExecutionType());
        logger().info("批量发货send");
    }

    /**
     * 批量发货执行
     * @param param
     * @return
     */
    public void executeBatchShip(BatchShipMqParam param) {
        logger().info("批量发货executeBatchShip，start");
        List<BatchShipPojo> info = param.getInfo();
        if(CollectionUtils.isEmpty(info)) {
            return;
        }
        int sum = info.size(), success = 0;
        BulkshipmentRecordRecord mainRecord = batchShipRecord.addRecord(sum, param.getAdminInfo());

        for (BatchShipPojo shipPojo : info) {
            logger().info("单次执行，param:{}", shipPojo);
            //create record
            BulkshipmentRecordDetailRecord detailRecord = batchShipDetail.createRecord(shipPojo, mainRecord.getId());
            //get shippingId
            ExpressVo expressVo = express.get(shipPojo.getExpress());
            //check
            if (detailRecord.getStatus().equals(batchShipDetail.fail)) {
                detailRecord.insert();
                continue;
            } else if (expressVo == null) {
                detailRecord.setStatus(batchShipDetail.fail);
                detailRecord.setFailReason(JsonResultMessage.MSG_ORDER_SHIPPING_EXPRESS_NOT_EXIST);
                detailRecord.insert();
                continue;
            }
            //query
            OrderOperateQueryParam queryParam = new OrderOperateQueryParam();
            queryParam.setOrderSn(shipPojo.getOrderSn());
            ShipVo query = (ShipVo) ship.query(queryParam);
            //check
            if (query == null || CollectionUtils.isEmpty(query.getOrderGoodsVo())) {
                detailRecord.setStatus(batchShipDetail.fail);
                detailRecord.setFailReason(JsonResultMessage.MSG_ORDER_OPERATE_NO_INSTANCEOF);
                detailRecord.insert();
                continue;
            }
            //execute
            ShipParam executeParam = new ShipParam();
            executeParam.setAdminInfo(param.getAdminInfo());
            executeParam.setIsMp(OrderConstant.IS_MP_MQ);
            executeParam.setOrderSn(detailRecord.getOrderSn());
            executeParam.setShippingId(expressVo.getShippingId());
            executeParam.setShippingNo(shipPojo.getTrackingNo());
            executeParam.setShipGoods(query.getOrderGoodsVo().stream().map(x -> new ShipParam.ShipGoods(x.getRecId(), x.getGoodsNumber())).toArray(ShipParam.ShipGoods[]::new));
            ExecuteResult executeResult = ship.execute(executeParam);
            if (executeResult == null || executeResult.isSuccess()) {
                detailRecord.insert();
                sum++;
            } else {
                detailRecord.setStatus(batchShipDetail.fail);
                detailRecord.setFailReason(executeResult.getErrorCode().getMessage());
                detailRecord.insert();
            }
        }
        mainRecord.setSuccessNum(success);
        mainRecord.update();
        logger().info("批量发货executeBatchShip,批次号:{},总数:{},成功数:{}.end",mainRecord.getId(), mainRecord.getTotalNum(), mainRecord.getSuccessNum());
    }
}
