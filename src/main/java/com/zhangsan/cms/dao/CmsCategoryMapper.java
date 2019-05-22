package com.zhangsan.cms.dao;

import java.util.List;
import java.util.Map;

import com.zhangsan.cms.domain.CmsCategory;

public interface CmsCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);

    CmsCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);
    /**
     * 根据栏目Id查询其下分类列表
     * @param cid
     * @return
     */
    List<Map> selectCategoryByChannel(Integer cid);
    
    
}