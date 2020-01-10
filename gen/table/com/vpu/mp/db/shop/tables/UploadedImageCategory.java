/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UploadedImageCategoryRecord;

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
public class UploadedImageCategory extends TableImpl<UploadedImageCategoryRecord> {

    private static final long serialVersionUID = 812405195;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_uploaded_image_category</code>
     */
    public static final UploadedImageCategory UPLOADED_IMAGE_CATEGORY = new UploadedImageCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UploadedImageCategoryRecord> getRecordType() {
        return UploadedImageCategoryRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.img_cat_id</code>.
     */
    public final TableField<UploadedImageCategoryRecord, Integer> IMG_CAT_ID = createField("img_cat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.shop_id</code>. 店铺id
     */
    public final TableField<UploadedImageCategoryRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.img_cat_name</code>.
     */
    public final TableField<UploadedImageCategoryRecord, String> IMG_CAT_NAME = createField("img_cat_name", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.img_cat_parent_id</code>.
     */
    public final TableField<UploadedImageCategoryRecord, Integer> IMG_CAT_PARENT_ID = createField("img_cat_parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.cat_ids</code>. 层级id串,逗号分隔
     */
    public final TableField<UploadedImageCategoryRecord, String> CAT_IDS = createField("cat_ids", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "层级id串,逗号分隔");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.level</code>. 层级，0开始
     */
    public final TableField<UploadedImageCategoryRecord, Byte> LEVEL = createField("level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "层级，0开始");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.sort</code>. 排序优先级
     */
    public final TableField<UploadedImageCategoryRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "排序优先级");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.create_time</code>.
     */
    public final TableField<UploadedImageCategoryRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_image_category.update_time</code>. 最后修改时间
     */
    public final TableField<UploadedImageCategoryRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_uploaded_image_category</code> table reference
     */
    public UploadedImageCategory() {
        this(DSL.name("b2c_uploaded_image_category"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_uploaded_image_category</code> table reference
     */
    public UploadedImageCategory(String alias) {
        this(DSL.name(alias), UPLOADED_IMAGE_CATEGORY);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_uploaded_image_category</code> table reference
     */
    public UploadedImageCategory(Name alias) {
        this(alias, UPLOADED_IMAGE_CATEGORY);
    }

    private UploadedImageCategory(Name alias, Table<UploadedImageCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private UploadedImageCategory(Name alias, Table<UploadedImageCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UploadedImageCategory(Table<O> child, ForeignKey<O, UploadedImageCategoryRecord> key) {
        super(child, key, UPLOADED_IMAGE_CATEGORY);
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
        return Arrays.<Index>asList(Indexes.UPLOADED_IMAGE_CATEGORY_PRIMARY, Indexes.UPLOADED_IMAGE_CATEGORY_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UploadedImageCategoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_UPLOADED_IMAGE_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UploadedImageCategoryRecord> getPrimaryKey() {
        return Keys.KEY_B2C_UPLOADED_IMAGE_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UploadedImageCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<UploadedImageCategoryRecord>>asList(Keys.KEY_B2C_UPLOADED_IMAGE_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageCategory as(String alias) {
        return new UploadedImageCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageCategory as(Name alias) {
        return new UploadedImageCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UploadedImageCategory rename(String name) {
        return new UploadedImageCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UploadedImageCategory rename(Name name) {
        return new UploadedImageCategory(name, null);
    }
}
