package com.vpu.mp.service.shop.goods;

import static com.vpu.mp.db.shop.Tables.GOODS;
import static com.vpu.mp.db.shop.Tables.GOODS_SPEC_PRODUCT;
import static com.vpu.mp.db.shop.tables.Sort.SORT;

import java.util.*;
import java.util.stream.Collectors;

import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.pojo.saas.category.SysCatevo;
import com.vpu.mp.service.pojo.shop.goods.goods.GoodsPageListParam;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.SelectConditionStep;
import org.jooq.SelectWhereStep;
import org.jooq.impl.DSL;
import org.jooq.tools.StringUtils;
import org.springframework.stereotype.Service;

import com.vpu.mp.db.shop.tables.records.SortRecord;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.goods.sort.GoodsSortListParam;
import com.vpu.mp.service.pojo.shop.goods.sort.Sort;

/**
 * @author 李晓冰
 * @date 2019年06月27日
 */
@Service

public class GoodsSortService extends ShopBaseService {

    /**
     * 根据父分类和分类类型查询
     *
     * @param param
     * @return
     */
    public List<Sort> getList(GoodsSortListParam param) {
        SelectWhereStep<Record> selectFrom = db().select().from(SORT);

        SelectConditionStep<?> select = this.buildOptions(selectFrom, param);

        select.orderBy(SORT.FIRST.desc(), SORT.CREATE_TIME.desc());

        List<Sort> sorts = select.fetchInto(Sort.class);

        return sorts;
    }

    /**
     * 根据分类id集合查询说所有分类
     * @param sortIds 分类id集合
     * @return 分类集合
     */
    public List<Sort> getList(List<Integer> sortIds) {
        return db().selectFrom(SORT).where(SORT.SORT_ID.in(sortIds)).fetchInto(Sort.class);
    }

    private SelectConditionStep<?> buildOptions(SelectWhereStep<?> select, GoodsSortListParam param) {
        List<Condition> list = new ArrayList<>(10);

        if (!StringUtils.isBlank(param.getSortName())) {
            list.add(SORT.SORT_NAME.like(likeValue(param.getSortName())));
        }

        if (param.getType() != null) {
            list.add(SORT.TYPE.eq(param.getType()));
        }

        if (param.getParentId() != null) {
            list.add(SORT.PARENT_ID.eq(param.getParentId()));
        }

        if (param.getStartCreateTime() != null) {
            list.add(SORT.CREATE_TIME.ge(param.getStartCreateTime()));
        }

        if (param.getEndCreateTime() != null) {
            list.add(SORT.CREATE_TIME.le(param.getEndCreateTime()));
        }

        return select.where(list);
    }

