package com.zhangsan.cms.dao;

import com.zhangsan.cms.domain.CmsSettings;

public interface CmsSettingsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsSettings record);

    int insertSelective(CmsSettings record);

    CmsSettings selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsSettings record);

    int updateByPrimaryKey(CmsSettings record);
}