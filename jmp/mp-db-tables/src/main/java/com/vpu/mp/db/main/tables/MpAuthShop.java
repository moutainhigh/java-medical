/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.MpAuthShopRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpAuthShop extends TableImpl<MpAuthShopRecord> {

    private static final long serialVersionUID = -1734129219;

    /**
     * The reference instance of <code>mini_main.b2c_mp_auth_shop</code>
     */
    public static final MpAuthShop MP_AUTH_SHOP = new MpAuthShop();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpAuthShopRecord> getRecordType() {
        return MpAuthShopRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.app_id</code>. 授权小程序appId
     */
    public final TableField<MpAuthShopRecord, String> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false), this, "授权小程序appId");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.shop_id</code>.
     */
    public final TableField<MpAuthShopRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.nick_name</code>. 小程序昵称
     */
    public final TableField<MpAuthShopRecord, String> NICK_NAME = createField("nick_name", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "小程序昵称");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.user_name</code>. 授权方小程序的原始ID
     */
    public final TableField<MpAuthShopRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "授权方小程序的原始ID");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.alias</code>. 授权方小程序所设置的微信号，可为空
     */
    public final TableField<MpAuthShopRecord, String> ALIAS = createField("alias", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "授权方小程序所设置的微信号，可为空");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.verify_type_info</code>. 授权方认证类型，-1代表未认证，0代表微信认证
     */
    public final TableField<MpAuthShopRecord, String> VERIFY_TYPE_INFO = createField("verify_type_info", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "授权方认证类型，-1代表未认证，0代表微信认证");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.head_img</code>. 头像URL
     */
    public final TableField<MpAuthShopRecord, String> HEAD_IMG = createField("head_img", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "头像URL");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.func_info</code>. 权限集
     */
    public final TableField<MpAuthShopRecord, String> FUNC_INFO = createField("func_info", org.jooq.impl.SQLDataType.CLOB, this, "权限集");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.is_auth_ok</code>. 是否授权成功,如果小程序后台取消授权，则为0
     */
    public final TableField<MpAuthShopRecord, Byte> IS_AUTH_OK = createField("is_auth_ok", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否授权成功,如果小程序后台取消授权，则为0");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.last_auth_time</code>. 最后成功授权的时间
     */
    public final TableField<MpAuthShopRecord, Timestamp> LAST_AUTH_TIME = createField("last_auth_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后成功授权的时间");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.last_cancel_auth_time</code>. 最后取消授权的时间
     */
    public final TableField<MpAuthShopRecord, Timestamp> LAST_CANCEL_AUTH_TIME = createField("last_cancel_auth_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后取消授权的时间");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.create_time</code>.
     */
    public final TableField<MpAuthShopRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.qrcode_url</code>. 二维码图片的URL
     */
    public final TableField<MpAuthShopRecord, String> QRCODE_URL = createField("qrcode_url", org.jooq.impl.SQLDataType.VARCHAR(191), this, "二维码图片的URL");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.open_pay</code>. 是否开头微信支付
     */
    public final TableField<MpAuthShopRecord, Byte> OPEN_PAY = createField("open_pay", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否开头微信支付");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.open_card</code>. 是否开通微信卡券功能
     */
    public final TableField<MpAuthShopRecord, Byte> OPEN_CARD = createField("open_card", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否开通微信卡券功能");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.authorizer_info</code>. 授权者信息,json存储
     */
    public final TableField<MpAuthShopRecord, String> AUTHORIZER_INFO = createField("authorizer_info", org.jooq.impl.SQLDataType.CLOB, this, "授权者信息,json存储");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.authorization_info</code>. 授权详情,json存储
     */
    public final TableField<MpAuthShopRecord, String> AUTHORIZATION_INFO = createField("authorization_info", org.jooq.impl.SQLDataType.CLOB, this, "授权详情,json存储");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.pay_mch_id</code>. 支付商户号
     */
    public final TableField<MpAuthShopRecord, String> PAY_MCH_ID = createField("pay_mch_id", org.jooq.impl.SQLDataType.VARCHAR(191), this, "支付商户号");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.pay_key</code>. 支付密钥
     */
    public final TableField<MpAuthShopRecord, String> PAY_KEY = createField("pay_key", org.jooq.impl.SQLDataType.VARCHAR(191), this, "支付密钥");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.pay_cert_content</code>. 支付证书内容
     */
    public final TableField<MpAuthShopRecord, String> PAY_CERT_CONTENT = createField("pay_cert_content", org.jooq.impl.SQLDataType.CLOB, this, "支付证书内容");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.pay_key_content</code>. 支付私钥内容
     */
    public final TableField<MpAuthShopRecord, String> PAY_KEY_CONTENT = createField("pay_key_content", org.jooq.impl.SQLDataType.CLOB, this, "支付私钥内容");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.is_modify_domain</code>. 是否修改开发和业务域名，0未修改，1已修改
     */
    public final TableField<MpAuthShopRecord, Byte> IS_MODIFY_DOMAIN = createField("is_modify_domain", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否修改开发和业务域名，0未修改，1已修改");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.bind_template_id</code>. 绑定小程序的模板ID
     */
    public final TableField<MpAuthShopRecord, Integer> BIND_TEMPLATE_ID = createField("bind_template_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "绑定小程序的模板ID");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.upload_state</code>. 上传状态，0未上传，1已上传
     */
    public final TableField<MpAuthShopRecord, Byte> UPLOAD_STATE = createField("upload_state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "上传状态，0未上传，1已上传");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.last_upload_time</code>. 上传代码时间
     */
    public final TableField<MpAuthShopRecord, Timestamp> LAST_UPLOAD_TIME = createField("last_upload_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "上传代码时间");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.audit_id</code>. 最新的审核ID
     */
    public final TableField<MpAuthShopRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "最新的审核ID");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.audit_state</code>. 审核状态，0未提交，1审核中，2审核成功 3审核失败
     */
    public final TableField<MpAuthShopRecord, Byte> AUDIT_STATE = createField("audit_state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "审核状态，0未提交，1审核中，2审核成功 3审核失败");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.submit_audit_time</code>. 提交代码审核时间
     */
    public final TableField<MpAuthShopRecord, Timestamp> SUBMIT_AUDIT_TIME = createField("submit_audit_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "提交代码审核时间");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.audit_ok_time</code>. 审核通过时间
     */
    public final TableField<MpAuthShopRecord, Timestamp> AUDIT_OK_TIME = createField("audit_ok_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "审核通过时间");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.audit_fail_reason</code>. 未通过审核原因
     */
    public final TableField<MpAuthShopRecord, String> AUDIT_FAIL_REASON = createField("audit_fail_reason", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "未通过审核原因");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.publish_state</code>. 通过审核的小程序发布状态，0未发布，1已发布
     */
    public final TableField<MpAuthShopRecord, Byte> PUBLISH_STATE = createField("publish_state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "通过审核的小程序发布状态，0未发布，1已发布");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.publish_time</code>. 程序发布时间
     */
    public final TableField<MpAuthShopRecord, Timestamp> PUBLISH_TIME = createField("publish_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "程序发布时间");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.tester</code>. 小程序体验者列表,json存储
     */
    public final TableField<MpAuthShopRecord, String> TESTER = createField("tester", org.jooq.impl.SQLDataType.CLOB, this, "小程序体验者列表,json存储");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.test_qr_path</code>. 小程序体验二维码图片路径
     */
    public final TableField<MpAuthShopRecord, String> TEST_QR_PATH = createField("test_qr_path", org.jooq.impl.SQLDataType.VARCHAR(191), this, "小程序体验二维码图片路径");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.category</code>. 小程序可选类目,json存储
     */
    public final TableField<MpAuthShopRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.CLOB, this, "小程序可选类目,json存储");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.page_cfg</code>. 小程序页面配置,json存储
     */
    public final TableField<MpAuthShopRecord, String> PAGE_CFG = createField("page_cfg", org.jooq.impl.SQLDataType.CLOB, this, "小程序页面配置,json存储");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.principal_name</code>. 小程序的主体名称
     */
    public final TableField<MpAuthShopRecord, String> PRINCIPAL_NAME = createField("principal_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "小程序的主体名称");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.bind_open_app_id</code>. 绑定开放平台appId
     */
    public final TableField<MpAuthShopRecord, String> BIND_OPEN_APP_ID = createField("bind_open_app_id", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false), this, "绑定开放平台appId");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.link_official_app_id</code>. 关联公众号appId，用于发送模板消息
     */
    public final TableField<MpAuthShopRecord, String> LINK_OFFICIAL_APP_ID = createField("link_official_app_id", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false), this, "关联公众号appId，用于发送模板消息");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.is_sub_merchant</code>. 子商户模式,0：非子商户 1：微铺宝子商户 2：通联支付子商户,3: 微信国际支付
     */
    public final TableField<MpAuthShopRecord, Byte> IS_SUB_MERCHANT = createField("is_sub_merchant", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "子商户模式,0：非子商户 1：微铺宝子商户 2：通联支付子商户,3: 微信国际支付");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.union_pay_app_id</code>. 通联支付子商户appId
     */
    public final TableField<MpAuthShopRecord, String> UNION_PAY_APP_ID = createField("union_pay_app_id", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "通联支付子商户appId");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.union_pay_cus_id</code>. 通联支付子商户商户号
     */
    public final TableField<MpAuthShopRecord, String> UNION_PAY_CUS_ID = createField("union_pay_cus_id", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "通联支付子商户商户号");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.union_pay_app_key</code>. 通联支付子商户密钥
     */
    public final TableField<MpAuthShopRecord, String> UNION_PAY_APP_KEY = createField("union_pay_app_key", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "通联支付子商户密钥");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.fee_type</code>. 标价币种，国际支付字段
     */
    public final TableField<MpAuthShopRecord, String> FEE_TYPE = createField("fee_type", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("CNY", org.jooq.impl.SQLDataType.VARCHAR)), this, "标价币种，国际支付字段");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.merchant_category_code</code>. MCC码，国际支付字段
     */
    public final TableField<MpAuthShopRecord, String> MERCHANT_CATEGORY_CODE = createField("merchant_category_code", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "MCC码，国际支付字段");

    /**
     * The column <code>mini_main.b2c_mp_auth_shop.live_pack_status</code>. 直播包状态 1：通过 2：打包审核中
     */
    public final TableField<MpAuthShopRecord, Byte> LIVE_PACK_STATUS = createField("live_pack_status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "直播包状态 1：通过 2：打包审核中");

    /**
     * Create a <code>mini_main.b2c_mp_auth_shop</code> table reference
     */
    public MpAuthShop() {
        this(DSL.name("b2c_mp_auth_shop"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_auth_shop</code> table reference
     */
    public MpAuthShop(String alias) {
        this(DSL.name(alias), MP_AUTH_SHOP);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_auth_shop</code> table reference
     */
    public MpAuthShop(Name alias) {
        this(alias, MP_AUTH_SHOP);
    }

    private MpAuthShop(Name alias, Table<MpAuthShopRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpAuthShop(Name alias, Table<MpAuthShopRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpAuthShop(Table<O> child, ForeignKey<O, MpAuthShopRecord> key) {
        super(child, key, MP_AUTH_SHOP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniMain.MINI_MAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MP_AUTH_SHOP_AUDIT_STATE, Indexes.MP_AUTH_SHOP_BIND_TEMPLATE_ID, Indexes.MP_AUTH_SHOP_IS_AUTH_OK, Indexes.MP_AUTH_SHOP_LINK_OFFICIAL_APP_ID, Indexes.MP_AUTH_SHOP_PRIMARY, Indexes.MP_AUTH_SHOP_PRINCIPAL_NAME, Indexes.MP_AUTH_SHOP_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MpAuthShopRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MP_AUTH_SHOP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MpAuthShopRecord>> getKeys() {
        return Arrays.<UniqueKey<MpAuthShopRecord>>asList(Keys.KEY_B2C_MP_AUTH_SHOP_PRIMARY, Keys.KEY_B2C_MP_AUTH_SHOP_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpAuthShop as(String alias) {
        return new MpAuthShop(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpAuthShop as(Name alias) {
        return new MpAuthShop(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpAuthShop rename(String name) {
        return new MpAuthShop(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpAuthShop rename(Name name) {
        return new MpAuthShop(name, null);
    }
}
