/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.GoodsImgRecord;

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
public class GoodsImg extends TableImpl<GoodsImgRecord> {

    private static final long serialVersionUID = 346306975;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_goods_img</code>
     */
    public static final GoodsImg GOODS_IMG = new GoodsImg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsImgRecord> getRecordType() {
        return GoodsImgRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_goods_img.img_id</code>.
     */
    public final TableField<GoodsImgRecord, Integer> IMG_ID = createField("img_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_img.goods_id</code>.
     */
    public final TableField<GoodsImgRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_img.img_url</code>.
     */
    public final TableField<GoodsImgRecord, String> IMG_URL = createField("img_url", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_img.img_desc</code>.
     */
    public final TableField<GoodsImgRecord, String> IMG_DESC = createField("img_desc", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_img.create_time</code>.
     */
    public final TableField<GoodsImgRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_img.update_time</code>. 最后修改时间
     */
    public final TableField<GoodsImgRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_goods_img</code> table reference
     */
    public GoodsImg() {
        this(DSL.name("b2c_goods_img"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_img</code> table reference
     */
    public GoodsImg(String alias) {
        this(DSL.name(alias), GOODS_IMG);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_img</code> table reference
     */
    public GoodsImg(Name alias) {
        this(alias, GOODS_IMG);
    }

    private GoodsImg(Name alias, Table<GoodsImgRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoodsImg(Name alias, Table<GoodsImgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GoodsImg(Table<O> child, ForeignKey<O, GoodsImgRecord> key) {
        super(child, key, GOODS_IMG);
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
        return Arrays.<Index>asList(Indexes.GOODS_IMG_GOODS_ID, Indexes.GOODS_IMG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsImgRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOODS_IMG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsImgRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_IMG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsImgRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsImgRecord>>asList(Keys.KEY_B2C_GOODS_IMG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImg as(String alias) {
        return new GoodsImg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImg as(Name alias) {
        return new GoodsImg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsImg rename(String name) {
        return new GoodsImg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsImg rename(Name name) {
        return new GoodsImg(name, null);
    }
}
