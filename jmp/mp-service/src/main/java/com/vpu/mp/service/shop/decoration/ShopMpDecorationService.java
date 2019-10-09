package com.vpu.mp.service.shop.decoration;

import static com.vpu.mp.db.shop.tables.PageClassification.PAGE_CLASSIFICATION;
import static com.vpu.mp.db.shop.tables.XcxCustomerPage.XCX_CUSTOMER_PAGE;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.jooq.Record5;
import org.jooq.SelectWhereStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vpu.mp.db.main.tables.records.DecorationTemplateRecord;
import com.vpu.mp.db.main.tables.records.ShopRecord;
import com.vpu.mp.db.shop.tables.records.UserRecord;
import com.vpu.mp.db.shop.tables.records.XcxCustomerPageRecord;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.FieldsUtil;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.saas.shop.version.VersionConfig;
import com.vpu.mp.service.pojo.shop.config.ShopShareConfig;
import com.vpu.mp.service.pojo.shop.decoration.PageClassificationVo;
import com.vpu.mp.service.pojo.shop.decoration.PageStoreParam;
import com.vpu.mp.service.pojo.shop.decoration.XcxCustomerPageVo;
import com.vpu.mp.service.pojo.shop.decoration.setIndexParam;
import com.vpu.mp.service.pojo.shop.decoration.module.ModuleBase;
import com.vpu.mp.service.pojo.shop.decoration.module.ModuleConstant;
import com.vpu.mp.service.pojo.shop.decoration.module.ModuleGoodsGroup;
import com.vpu.mp.service.pojo.shop.market.collect.CollectGiftParam;
import com.vpu.mp.service.pojo.wxapp.config.ShareConfig;
import com.vpu.mp.service.pojo.wxapp.coupon.ShopCollectInfo;
import com.vpu.mp.service.pojo.wxapp.decorate.WxAppPageParam;
import com.vpu.mp.service.pojo.wxapp.decorate.WxAppPageVo;
import com.vpu.mp.service.shop.config.ConfigService;
import com.vpu.mp.service.shop.user.user.UserService;

/**
 * 
 * @author lixinguo
 *
 */

@Service
public class ShopMpDecorationService extends ShopBaseService {

	@Autowired
	protected ConfigService config;

	@Autowired
	protected UserService user;

	/**
	 * 装修页面列表
	 * 
	 * @param param
	 * @return
	 */
	public PageResult<XcxCustomerPageVo> getPageList(XcxCustomerPageVo param) {
		if (getPageCount() == 0) {
			this.addDefaultPage();
		}
		SelectWhereStep<Record5<Integer, String, Timestamp, Byte, String>> select = db()
				.select(XCX_CUSTOMER_PAGE.PAGE_ID, XCX_CUSTOMER_PAGE.PAGE_NAME, XCX_CUSTOMER_PAGE.CREATE_TIME,
						XCX_CUSTOMER_PAGE.PAGE_TYPE, PAGE_CLASSIFICATION.NAME)
				.from(XCX_CUSTOMER_PAGE
						.leftJoin(PAGE_CLASSIFICATION)
						.on(XCX_CUSTOMER_PAGE.CAT_ID.eq(PAGE_CLASSIFICATION.ID)));
		select = buildOptions(select, param);
		select.orderBy(XCX_CUSTOMER_PAGE.PAGE_TYPE.desc(), XCX_CUSTOMER_PAGE.CREATE_TIME.desc());
		return this.getPageResult(select, XcxCustomerPageVo.page, XcxCustomerPageVo.class);
	}