    /**
     * 查询出绑定了商品的的商家分类(如果是子分类则包含该分类的祖先级分类)
     * @return {@link com.vpu.mp.service.pojo.shop.goods.sort.Sort}
     */
    public List<Sort> getListBindedGoods(Condition condition,Integer selectType) {

        // 查询sortId 对应的所有sort集合，集合内都是相同的数据，仅仅是为了统计数量
        Map<Integer,List<Sort>> sortsMap = null;
        if (GoodsPageListParam.GOODS_LIST.equals(selectType)) {
            sortsMap = db().select(SORT.asterisk()).from(SORT).innerJoin(GOODS).on(SORT.SORT_ID.eq(GOODS.SORT_ID)).where(condition).fetch().intoGroups(SORT.SORT_ID, Sort.class);
        } else {
            sortsMap = db().select(SORT.asterisk()).from(SORT).innerJoin(GOODS).on(SORT.SORT_ID.eq(GOODS.SORT_ID))
                .innerJoin(GOODS_SPEC_PRODUCT).on(GOODS.GOODS_ID.eq(GOODS_SPEC_PRODUCT.GOODS_ID)).where(condition).fetch().intoGroups(SORT.SORT_ID,Sort.class);
        }

        // 临时存储当前查出来的sort数据
        List<Sort> tempData = new ArrayList<>(sortsMap.size());
        // 设置数据的商品数量并放置到sortIdMap中，为后期计算商品数量准备
        Map<Integer,Sort> sortIdMap=new HashMap<>(tempData.size());
        // 设置最初分类的商品或规格数量，并放入sortIdMap和tempData中
        for (Map.Entry<Integer, List<Sort>> entry : sortsMap.entrySet()) {
            Sort sort = entry.getValue().get(0);
            sort.setGoodsNumber(entry.getValue().size());
            sortIdMap.put(entry.getKey(),sort);
            tempData.add(sort);
        }
        // 返回的结果对象
        List<Sort> resultSort = new ArrayList<>(tempData.size());
        resultSort.addAll(tempData);

        // 迭代查询所有的祖先数据，并将祖先数据的商品或规格数全部设置为0
        while (tempData.size() > 0) {
            List<Integer> tempParentIds = new ArrayList<>(tempData.size());
            List<Integer> tempIds = new ArrayList<>(tempData.size());

            tempData.forEach(sort -> {
                tempParentIds.add(sort.getParentId());
                tempIds.add(sort.getSortId());

                if (sort.getGoodsNumber() == null) {
                    sort.setGoodsNumber(0);
                }
                sort.setGoodsNumberSum(sort.getGoodsNumber());
                sortIdMap.put(sort.getSortId(),sort);
            });
            tempData = db().select().from(SORT).where(SORT.SORT_ID.in(tempParentIds)).and(SORT.SORT_ID.notIn(tempIds)).fetchInto(Sort.class);

            resultSort.addAll(tempData);
        }
        // 迭代计算平台分类对应的所有商品或规格数量
        resultSort.forEach(sort -> {
            Integer baseNum = sort.getGoodsNumber();
            Sort parent = sortIdMap.get(sort.getParentId());
            while (parent != null) {
                parent.setGoodsNumberSum(parent.getGoodsNumberSum()+baseNum);
                parent = sortIdMap.get(parent.getParentId());
            }
        });
        // 根据first和creteTime 排序
        resultSort.sort((s1,s2)->{
            if (s1.getFirst().equals(s2.getFirst())){
                return s2.getCreateTime().compareTo(s1.getCreateTime());
            }
            return  s2.getFirst() - s1.getFirst();
        });

        return resultSort;
    }

    /**
     * 普通商家分类新增
     *
     * @param sort
     * @return 受影响行数
     */
    public void insert(Sort sort) {

        db().transaction(configuration -> {
            DSLContext db = DSL.using(configuration);
            //防止故意传递错误的类型
            sort.setType(Sort.NORMAL_TYPE_CODE);
            sort.setHasChild(Sort.HAS_NO_CHILD_CODE);

            //是二级分类
            if (sort.getParentId() != null && sort.getParentId() != 0) {
                db.update(SORT).set(SORT.HAS_CHILD, Sort.HAS_CHILD_CODE).where(SORT.SORT_ID.eq(sort.getParentId()))
                    .execute();
            }

            SortRecord sortRecord = db.newRecord(SORT, sort);

            sortRecord.insert();
        });

    }

    /**
     * 批量插入推荐分类
     * 默认列表中第一个分类为一级分类
     */
    public void insertRecommendSort(List<Sort> sorts) {
        transaction(() -> {
            DSLContext db = db();
            Sort parentSort = sorts.remove(0);

            //存在子分类
            if (sorts.size() > 0) {
                parentSort.setHasChild(Sort.HAS_CHILD_CODE);
            }
            parentSort.setType(Sort.RECOMMENT_TYPE_CODE);

            SortRecord parentRecord = db.newRecord(SORT, parentSort);
            parentRecord.insert();
            parentSort.setSortId(parentRecord.getSortId());

            List<SortRecord> sortRecords = new ArrayList<>(sorts.size());

            for (Sort sort : sorts) {
                sort.setType(Sort.RECOMMENT_TYPE_CODE);
                sort.setHasChild(Sort.HAS_NO_CHILD_CODE);

                sort.setParentId(parentSort.getSortId());
                SortRecord record = new SortRecord();
                assign(sort, record);
                sortRecords.add(record);
            }

            db.batchInsert(sortRecords).execute();
        });
    }

