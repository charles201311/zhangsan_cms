package com.zhangsan.cms.dao;

import java.util.List;

import com.zhangsan.cms.domain.CmsChannel;

public interface CmsChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsChannel record);

    int insertSelective(CmsChannel record);

    CmsChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsChannel record);

    int updateByPrimaryKey(CmsChannel record);
    /**
     * 所有栏目
     * @return
     */
    List<CmsChannel> selectChannelList();
}