	/**
	 * 查询条件
	 * 
	 * @param select
	 * @param param
	 * @return
	 */
	public SelectWhereStep<Record5<Integer, String, Timestamp, Byte, String>> buildOptions(
			SelectWhereStep<Record5<Integer, String, Timestamp, Byte, String>> select, XcxCustomerPageVo param) {
		Byte enabled = 1;
		select.where(XCX_CUSTOMER_PAGE.PAGE_ENABLED.eq(enabled));
		// 页面内容
		if (param.getPageName() != null) {
			select.where(XCX_CUSTOMER_PAGE.PAGE_NAME.eq(param.getPageName()));
		}

		// 页面分类
		if (param.getCatId() != null && param.getCatId() > 0) {
			select.where(XCX_CUSTOMER_PAGE.CAT_ID.eq(param.getCatId()));
		}

		return select;
	}

	/**
	 * 添加默认装修页
	 * 
	 * @return
	 */
	public int addDefaultPage() {
		return db()
				.insertInto(XCX_CUSTOMER_PAGE, XCX_CUSTOMER_PAGE.PAGE_NAME, XCX_CUSTOMER_PAGE.PAGE_TYPE,
						XCX_CUSTOMER_PAGE.PAGE_TPL_TYPE)
				.values("首页", (byte) 1, (byte) 3)
				.execute();
	}

	/**
	 * 添加页面
	 * 
	 * @param page
	 * @return
	 */
	public boolean addPage(XcxCustomerPageVo param) {
		XcxCustomerPageRecord record = new XcxCustomerPageRecord();
		this.assign(param,record);
		return db().executeInsert(record) > 0 ? true : false;
	}

	public int setPageCatId(Integer pageId, Integer catId) {
		return db().update(XCX_CUSTOMER_PAGE)
				.set(XCX_CUSTOMER_PAGE.CAT_ID, catId)
				.where(XCX_CUSTOMER_PAGE.PAGE_ID.eq((pageId)))
				.execute();
	}

	public int removeRow(Integer pageId) {
		return db().deleteFrom(XCX_CUSTOMER_PAGE)
				.where(XCX_CUSTOMER_PAGE.PAGE_ID.eq((pageId)))
				.execute();
	}

	/**
	 * 获取装修页面
	 * 
	 * @param pageId
	 * @return
	 */
	public XcxCustomerPageRecord getPageById(Integer pageId) {
		return db().fetchAny(XCX_CUSTOMER_PAGE, XCX_CUSTOMER_PAGE.PAGE_ID.eq((pageId)));
	}

	/**
	 * 得到一个空页面
	 * 
	 * @return
	 */
	public XcxCustomerPageRecord getEmptyPage() {
		XcxCustomerPageRecord record = db().newRecord(XCX_CUSTOMER_PAGE);
		record.setPageContent("{}");
		return record;
	}

	/**
	 * 过滤页面内容
	 * 
	 * @param pageContent
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Map<String, Object>> filterPageContent(String pageContent) {
		if (pageContent == null) {
			return null;
		}
		Map<String, Map<String, Object>> result = Util.parseJson(pageContent, Map.class);
		for (Map.Entry<String, Map<String, Object>> entry : result.entrySet()) {
			Map<String, Object> v = entry.getValue();
			filterActivityModules(v);
			filterImageModules(v);
		}
		return result;
	}

	protected void filterActivityModules(Map<String, Object> v) {

	}

	protected void filterImageModules(Map<String, Object> v) {

	}

	/**
	 * 得到店铺版本模块
	 * 
	 * @return
	 */
	public Map<String, Integer> getVersionModules() {
		VersionConfig config = saas().shop.version.mergeVersion(this.getShopId());
		List<String> sub2 = config.mainConfig.sub2;
		Map<String, Integer> moduleMap = new HashMap<String, Integer>(8);
		String[] modules = { "m_member_card", "m_voucher", "m_bargain", "m_video",
				"m_integral_goods", "m_seckill_goods", "m_group_draw", "m_pin_integration" };
		for (String module : modules) {
			moduleMap.put(module, sub2.contains(module) ? 1 : 0);
		}
		return moduleMap;
	}

