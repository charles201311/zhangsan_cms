package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsUser;

public interface UserService {

	// 注册
	int addUser(CmsUser user);

	// 校验用户唯一
	int selectCountByName(String username);

	// 修改
	int update(CmsUser user);

	// 登录
	CmsUser getUser(String username, String password);
	
	 //模糊查询列表
    List<Map> selectUserList(@Param("username") String username);

}
