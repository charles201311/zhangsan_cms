package com.zhangsan.cms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsFrendlylink;

public interface CmsFrendlylinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsFrendlylink record);

    int insertSelective(CmsFrendlylink record);

    CmsFrendlylink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsFrendlylink record);

    int updateByPrimaryKey(CmsFrendlylink record);
    
    //显示列表
    List<Map> selectList(@Param("name")String name);
}