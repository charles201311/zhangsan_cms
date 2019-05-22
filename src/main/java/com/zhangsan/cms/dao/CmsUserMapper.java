package com.zhangsan.cms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsUser;

public interface CmsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsUser record);

    int insertSelective(CmsUser record);

    CmsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsUser record);

    int updateByPrimaryKey(CmsUser record);
    
 // 校验用户唯一
 	int selectCountByName(String username);
 	
 // 登录
 	CmsUser getUser(@Param("username")String username, @Param("password")String password);
   //模糊查询列表
    List<Map> selectUserList(@Param("username") String username);
    
    
}



