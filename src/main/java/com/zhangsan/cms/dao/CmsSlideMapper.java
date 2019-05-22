package com.zhangsan.cms.dao;

import com.zhangsan.cms.domain.CmsSlide;

public interface CmsSlideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsSlide record);

    int insertSelective(CmsSlide record);

    CmsSlide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsSlide record);

    int updateByPrimaryKey(CmsSlide record);
}