	/**
	 * 获取装修页面数量
	 * 
	 * @return
	 */
	public int getPageCount() {
		Byte enabled = 1;
		return db().fetchCount(XCX_CUSTOMER_PAGE, XCX_CUSTOMER_PAGE.PAGE_ENABLED.eq(enabled));
	}

	/**
	 * 取得全部装修页面
	 * 
	 * @param param
	 * @return
	 */
//	public Result<RecordAction> getMpList(PageListQueryParam param) {
//		if (getPageCount() == 0) {
//			this.addDefaultPage();
//		}
//		SelectWhereStep<RecordAction> select = db().select().from(XCX_CUSTOMER_PAGE);
//		select = this.buildOptions(select, param);
//		select.orderBy(XCX_CUSTOMER_PAGE.PAGE_TYPE.desc(), XCX_CUSTOMER_PAGE.CREATE_TIME.desc());
//		return select.fetch();
//	}

	/**
	 * 设置首页(事务处理)
	 * 
	 * @param pageId
	 * @return
	 */
	public boolean setIndex(setIndexParam param) {
		this.transaction(() -> {
			db().update(XCX_CUSTOMER_PAGE)
					.set(XCX_CUSTOMER_PAGE.PAGE_TYPE, (byte) 0)
					.where(XCX_CUSTOMER_PAGE.PAGE_TYPE.eq((byte) 1))
					.execute();
			db().update(XCX_CUSTOMER_PAGE)
					.set(XCX_CUSTOMER_PAGE.PAGE_TYPE, (byte) 1)
					.where(XCX_CUSTOMER_PAGE.PAGE_ID.eq((param.getPageId())))
					.execute();
		});
		return true;
	}

	/**
	 * 获取页面分类信息
	 * 
	 * @return
	 */
	public List<PageClassificationVo> getPageCate() {
		List<PageClassificationVo> list = db().select(PAGE_CLASSIFICATION.ID, PAGE_CLASSIFICATION.NAME)
				.from(PAGE_CLASSIFICATION)
				.fetch().into(PageClassificationVo.class);
		return list;
	}

	/**
	 * 删除装修页面
	 * 
	 * @param param
	 * @return
	 */
	public int delXcxPage(PageClassificationVo param) {
		int result = db()
				.delete(XCX_CUSTOMER_PAGE)
				.where(XCX_CUSTOMER_PAGE.PAGE_ID.eq(param.getPageId()))
				.execute();
		return result;
	}

	/**
	 * 保存页面分类数据
	 * 
	 * @param param
	 * @param param
	 * @return
	 */
	public int setPageCate(PageClassificationVo param) {

		int result = db().update(XCX_CUSTOMER_PAGE)
				.set(XCX_CUSTOMER_PAGE.CAT_ID, param.getId())
				.where(XCX_CUSTOMER_PAGE.PAGE_ID.eq(param.getPageId()))
				.execute();
		return result;
	}

