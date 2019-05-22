package com.zhangsan.cms.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhangsan.cms.domain.CmsArticle;

public class ArticleServiceImplTest extends JunitParent {
	@Autowired
	  private ArticleService  articleService;

	@Test
	public void testSelectArticleByHot() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectArticleByChannel() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectArticleByCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		CmsArticle a = new CmsArticle();
		a.setTitle("如果5G时代到来了，普通人有哪些创业机会？？");
		a.setContent("4G改变生活，5G改变时代”！种种迹象表明，5G网络将会给我们带来很多改变。目前，5G网络已经上升到国家战略。这么火的领域，创业者该如何在5G浪潮中抢占先机?"
				+ "笔者认为，19年5G网络依然停留在实验网和预商用网的建设，之前设想的20年普及5G网络也只是在北上广深等一线城市才有的待遇，如果是三四线甚至四五线的中小型城市那就不知道要等到猴年马月了。所以，抓住这个时间差和信息差，创业者就能在5G这个风口上一飞冲天。");
		a.setHot(1);
		a.setChannelId(1);
		a.setCategoryId(4);
		a.setStatus(0);
		a.setHits(0);
		a.setUserId(1);
		int i = articleService.insertSelective(a);
		assertEquals(1, i);
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

}
