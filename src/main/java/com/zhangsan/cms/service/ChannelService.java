package com.zhangsan.cms.service;

import java.util.List;

import com.zhangsan.cms.domain.CmsChannel;
/**
 * 栏目service
 * @author charles
 *
 */
public interface ChannelService {
       /**
        * 增加栏目
        * @param record
        * @return
        */
	   int insertSelective(CmsChannel record);
	   /**
	    * 根据ID 查询单个栏目
	    * @param id
	    * @return
	    */
	   CmsChannel selectByPrimaryKey(Integer id);
	   /**
	    * 修改栏目
	    * @param record
	    * @return
	    */
	   int updateByPrimaryKeySelective(CmsChannel record);
	   /**
	     * 所有栏目
	     * @return
	     */
	    List<CmsChannel> selectChannelList();
}