	/**
	 * 编辑保存
	 * 
	 * @param info
	 * @return
	 */
	public Boolean saveDecoration(XcxCustomerPageVo info) {
		XcxCustomerPageRecord record = db().newRecord(XCX_CUSTOMER_PAGE, info);
		int res = db().executeUpdate(record);
		if (res > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 获取首页
	 * 
	 * @return
	 */
	public XcxCustomerPageRecord getIndex() {
		return db().fetchAny(XCX_CUSTOMER_PAGE, XCX_CUSTOMER_PAGE.PAGE_TYPE.eq((byte) 1));
	}

	/**
	 * 克隆系统模板
	 * 
	 * @param templateId
	 * @return
	 */
	public XcxCustomerPageRecord cloneTemplate(Integer templateId) {
		DecorationTemplateRecord record = saas.shop.decoration.getRow(templateId);
		XcxCustomerPageRecord page = db().newRecord(XCX_CUSTOMER_PAGE);
		page.setPageContent(record.getPageContent());
		page.insert();
		return page;
	}

	/**
	 * 复制已有页面
	 * 
	 * @param copyId
	 * @return
	 */
	public Boolean copyDecoration(Integer pageId) {
		XcxCustomerPageRecord source = this.getPageById(pageId);
		XcxCustomerPageRecord page = db().newRecord(XCX_CUSTOMER_PAGE);
		page.setPageName(source.getPageName() + "+copy");
		page.setPageContent(source.getPageContent());
		page.setShopId(source.getShopId());
		page.setPageType(source.getPageType());
		page.setPageEnabled(source.getPageEnabled());
		page.setPageTplType(source.getPageTplType());
		page.setPageContent(source.getPageContent());
		page.setPagePublishContent(source.getPagePublishContent());
		page.setPageState(source.getPageState());
		page.setCatId(source.getCatId());
		page.insert();
		return true;
	}

	/**
	 * 获取分类下页面个数
	 * 
	 * @param catId
	 * @return
	 */
	public int getPageCount(Integer catId) {
		return db().fetchCount(XCX_CUSTOMER_PAGE, XCX_CUSTOMER_PAGE.CAT_ID.eq(catId));
	}

	/**
	 * 保存页面，包含添加和更新
	 * 
	 * @param page
	 * @return
	 */
	public XcxCustomerPageRecord storePage(PageStoreParam page) {
		page.setPageContent(processMapModule(page.getPageContent()));
		recordPageChange(page);
		XcxCustomerPageRecord record = db().newRecord(XCX_CUSTOMER_PAGE);

		record.setPageContent(page.getPageContent());
		record.setPageName(page.getPageName());
		record.setCatId(page.getCatId() == null ? 0 : page.getCatId());

		Byte toPublishState = 1;
		if (page.pageState.equals(toPublishState)) {
			record.setPagePublishContent(page.getPageContent());
		}
		if (page.pageId != null) {
			XcxCustomerPageRecord oldRecord = this.getPageById(page.pageId);
			record.setPageId((page.getPageId()));
			Byte toDraftState = 3;
			if (page.pageState.equals(toDraftState)) {
				record.setPageContent(oldRecord.getPagePublishContent());
			}
			record.update();
			return record;
		}

		record.insert();
		return record;
	}

	/**
	 * 处理Map模块
	 * 
	 * @param pageContent
	 * @return
	 */
	protected String processMapModule(String pageContent) {
		return pageContent;
	}

	/**
	 * 记录页面变化部分
	 * 
	 * @param page
	 */
	protected void recordPageChange(PageStoreParam page) {

	}

	/**
	 * 根据页面名称模糊查询满足条件的页面ID
	 * 
	 * @param sourcePage
	 * @return
	 */
	public List<Integer> getIdByName(String sourcePage) {
		List<Integer> idList = db().select(XCX_CUSTOMER_PAGE.PAGE_ID).from(XCX_CUSTOMER_PAGE)
				.where(XCX_CUSTOMER_PAGE.PAGE_NAME.like(this.likeValue(sourcePage))).fetchInto(Integer.class);
		return idList;
	}

	/**
	 * 得到前端装修页面信息
	 * 
	 * @param param
	 * @return
	 */
	public WxAppPageVo getPageInfo(WxAppPageParam param) {
		XcxCustomerPageRecord record = null;
		Integer pageId = param.getPageId();
		String pageContent;
		if (pageId == null || pageId == 0) {
			record = this.getIndex();
			pageId = record.getPageId();
			pageContent = param.getSceneId() != null && param.getSceneId() > 0 ? record.getPageContent()
					: record.getPagePublishContent();

		} else {
			record = this.getPageById(pageId);
			pageContent = record.getPagePublishContent();
		}

		ShopRecord shop = saas.shop.getShopById(this.getShopId());
		UserRecord userRecord = user.getUserByUserId(param.getUserId());

		Map<String, Object> pageInfo = convertPageContent(pageContent, userRecord);
		WxAppPageVo page = new WxAppPageVo();
		page.setPageInfo(pageInfo);
		page.setIsFirstPage(record.getPageType());
		page.setPageId(pageId);
		page.setSceneId(param.getSceneId());
		page.setPageName(record.getPageName());
		page.setPageType(record.getPageType());
//		this.setCollectInfo(page.getCollectInfo(), shop, userRecord);
		this.setShareConfig(page.getShareInfo());
		return page;
	}

	/**
	 * 设置用户收藏有礼信息
	 * 
	 * @param collectInfo
	 * @param userId
	 */
	protected void setCollectInfo(ShopCollectInfo collectInfo, ShopRecord shop, UserRecord userRecord) {
		CollectGiftParam collect = config.collectGiftConfigService.collectGiftConfig();
		collectInfo.setShopName(shop.getShopName());
		collectInfo.setLookCollectTime(userRecord.getLookCollectTime());
		collectInfo.setGetCollectGift(userRecord.getGetCollectGift());
		FieldsUtil.assignNotNull(collect, collectInfo);
	}

	/**
	 * 设置店铺分享配置
	 * 
	 * @param shareConfig
	 */
	protected void setShareConfig(ShareConfig shareConfig) {
		ShopShareConfig shopShareConfig = config.shopCommonConfigService.getShareConfig();
		if (shopShareConfig != null) {
			FieldsUtil.assignNotNull(shopShareConfig, shareConfig);
		}
		shareConfig.setShareTitle(shareConfig.getShareDoc());
	}

	/**
	 * 转换装修页面内容
	 * 
	 * @param pageContent
	 * @return
	 */
	protected Map<String, Object> convertPageContent(String pageContent, UserRecord user) {
		return convertPageContent(pageContent, null, user);
	}

	/**
	 * 转换装修页面内容
	 * 
	 * @param pageContent
	 * @param keyIdx
	 * @param user
	 * @return
	 */
	protected Map<String, Object> convertPageContent(String pageContent, String keyIdx, UserRecord user) {
		pageContent = StringUtils.isBlank(pageContent) ? "{}" : pageContent;
		Map<String, Object> result = new LinkedHashMap<>();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			JsonNode root = objectMapper.readTree(pageContent);
			Iterator<Entry<String, JsonNode>> elements = root.fields();

			while (elements.hasNext()) {
				Entry<String, JsonNode> node = elements.next();
				String key = node.getKey();
				if (keyIdx == null || key.equals(keyIdx)) {
					Object element = this.convertModule(objectMapper, node, user);
					result.put(key, element);
				}
			}
		} catch (Exception e) {
		}
		return result;
	}

	/**
	 * 转换模块，一些模块需要要转换，得到当前上数据
	 * 
	 * @param objectMapper
	 * @param node
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public Object convertModule(ObjectMapper objectMapper, Entry<String, JsonNode> node, UserRecord user)
			throws JsonParseException, JsonMappingException, IOException {
		if (node.getKey().startsWith("c_")) {
			String moduleName = node.getValue().get("module_name").asText();
			switch (moduleName) {
			case ModuleConstant.M_GOODS_GROUP:
				return this.convertGoodsGroup(objectMapper, node, user);
			/**
			 * TODO: 添加其他商品和营销模块，一些不需要转换的模块，可以走最后默认的转换。
			 */

			}
		}
		return objectMapper.readValue(node.getValue().toString(), Object.class);
	}

	/**
	 * 转换商品分组模块
	 * 
	 * @param objectMapper
	 * @param node
	 * @param user
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public ModuleGoodsGroup convertGoodsGroup(ObjectMapper objectMapper, Entry<String, JsonNode> node, UserRecord user)
			throws JsonParseException, JsonMappingException, IOException {
		ModuleGoodsGroup element = objectMapper.readValue(node.getValue().toString(), ModuleGoodsGroup.class);
		// TODO: 转换实时信息
		return element;
	}

}
