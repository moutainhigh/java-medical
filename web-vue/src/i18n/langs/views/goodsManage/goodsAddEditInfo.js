// 用于商品的新增，修改，详情页的国际化
// 中文
export const cn = {
  toggleName: '展开/收起更多配置',
  linkDetail: '查看详情',
  linkRefresh: '刷新',
  editGoodsBasicInfo: '编辑商品信息',
  editGoodsDetailInfo: '编辑商品详情',
  editGoodsDistributionInfo: '编辑分销信息',
  saveAndReturnList: '保存后返回列表',
  previewStep: '上一步',
  nextStep: '下一步',
  saveAndAdd: '保存后继续添加',
  saveAndReview: '保存后预览商品',
  goodsAppView: '商品查看',
  continueAdd: '继续添加',
  returnToList: '返回列表',
  filter: '筛选',
  createTime: '创建时间',
  confirmBtn: '确定',
  cancelBtn: '取消',
  warningInfo: {
    requireGoodsName: '请输入商品名称',
    requirePlatformClassify: '请选择平台分类',
    requireGoodsImage: '请选择商品图片',
    requireGoodsUnit: '请选择商品单位',
    requireGoodsNumber: '请输入商品库存',
    requireGoodsPrice: '请输入商品价格',
    requireGoodsCostPrice: '请输入商品成本价格'
  },
  basicInfo: {
    title: '基本信息',
    goodsName: '商品名称：',
    goodsAd: '商品广告词：',
    goodsSn: '商品货号：',
    goodsSnTip: '不填则由系统自动生成货号',
    catId: '平台分类：',
    catIdTip: '“平台分类”是商品在系统中的属性，不会对用户展示。可在“基础配置”中设置默认平台分类。',
    catIdWarning: '请选择平台分类',
    catIdSelectDefault: '请选择平台分类',
    catIdGo: '前往',
    goodsImg: '商品主图：',
    goodsImgTip: '建议尺寸：800*800像素'
  },
  basicInfoOther: {
    unit: '单位：',
    unitOptions: ['个', '包', '箱', '袋', '套', '箱', '卷', '件', '台', '吨', '平方米', '本', '幅', '张', '支', '盒', '份', '令', '千克', '自定义'],
    unitTip: '长度限制为3个中文字符',
    sortId: '商家分类：',
    sortIdDefault: '请选择商家分类',
    goodsLabel: '商品标签：',
    goodsLabelDefault: '请选择商品标签',
    goodsLabelNew: '新建标签',
    goodsLabelManage: '管理标签',
    goodsBrand: '商品品牌：',
    goodsBrandAdd: '添加品牌',
    goodsBrandNew: '新建品牌',
    goodsBrandManage: '管理品牌',
    goodsBrandTitle: '添加品牌',
    goodsBrandName: '品牌名称',
    goodsBrandClassify: '品牌分类',
    goodsBrandClassifyDefault: '请选择',
    goodsVideo: '商品视频',
    goodsVideoTip: '上传视频仅支持MP4格式。为保障无线端各种网络环境下正常播放，只支持上传大小不超过10M，时长不超过3分钟的视频。'
  },
  stockAndPriceInfo: {
    title: '库存/价格信息',
    goodsPrd: '商品规格：',
    goodsPrdAdd: '添加规格',
    goodsSpecName: '规格名',
    goodsSpecVal: '规格值',
    goodsSpecValAdd: '添加规格值',
    goodsSpecAdd: '添加规格选项',
    goodsSpecPrice: '规格价格：',
    goodsSpecShopPrice: '价格(元)',
    goodsSpecShopCost: '成本价格(元)',
    goodsSpecGoodsNum: '库存',
    goodsSpecGoodsPrdSn: '规格编码',
    goodsSpecGoodsImg: '规格图片',
    batchUpdate: '批量设置',
    batchPrice: '价格',
    batchCost: '成本价格',
    batchNum: '库存',
    batchImgSrc: '规格图片',
    goodsNumber: '商品库存：',
    goodsNumberTip: '设置了规格库存商品库存将失效，不在前端展示',
    goodsShopPrice: '商品价格：',
    goodsShopPriceTip: '设置了规格价格商品价格将失效，不在前端展示',
    goodsMarketPrice: '市场价格：',
    goodsGradeMember: '会员价：',
    goodsGradeMemberTip: '会员价仅针对等级会员卡设定，非等级会员卡不可设置会员价。若等级会员卡也包含会员折扣，则会员价和会员折扣可同时享受，优先计算会员价',
    goodsGradeMemberSetting: '会员价设置：'
  },
  stockAndPriceInfoOther: {
    limitBuyNum: '最小限购数量：',
    limitBuyNumTip: '0或不填表示不限制购买数量',
    maxBuyNum: '最大限购数量：',
    maxBuyNumTip: '0或不填表示不限制购买数量',
    costPrice: '成本价格：',
    costPriceTip: '设置了规格成本价格商品价格将失效，不在前端展示',
    addSaleNum: '初始销量：',
    addSaleNumSetting: '设置后，您的用户看到的销量=初始销量+下单量，初始销量不计入统计。',
    goodsPrdSn: '商品规格编码：'
  },
  deliverAndOtherInfo: {
    title: '配送信息',
    deliverTemplate: '运费模板：',
    deliverTemplateRefresh: '刷新模板',
    deliverTemplateNew: '新建模板',
    deliverTemplateManage: '管理模板',
    pintAreaOtherDeliverFee: '全国其他区域运费：',
    pointAreaForFreeDeliverTemplate: '指定可配送区域运费：',
    pointConditionForFreeDeliverTemplate: '指定条件包邮可配送区域运费：',
    deliverTemplateDefault: '店铺默认运费模板',
    deliverTemplateUnit1: '件',
    deliverTemplateUnit2: '公斤',
    deliverTemplateTitleDesc1: '除可配送区域外，不可配送',
    deliverTemplateTitleDesc2: '内',
    deliverTemplateTitleDesc3: '元,每增加',
    deliverTemplateTitleDesc4: '，加',
    deliverTemplateTitleDesc5: '订单满',
    deliverTemplateTitleDesc6: '包邮，否则运费为',
    deliverTemplateTitleDesc7: '元',
    deliverTemplateTitleDesc8: '店铺统一运费：',
    deliverTemplateTitleDesc9: '元',
    deliverTemplateAreasDesc1: '内',
    deliverTemplateAreasDesc2: '元,每增加',
    deliverTemplateAreasDesc3: '，加',
    deliverTemplateAreasDesc4: '元',
    freeDeliverTemplateAreasDesc1: '内包邮',
    freeDeliverTemplateAreasDesc2: '满',
    freeDeliverTemplateAreasDesc3: '元包邮',
    freeDeliverTemplateAreasDesc4: '内，',
    freeDeliverTemplateAreasDesc5: '元包邮',
    goodsWeight: '商品重量：',
    deliverPlace: '发货地：',
    deliverPlaceTip: '最多15个字',
    otherTitle: '其他信息',
    memberCard: '会员专享商品：',
    memberCardTip: '用户持有会员卡才可购买此商品',
    chooseMemberCard: '请选择会员卡',
    memberCardNew: '新建会员卡',
    memberCardManage: '管理会员卡',
    memberCardSelected: '已选：',
    saleType: '上下架',
    saleNow: '立即上架售卖',
    saleOnTime: '自定义上架时间',
    saleTimeNotNll: '自定义时间不可为空',
    saleTimeCanNotBeBefore: '自定义时间不可早于当前时间',
    notSale: '暂不售卖放入仓库'
  },
  goodsDetail: {
    goodsDetailTitle: '商品详情',
    priceIcon: '￥',
    phoneNum: '库存：',
    phoneGoodsDesc: '商品描述',
    phoneGoodsDescTip1: '可在右侧编辑商品详情',
    phoneGoodsDescTip2: '未添加内容时,不显示此模块内容',
    phoneGoodsTempTip1: '自定义内容区域',
    phoneGoodsTempTip2: '可在右侧选择商品页模板',
    phoneGoodsTempTip3: '未添加内容时,不显示此模块内容',
    phoneGoodsTempTip4: '已选择模板:',
    goodsItemTitle: '商品基本信息',
    goodsItemStyleTip: '商品信息为固定样式仅供参考，请以实际效果为准',
    goodsItemPositionTitle: '模块位置',
    goodsItemPositionRadio1: '自定义内容在上',
    goodsItemPositionRadio2: '商品详情在上',
    goodsItemDecorateTitle: '自定义内容',
    goodsItemDecorateTitle2: '商品页模板',
    goodsItemDecorateBtn: '选择模板',
    goodsItemDecorateAdd: '添加模板',
    goodsItemDecoratePageName: '页面名称',
    goodsItemDecoratePageClassification: '页面分类',
    goodsItemDecoratePageSelector: '请输入页面名称',
    goodsItemDecoratePageSearch: '搜索',
    goodsItemDecoratePageCreateTime: '创建时间',
    goodsItemDecoratePageIsDefaultPage: '是否首页',
    goodsItemDecoratePageIsDefaultYes: '是',
    goodsItemDecoratePageIsDefaultNo: '否'
  },
  goodsDistribution: {
    distributionTitle: '分销改价：',
    distributionTitleTip: '允许分销员分销商品时修改商品售价',
    goodsPrice: '商品价格(元)',
    advicePrice: '建议售价(元)',
    minPrice: '最低售价(元)',
    maxPrice: '最高售价（元）',
    batchSetting: '批量设置：',
    lowestSetting: '最低售价：',
    highestSetting: '最高售价：',
    promotionTitle: '分销推广语：',
    promotionTitleTip: '分销员下载当前商品海报时将直接复制此推广语到手机剪贴板',
    promotionSwitchOn: '已开启',
    promotionSwitchOff: '已关闭',
    promotionLanguage: '推广语内容：',
    promotionLanguageTooLong: '推广语超长',
    promotionDocTooLong: '文档内容过长',
    shareGoodsAction: '商品分享海报：',
    shareGoodsActionRadio1: '默认样式',
    shareGoodsActionRadio2: '自定义样式',
    shareGoodsImgLinkLook: '查看示例',
    shareGoodsImgLinkDownload: '下载海报',
    shareGoodsDoc: '文案：',
    shareGoodsDocTip: '请输入15个以内的字符',
    shareGoodsImg: '分享图',
    shareGoodsImgRadio1: '商品主图',
    shareGoodsImgRadio2: '自定义图片'
  }
}
// 英文
export const en = {
  toggleName: 'Collapse more setting',
  linkDetail: 'Check details',
  linkRefresh: 'Refresh',
  editGoodsBasicInfo: 'Edit goods basic info',
  editGoodsDetailInfo: 'Edit goods detail info',
  editGoodsDistributionInfo: 'Edit goods distribution info',
  saveAndReturnList: 'Save and return to list',
  previewStep: 'Preview step',
  nextStep: 'Next step',
  saveAndAdd: 'Save and add',
  saveAndReview: 'Save and review',
  continueAdd: 'Continue add',
  returnToList: 'Return list',
  filter: 'Filter',
  createTime: 'Create time',
  confirmBtn: 'Confirm',
  cancelBtn: 'Cancel',
  warningInfo: {
    requireGoodsName: 'Require goods name',
    requirePlatformClassify: 'Require platform classify',
    requireGoodsImage: 'Require goods image',
    requireGoodsUnit: 'Require goods unit',
    requireGoodsNumber: 'Require goods number',
    requireGoodsPrice: 'Require goods price',
    requireGoodsCostPrice: 'Require goods cost price'
  },
  basicInfo: {
    title: 'basicinfo',
    goodsName: 'Goods name：',
    goodsAd: 'Goods advertisement：',
    goodsSn: 'Goods sn：',
    goodsSnTip: 'If not filled in, the system will automatically generate the article number',
    catId: 'Platform classification：',
    catIdTip: '“Platform classification”is goods\'s attributes in system，won\'t show for user.can be setted in “Basic Setting”for default setting。',
    catIdWarning: 'Choose Platform classification',
    catIdSelectDefault: 'Choose Platform classification',
    catIdGo: 'go',
    goodsImg: 'Goods main picture：',
    goodsImgTip: 'Advise Size：800*800px'
  },
  basicInfoOther: {
    unit: 'Unit：',
    unitOptions: ['individual', 'package', 'box', 'bug', 'stock', 'luggage', 'roll', 'sheet', 'stage', 'ton', 'square meter', 'capital', 'paire', 'pice', 'branch', 'case', 'part', 'rm', 'kg', 'custom'],
    unitTip: 'The length limit is 3 words',
    sortId: 'Merchant classification：',
    sortIdDefault: 'Choose Merchant classification',
    goodsLabel: 'Goods label：',
    goodsLabelDefault: 'Choose goods label',
    goodsLabelNew: 'Create label',
    goodsLabelManage: 'Management label',
    goodsBrand: 'Goods Brand：',
    goodsBrandAdd: 'Add Brand',
    goodsBrandNew: 'Create Brand',
    goodsBrandManage: 'Management Goods Brand',
    goodsBrandTitle: 'Add goods Brand',
    goodsBrandName: 'Brand name',
    goodsBrandClassify: 'Brand classification',
    goodsBrandClassifyDefault: 'Choose',
    goodsVideo: 'Goods video',
    goodsVideoTip: 'Uploading video only supports MP4 format.In order to ensure normal playback in various network environments at the wireless terminal, only video with upload size no more than 10M and duration no more than 3 minutes is supported'
  },
  stockAndPriceInfo: {
    title: 'Stock/Price Info',
    goodsPrd: 'Goods SKU：',
    goodsPrdAdd: 'Add goods SKU',
    goodsSpecName: 'SKU name',
    goodsSpecVal: 'SKU value',
    goodsSpecValAdd: 'Add SKU value',
    goodsSpecAdd: 'Add SKU',
    goodsSpecPrice: 'SKU Price：',
    goodsSpecShopPrice: 'Price(dollars)',
    goodsSpecShopCost: 'Cost price(dollars)',
    goodsSpecGoodsNum: 'Stock',
    goodsSpecGoodsPrdSn: 'SKU SN',
    goodsSpecGoodsImg: 'SKU Picture',
    batchUpdate: 'Batch Setting',
    batchPrice: 'Price',
    batchCost: 'Cost price',
    batchNum: 'Stock',
    batchImgSrc: 'SKU Picture',
    goodsNumber: 'Goods Stock：',
    goodsNumberTip: 'Set up the specification of inventory goods inventory will be invalid, not front - end display',
    goodsShopPrice: 'Goods price：',
    goodsMarketPrice: 'Market price：',
    goodsShopPriceTip: 'Set up the specification of inventory goods shop price will be invalid, not front - end display',
    goodsGradeMember: 'Membership price：',
    goodsGradeMemberTip: 'Membership price is only set for grade membership card, non-grade membership card can not set membership price.If the grade membership card also contains member discount, then member price and member discount can be enjoyed at the same time',
    goodsGradeMemberSetting: 'Membership price setting：'
  },
  stockAndPriceInfoOther: {
    limitBuyNum: 'Minimum purchase quantity：',
    limitBuyNumTip: '0 or no indicates no limit on purchase quantity',
    maxBuyNum: 'Maximum purchase quantity：',
    maxBuyNumTip: '0 or no indicates no limit on purchase quantity',
    costPrice: 'Cost price：',
    costPriceTip: 'Set up the specification of cost price the price will be invalid, not front - end display',
    addSaleNum: 'Initial sales：',
    addSaleNumSetting: 'After setting, the sales volume seen by your user = initial sales volume + order quantity, the initial sales volume is not counted into the statistics.',
    goodsPrdSn: 'Goods SKU SN：'
  },
  deliverAndOtherInfo: {
    title: 'Deliver info',
    deliverTemplate: 'Deliver template：',
    deliverTemplateRefresh: 'Refresh template',
    deliverTemplateNew: 'Create deliver template',
    deliverTemplateManage: 'Manage deliver template',
    pintAreaOtherDeliverFee: 'Area other deliver fee：',
    pointAreaForFreeDeliverTemplate: 'Point area for free deliver template：',
    pointConditionForFreeDeliverTemplate: 'Point condition for free deliver template：',
    deliverTemplateDefault: 'Shop default deliver template ',
    deliverTemplateUnit1: ' piece ',
    deliverTemplateUnit2: ' kg ',
    deliverTemplateTitleDesc1: ' Not available except in the distribution area ',
    deliverTemplateTitleDesc2: ' inner ',
    deliverTemplateTitleDesc3: ' dollar,peer add ',
    deliverTemplateTitleDesc4: ',add ',
    deliverTemplateTitleDesc5: ' order satisfy ',
    deliverTemplateTitleDesc6: ' free deliver，or the money is ',
    deliverTemplateTitleDesc7: ' dollar ',
    deliverTemplateTitleDesc8: ' Unified the fee：',
    deliverTemplateTitleDesc9: ' dollar ',
    deliverTemplateAreasDesc1: ' inner ',
    deliverTemplateAreasDesc2: ' dollar,peer add ',
    deliverTemplateAreasDesc3: ',add ',
    deliverTemplateAreasDesc4: ' dollar ',
    freeDeliverTemplateAreasDesc1: ' inner deliver for free ',
    freeDeliverTemplateAreasDesc2: 'satisfy ',
    freeDeliverTemplateAreasDesc3: ' dollar deliver for free ',
    freeDeliverTemplateAreasDesc4: ' inner，',
    freeDeliverTemplateAreasDesc5: ' dollar deliver for free ',
    goodsWeight: 'Goods weight：',
    deliverPlace: 'Ship address：',
    deliverPlaceTip: 'Max for 15 words',
    otherTitle: 'Other info',
    memberCard: 'membership exclusive card：',
    memberCardTip: 'Only user has this card can buy',
    chooseMemberCard: 'Choose member card',
    memberCardNew: 'Create member card',
    memberCardManage: 'Manage member card',
    memberCardSelected: 'Selected：',
    saleType: 'Sale time',
    saleNow: 'Sale right now',
    saleOnTime: 'Custom sale time',
    saleTimeNotNll: 'sale Time can not be null',
    saleTimeCanNotBeBefore: 'sale Time can not be before now',
    notSale: 'Not sale'
  },
  goodsDetail: {
    goodsDetailTitle: 'Goods info',
    priceIcon: '$',
    phoneNum: 'Stock',
    phoneGoodsDesc: 'Goods Desc',
    phoneGoodsDescTip1: 'Can edit the product details on the right',
    phoneGoodsDescTip2: 'When no content is added, the content of this module is not displayed',
    phoneGoodsTempTip1: 'Customize the content area',
    phoneGoodsTempTip2: 'Can select the product page template on the right',
    phoneGoodsTempTip3: 'When no content is added, the content of this module is not displayed',
    phoneGoodsTempTip4: 'Selected template:',
    goodsItemTitle: 'Goods basic info',
    goodsItemStyleTip: 'Product information is a fixed style for reference only, please refer to the actual effect',
    goodsItemPositionTitle: 'Module position',
    goodsItemPositionRadio1: 'Custom content is on top',
    goodsItemPositionRadio2: 'Goods detail info is on top',
    goodsItemDecorateTitle: 'Custom content',
    goodsItemDecorateTitle2: 'Goods page template',
    goodsItemDecorateBtn: 'Select template',
    goodsItemDecorateAdd: 'Add template',
    goodsItemDecoratePageName: 'Page name',
    goodsItemDecoratePageClassification: 'Page classification',
    goodsItemDecoratePageSelector: 'Enter page name',
    goodsItemDecoratePageSearch: 'Search',
    goodsItemDecoratePageCreateTime: 'Create time',
    goodsItemDecoratePageIsDefaultPage: 'Is first page',
    goodsItemDecoratePageIsDefaultYes: 'Yes',
    goodsItemDecoratePageIsDefaultNo: 'No'
  },
  goodsDistribution: {
    distributionTitle: 'Distribution change price:',
    distributionTitleTip: 'Allows the distributor to modify the price of a product while distributing it',
    goodsPrice: 'Goods price(dollar)',
    advicePrice: 'Advise price(dollar)',
    minPrice: 'Minimum price(dollar)',
    maxPrice: 'Maximum price(dollar)',
    promotionTitle: 'Distribution promotion language：',
    promotionTitleTip: 'The distributor will copy this message directly to the mobile clipboard when downloading the current product poster',
    promotionSwitchOn: 'ON',
    promotionSwitchOff: 'OFF',
    promotionLanguage: 'PromotionLanguage：',
    promotionLanguageTooLong: 'Promotion language too long',
    promotionDocTooLong: 'Promotion doc too long',
    shareGoodsAction: 'Goods share poster：',
    shareGoodsActionRadio1: 'Default style',
    shareGoodsActionRadio2: 'Customer style',
    shareGoodsImgLinkLook: 'Look example',
    shareGoodsImgLinkDownload: 'Download poster',
    shareGoodsDoc: 'Document：',
    shareGoodsDocTip: 'Please enter no more than 15 words',
    shareGoodsImg: 'Share poster',
    shareGoodsImgRadio1: 'Goods main picture',
    shareGoodsImgRadio2: 'Customer picture'
  }
}