    /**
     * 商家分类名称是否存在，用来新增检查
     *
     * @param sort
     * @return
     */
    public boolean isSortNameExist(Sort sort) {
        Record1<Integer> countRecord = db().selectCount().from(SORT)
            .where(SORT.SORT_NAME.eq(sort.getSortName()))
            .fetchOne();

        Integer count = countRecord.getValue(0, Integer.class);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 商家分类名称是否存在，修改使用
     *
     * @param sort
     * @return
     */
    public boolean isOtherSortNameExist(Sort sort) {
        Record1<Integer> countRecord = db().selectCount().from(SORT)
            .where(SORT.SORT_NAME.eq(sort.getSortName())).and(SORT.SORT_ID.ne(sort.getSortId()))
            .fetchOne();

        Integer count = countRecord.getValue(0, Integer.class);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除商家分类
     *
     * @param sort
     * @return 受影响行数
     */
    public void delete(Sort sort) {

        Integer sortId = sort.getSortId();

        db().transaction(configuration -> {
            DSLContext db = DSL.using(configuration);

            Sort s = db.selectFrom(SORT).where(SORT.SORT_ID.eq(sortId)).fetchOneInto(Sort.class);

            if (s == null) {
                return;
            }

            db.delete(SORT).where(SORT.SORT_ID.eq(sortId)).execute();

            //是一级节点，有子分类
            if (s.getParentId() == 0 && s.getHasChild() != 0) {
                db.delete(SORT).where(SORT.PARENT_ID.eq(sortId)).execute();
            }

            //是子分类，查看是否需要修改父分类hasChild属性
            if (s.getParentId() != 0) {
                Record1<Integer> countRecord = db().selectCount().from(SORT).where(SORT.PARENT_ID.eq(s.getParentId())).fetchOne();
                if (countRecord.getValue(0, Integer.class) == 0) {
                    db.update(SORT).set(SORT.HAS_CHILD, Sort.HAS_NO_CHILD_CODE).where(SORT.SORT_ID.eq(s.getParentId())).execute();
                }
            }

        });
    }

    /**
     * 商家分类修改
     * @param sort
     */
    public void update(Sort sort) {

        //不允许修改父节点
        sort.setParentId(null);
        //不允许修改类型
        sort.setType(null);
        //不允许修改子节点情况
        sort.setHasChild(null);

        SortRecord sortRecord = new SortRecord();
        assign(sort, sortRecord);
        db().executeUpdate(sortRecord);
    }

    /**
     * 根据父节点查询所有子孙节点，包含传入节点
     * @param parentId
     * @return
     */
    public List<Integer> findChildrenByParentId(Integer parentId) {
        Integer[] children = new Integer[]{parentId};
        List<Integer> list = new ArrayList<>(children.length);
        do {
            for (Integer id : children) {
                list.add(id);
            }

            children = db().select(SORT.SORT_ID).from(SORT).where(SORT.PARENT_ID.in(children)).fetchArray(SORT.SORT_ID);

        } while (children.length > 0);

        return list;
    }

    /**
     * @param parentIds
     * @return
     */
    public List<Integer> findChildrenByParentId(List<Integer> parentIds) {
        Integer[] children = new Integer[parentIds.size()];
        for (int i = 0; i < parentIds.size(); i++) {
            children[i] = parentIds.get(i);
        }
        List<Integer> list = new ArrayList<>(children.length);
        do {
            for (Integer id : children) {
                list.add(id);
            }
            children = db().select(SORT.SORT_ID).from(SORT).where(SORT.PARENT_ID.in(children)).fetchArray(SORT.SORT_ID);

        } while (children.length > 0);

        Set set = new HashSet(list);

        return new ArrayList<>(set);
    }

}
