package com.vpu.mp.service.saas.article;

import static com.vpu.mp.db.main.tables.Article.ARTICLE;
import static com.vpu.mp.db.main.tables.ArticleCategory.ARTICLE_CATEGORY;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.SelectSeekStep1;
import org.jooq.SelectWhereStep;
import org.jooq.impl.DSL;
import org.jooq.tools.StringUtils;
import org.springframework.stereotype.Service;

import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.foundation.service.MainBaseService;
import com.vpu.mp.service.foundation.util.Page;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.saas.article.category.ArtCategoryListQuertParam;
import com.vpu.mp.service.pojo.saas.article.category.ArticleCategoryParam;
import com.vpu.mp.service.pojo.saas.article.category.ArticleCategoryVo;
import com.vpu.mp.service.pojo.saas.article.category.ArticlesClass;

/**
 * 文章分类业务逻辑
 * @author 新国、wangshuai
 *
 */
@Service

public class ArticleCategoryService extends MainBaseService {
	
	/**
	 * 分页查询文章分类
	 * 
	 */
	public PageResult<ArticleCategoryVo> getPageList(ArtCategoryListQuertParam param) {
		SelectWhereStep<Record2<Integer, String>> select = db().select(
				ARTICLE_CATEGORY.CATEGORY_ID,
				ARTICLE_CATEGORY.CATEGORY_NAME
				).from(ARTICLE_CATEGORY);
		if(!StringUtils.isEmpty(param.getKeyWord())) {
			select.where(ARTICLE_CATEGORY.CATEGORY_NAME.like(likeValue(param.getKeyWord())));
		}
		select.orderBy(ARTICLE_CATEGORY.CATEGORY_ID.asc());	
		return getPageResult(select,param.getCurrentPage(),param.getPageRows(),ArticleCategoryVo.class);

	}
	
	
	/**
	 * 查询文章分类,不分类
	 * 
	 */
	public List<ArticleCategoryVo> getCategoryList() {
		SelectSeekStep1<Record2<Integer, String>, Integer> select = db().select(
				ARTICLE_CATEGORY.CATEGORY_ID,
				ARTICLE_CATEGORY.CATEGORY_NAME
				).from(ARTICLE_CATEGORY).orderBy(ARTICLE_CATEGORY.CATEGORY_ID.asc());
		Result<Record2<Integer, String>> fetch = select.fetch();
		List<ArticleCategoryVo> into =new ArrayList<ArticleCategoryVo>();
		if(fetch!=null) {
			 into = fetch.into(ArticleCategoryVo.class);
		}
		return into;
	}
	/**
	 * 文章类型新增
	 * @param arArticleCategory
	 * @return
	 */
	
	public boolean insertArticleCategory(ArticleCategoryParam arArticleCategory) {
		Byte useFooterNav=-1;
		if(StringUtils.isEmpty(arArticleCategory.getUseFooterNav())) {
			return false;
		}
		String useFooterNav2 = arArticleCategory.getUseFooterNav();
		if(useFooterNav2.equals(ArticlesClass.OK)) {
			useFooterNav=1;
		}
		if(useFooterNav2.equals(ArticlesClass.CANCEL)) {
			useFooterNav=0;
		}
		if(useFooterNav.equals(ArticlesClass.cuo)) {
			return false;
		}
		int num = db().insertInto(ARTICLE_CATEGORY)
				.set(ARTICLE_CATEGORY.CATEGORY_NAME, arArticleCategory.getCategoryName())
				.set(ARTICLE_CATEGORY.USE_FOOTER_NAV, useFooterNav).execute();
		return num > 0 ? true : false;
	}
	
	/**
	 * 删除文章分类
	 * @param arArticleCategory
	 * @return
	 */
	public boolean deleteArticleCategory(ArticleCategoryParam arArticleCategory) {
		int execute = db().deleteFrom(ARTICLE_CATEGORY)
				.where(ARTICLE_CATEGORY.CATEGORY_ID.eq(arArticleCategory.getCategoryId())
						.and(ARTICLE_CATEGORY.CATEGORY_NAME.eq(arArticleCategory.getCategoryName())))
				.execute();
		return execute > 0 ? true : false;

	}

	public boolean updateArticleCategory(ArticleCategoryParam arArticleCategory) {
		int num = db().update(ARTICLE_CATEGORY)
			.set(ARTICLE_CATEGORY.CATEGORY_NAME, arArticleCategory.getCategoryName()).where(ARTICLE_CATEGORY.CATEGORY_ID.eq(arArticleCategory.getCategoryId())).execute();
		return  num > 0 ? true : false;
	}
	
	/**
	 * 查询分类下有多少文章,删除之前给提示用
	 * @param arArticleCategory
	 * @return
	 */
	public int findNumByCategory(ArticleCategoryParam arArticleCategory) {
		Result<Record1<Integer>> fetch = db()
				.select(ARTICLE.ARTICLE_ID).from(ARTICLE, ARTICLE_CATEGORY).where(
						ARTICLE.CATEGORY_ID.eq(ARTICLE_CATEGORY.CATEGORY_ID)
								.and(ARTICLE_CATEGORY.CATEGORY_ID.eq(arArticleCategory.getCategoryId())
										.and(ARTICLE_CATEGORY.CATEGORY_NAME.eq(arArticleCategory.getCategoryName()))))
				.fetch();
		int size = 0;
		if(fetch!=null) {
			size=fetch.size();
		}
		return size;
	}
	
	/**
	 * 判断该文章分类是否存在
	 * 
	 */
	public boolean isExist(String categoryName) {
		int num = db().fetchCount(ARTICLE_CATEGORY,ARTICLE_CATEGORY.CATEGORY_NAME.eq(categoryName));
		return num > 0 ? true : false;
	}
}
