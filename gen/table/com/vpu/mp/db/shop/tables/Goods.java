/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.GoodsRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Goods extends TableImpl<GoodsRecord> {

    private static final long serialVersionUID = -699169440;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_goods</code>
     */
    public static final Goods GOODS = new Goods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsRecord> getRecordType() {
        return GoodsRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_id</code>.
     */
    public final TableField<GoodsRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.shop_id</code>. 店铺id
     */
    public final TableField<GoodsRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_goods.cat_id</code>.
     */
    public final TableField<GoodsRecord, Integer> CAT_ID = createField("cat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_sn</code>.
     */
    public final TableField<GoodsRecord, String> GOODS_SN = createField("goods_sn", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_name</code>.
     */
    public final TableField<GoodsRecord, String> GOODS_NAME = createField("goods_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.brand_id</code>. 品牌id
     */
    public final TableField<GoodsRecord, Integer> BRAND_ID = createField("brand_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "品牌id");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_ad</code>. 广告词
     */
    public final TableField<GoodsRecord, String> GOODS_AD = createField("goods_ad", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "广告词");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_number</code>. 库存
     */
    public final TableField<GoodsRecord, Integer> GOODS_NUMBER = createField("goods_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "库存");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_weight</code>.
     */
    public final TableField<GoodsRecord, BigDecimal> GOODS_WEIGHT = createField("goods_weight", org.jooq.impl.SQLDataType.DECIMAL(10, 3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.market_price</code>.
     */
    public final TableField<GoodsRecord, BigDecimal> MARKET_PRICE = createField("market_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.shop_price</code>.
     */
    public final TableField<GoodsRecord, BigDecimal> SHOP_PRICE = createField("shop_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.cost_price</code>. 成本价
     */
    public final TableField<GoodsRecord, BigDecimal> COST_PRICE = createField("cost_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "成本价");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_desc</code>.
     */
    public final TableField<GoodsRecord, String> GOODS_DESC = createField("goods_desc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_img</code>.
     */
    public final TableField<GoodsRecord, String> GOODS_IMG = createField("goods_img", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.is_on_sale</code>. 是否在售，1在售，0下架
     */
    public final TableField<GoodsRecord, Byte> IS_ON_SALE = createField("is_on_sale", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否在售，1在售，0下架");

    /**
     * The column <code>mini_shop_471752.b2c_goods.del_flag</code>.
     */
    public final TableField<GoodsRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_type</code>. 商品类型，0普通商品，1拼团商品，2分销，3砍价商品 4积分商品 5秒杀商品
     */
    public final TableField<GoodsRecord, Byte> GOODS_TYPE = createField("goods_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "商品类型，0普通商品，1拼团商品，2分销，3砍价商品 4积分商品 5秒杀商品");

    /**
     * The column <code>mini_shop_471752.b2c_goods.deliver_template_id</code>. 运费模板id
     */
    public final TableField<GoodsRecord, Integer> DELIVER_TEMPLATE_ID = createField("deliver_template_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "运费模板id");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_sale_num</code>. 销售数量
     */
    public final TableField<GoodsRecord, Integer> GOODS_SALE_NUM = createField("goods_sale_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "销售数量");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_collect_num</code>. 收藏数量
     */
    public final TableField<GoodsRecord, Integer> GOODS_COLLECT_NUM = createField("goods_collect_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "收藏数量");

    /**
     * The column <code>mini_shop_471752.b2c_goods.create_time</code>.
     */
    public final TableField<GoodsRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.update_time</code>. 最后修改时间
     */
    public final TableField<GoodsRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_goods.state</code>. 审核状态,0待审核 1 审核通过 2 违规下架
     */
    public final TableField<GoodsRecord, Byte> STATE = createField("state", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "审核状态,0待审核 1 审核通过 2 违规下架");

    /**
     * The column <code>mini_shop_471752.b2c_goods.reason</code>. 违规下架原因
     */
    public final TableField<GoodsRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.CLOB, this, "违规下架原因");

    /**
     * The column <code>mini_shop_471752.b2c_goods.sub_account_id</code>. 子帐号id，主要用于官方店铺
     */
    public final TableField<GoodsRecord, Integer> SUB_ACCOUNT_ID = createField("sub_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "子帐号id，主要用于官方店铺");

    /**
     * The column <code>mini_shop_471752.b2c_goods.sale_time</code>. 上架时间
     */
    public final TableField<GoodsRecord, Timestamp> SALE_TIME = createField("sale_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "上架时间");

    /**
     * The column <code>mini_shop_471752.b2c_goods.limit_buy_num</code>. 最少起购数量，0不限购
     */
    public final TableField<GoodsRecord, Integer> LIMIT_BUY_NUM = createField("limit_buy_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "最少起购数量，0不限购");

    /**
     * The column <code>mini_shop_471752.b2c_goods.unit</code>. 商品单位
     */
    public final TableField<GoodsRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品单位");

    /**
     * The column <code>mini_shop_471752.b2c_goods.add_sale_num</code>. 虚假销量
     */
    public final TableField<GoodsRecord, Integer> ADD_SALE_NUM = createField("add_sale_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "虚假销量");

    /**
     * The column <code>mini_shop_471752.b2c_goods.limit_max_num</code>. 最多起购数量，0不限购
     */
    public final TableField<GoodsRecord, Integer> LIMIT_MAX_NUM = createField("limit_max_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "最多起购数量，0不限购");

    /**
     * The column <code>mini_shop_471752.b2c_goods.sale_type</code>. 上架状态,0立即上架， 1审核通过 2 加入仓库
     */
    public final TableField<GoodsRecord, Byte> SALE_TYPE = createField("sale_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "上架状态,0立即上架， 1审核通过 2 加入仓库");

    /**
     * The column <code>mini_shop_471752.b2c_goods.sort_id</code>.
     */
    public final TableField<GoodsRecord, Integer> SORT_ID = createField("sort_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_video</code>. 视频
     */
    public final TableField<GoodsRecord, String> GOODS_VIDEO = createField("goods_video", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "视频");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_video_img</code>. 视频首图
     */
    public final TableField<GoodsRecord, String> GOODS_VIDEO_IMG = createField("goods_video_img", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "视频首图");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_video_size</code>. 视频尺寸
     */
    public final TableField<GoodsRecord, Integer> GOODS_VIDEO_SIZE = createField("goods_video_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "视频尺寸");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_video_id</code>. 视频id
     */
    public final TableField<GoodsRecord, Integer> GOODS_VIDEO_ID = createField("goods_video_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "视频id");

    /**
     * The column <code>mini_shop_471752.b2c_goods.goods_page_id</code>. 详情页装修模板id
     */
    public final TableField<GoodsRecord, Integer> GOODS_PAGE_ID = createField("goods_page_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "详情页装修模板id");

    /**
     * The column <code>mini_shop_471752.b2c_goods.is_page_up</code>. 是否在文本区域上方
     */
    public final TableField<GoodsRecord, Byte> IS_PAGE_UP = createField("is_page_up", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否在文本区域上方");

    /**
     * The column <code>mini_shop_471752.b2c_goods.is_card_exclusive</code>. 是否会员卡专属
     */
    public final TableField<GoodsRecord, Byte> IS_CARD_EXCLUSIVE = createField("is_card_exclusive", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否会员卡专属");

    /**
     * The column <code>mini_shop_471752.b2c_goods.base_sale</code>. 初始销量
     */
    public final TableField<GoodsRecord, Integer> BASE_SALE = createField("base_sale", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "初始销量");

    /**
     * The column <code>mini_shop_471752.b2c_goods.source</code>. 商品来源,0：店铺自带；1、2..等：不同类型店铺第三方抓取自带商品来源
     */
    public final TableField<GoodsRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "商品来源,0：店铺自带；1、2..等：不同类型店铺第三方抓取自带商品来源");

    /**
     * The column <code>mini_shop_471752.b2c_goods.is_control_price</code>. 是否控价：0不控价，1控价（不可修改价格）
     */
    public final TableField<GoodsRecord, Byte> IS_CONTROL_PRICE = createField("is_control_price", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否控价：0不控价，1控价（不可修改价格）");

    /**
     * The column <code>mini_shop_471752.b2c_goods.can_rebate</code>. 是否分销改价
     */
    public final TableField<GoodsRecord, Byte> CAN_REBATE = createField("can_rebate", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否分销改价");

    /**
     * Create a <code>mini_shop_471752.b2c_goods</code> table reference
     */
    public Goods() {
        this(DSL.name("b2c_goods"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods</code> table reference
     */
    public Goods(String alias) {
        this(DSL.name(alias), GOODS);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods</code> table reference
     */
    public Goods(Name alias) {
        this(alias, GOODS);
    }

    private Goods(Name alias, Table<GoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Goods(Name alias, Table<GoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Goods(Table<O> child, ForeignKey<O, GoodsRecord> key) {
        super(child, key, GOODS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_471752.MINI_SHOP_471752;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GOODS_CAT_ID, Indexes.GOODS_GOODS_ID, Indexes.GOODS_GOODS_ID_2, Indexes.GOODS_GOODS_SN, Indexes.GOODS_PRIMARY, Indexes.GOODS_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsRecord>>asList(Keys.KEY_B2C_GOODS_PRIMARY, Keys.KEY_B2C_GOODS_GOODS_ID, Keys.KEY_B2C_GOODS_GOODS_SN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Goods as(String alias) {
        return new Goods(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Goods as(Name alias) {
        return new Goods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Goods rename(String name) {
        return new Goods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Goods rename(Name name) {
        return new Goods(name, null);
    }
}
