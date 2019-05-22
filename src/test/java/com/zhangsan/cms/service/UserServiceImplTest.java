package com.zhangsan.cms.service;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhangsan.cms.domain.CmsUser;

public class UserServiceImplTest extends JunitParent {
	
	@Autowired
	private UserService userService;

	@Test
	public void testAddUser() {
		CmsUser user = new CmsUser();
		user.setUsername("zhangsan");
		user.setPassword("123");
		user.setGender(1);
	//	int id = userService.addUser(user);
	
	}

	@Test
	public void testSelectCountByName() {
		int i = userService.selectCountByName("zhangsan");
		assertEquals(1,i );
	}

	@Test
	public void testUpdate() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testGetUser() {
	//	fail("Not yet implemented");
	}

}
