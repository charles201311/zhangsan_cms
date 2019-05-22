package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangsan.cms.dao.CmsUserMapper;
import com.zhangsan.cms.domain.CmsUser;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private CmsUserMapper userMapper;

	@Override
	public int addUser(CmsUser user) {
		return userMapper.insertSelective(user);
	}

	@Override
	public int selectCountByName(String username) {
		
		return userMapper.selectCountByName(username);
	}

	@Override
	public int update(CmsUser user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public CmsUser getUser(String username, String password) {
		return userMapper.getUser(username, password);
	}

	@Override
	public List<Map> selectUserList(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectUserList(username);
	}

}
