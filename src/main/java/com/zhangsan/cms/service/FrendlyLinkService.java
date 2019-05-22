package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsFrendlylink;
import com.zhangsan.cms.utils.CMSRuntimeException;
/**
 * 友情链接
 * @author charles
 *
 */
public interface FrendlyLinkService {
	int deleteByPrimaryKey(Integer id);

	int insertSelective(CmsFrendlylink record) throws CMSRuntimeException;

	CmsFrendlylink selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(CmsFrendlylink record);

	// 显示列表
	List<Map> selectList(@Param("name") String name);
}
