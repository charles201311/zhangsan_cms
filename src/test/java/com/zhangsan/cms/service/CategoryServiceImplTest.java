package com.zhangsan.cms.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

public class CategoryServiceImplTest extends JunitParent {
	
	@Resource
    private CategoryService categoryService;
	@Test
	public void testSelectCategoryByChannel() {
		
		List<Map> list = categoryService.selectCategoryByChannel(4);
		//断言
		assertEquals(3, list.size());
		
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

}
