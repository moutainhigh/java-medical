/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CommentServiceRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class CommentService extends TableImpl<CommentServiceRecord> {

    private static final long serialVersionUID = -1355114884;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_comment_service</code>
     */
    public static final CommentService COMMENT_SERVICE = new CommentService();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentServiceRecord> getRecordType() {
        return CommentServiceRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.id</code>.
     */
    public final TableField<CommentServiceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.store_id</code>. 门店id
     */
    public final TableField<CommentServiceRecord, Integer> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "门店id");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.technician_id</code>. 技师id
     */
    public final TableField<CommentServiceRecord, Integer> TECHNICIAN_ID = createField("technician_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "技师id");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.user_id</code>. 用户id
     */
    public final TableField<CommentServiceRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.commstar</code>. 评价星级
     */
    public final TableField<CommentServiceRecord, Byte> COMMSTAR = createField("commstar", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "评价星级");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.user_score</code>. 评价可得积分
     */
    public final TableField<CommentServiceRecord, Integer> USER_SCORE = createField("user_score", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "评价可得积分");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.anonymousflag</code>. 匿名状态 0.未匿名；1.匿名
     */
    public final TableField<CommentServiceRecord, Byte> ANONYMOUSFLAG = createField("anonymousflag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "匿名状态 0.未匿名；1.匿名");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.commtag</code>. 评价标签
     */
    public final TableField<CommentServiceRecord, String> COMMTAG = createField("commtag", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "评价标签");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.service_id</code>. 服务id
     */
    public final TableField<CommentServiceRecord, Integer> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "服务id");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.order_sn</code>. 订单编号
     */
    public final TableField<CommentServiceRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "订单编号");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.comm_note</code>. 评论内容
     */
    public final TableField<CommentServiceRecord, String> COMM_NOTE = createField("comm_note", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "评论内容");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.comm_img</code>. 评论图片
     */
    public final TableField<CommentServiceRecord, String> COMM_IMG = createField("comm_img", org.jooq.impl.SQLDataType.VARCHAR(1000).defaultValue(org.jooq.impl.DSL.inline("[]", org.jooq.impl.SQLDataType.VARCHAR)), this, "评论图片");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.create_time</code>.
     */
    public final TableField<CommentServiceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.update_time</code>. 最后修改时间
     */
    public final TableField<CommentServiceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.flag</code>. 0:未审批,1:审批通过,2:审批未通过
     */
    public final TableField<CommentServiceRecord, Byte> FLAG = createField("flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未审批,1:审批通过,2:审批未通过");

    /**
     * The column <code>mini_shop_471752.b2c_comment_service.del_flag</code>. 1:删除
     */
    public final TableField<CommentServiceRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:删除");

    /**
     * Create a <code>mini_shop_471752.b2c_comment_service</code> table reference
     */
    public CommentService() {
        this(DSL.name("b2c_comment_service"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_comment_service</code> table reference
     */
    public CommentService(String alias) {
        this(DSL.name(alias), COMMENT_SERVICE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_comment_service</code> table reference
     */
    public CommentService(Name alias) {
        this(alias, COMMENT_SERVICE);
    }

    private CommentService(Name alias, Table<CommentServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private CommentService(Name alias, Table<CommentServiceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CommentService(Table<O> child, ForeignKey<O, CommentServiceRecord> key) {
        super(child, key, COMMENT_SERVICE);
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
        return Arrays.<Index>asList(Indexes.COMMENT_SERVICE_ORDER_SN, Indexes.COMMENT_SERVICE_PRIMARY, Indexes.COMMENT_SERVICE_SERVICE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommentServiceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENT_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommentServiceRecord> getPrimaryKey() {
        return Keys.KEY_B2C_COMMENT_SERVICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommentServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentServiceRecord>>asList(Keys.KEY_B2C_COMMENT_SERVICE_PRIMARY, Keys.KEY_B2C_COMMENT_SERVICE_ORDER_SN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentService as(String alias) {
        return new CommentService(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentService as(Name alias) {
        return new CommentService(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CommentService rename(String name) {
        return new CommentService(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CommentService rename(Name name) {
        return new CommentService(name, null);
    }
}
