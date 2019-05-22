package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangsan.cms.dao.CmsCategoryMapper;
import com.zhangsan.cms.domain.CmsCategory;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Resource
	private CmsCategoryMapper cmsCategoryMapper;

	@Override
	public List<Map> selectCategoryByChannel(Integer cid) {
		
		return cmsCategoryMapper.selectCategoryByChannel(cid);
	}

	@Override
	public int updateByPrimaryKeySelective(CmsCategory record) {
		return cmsCategoryMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int insertSelective(CmsCategory record) {
		return cmsCategoryMapper.insertSelective(record);
	}

	@Override
	public CmsCategory selectByPrimaryKey(Integer id) {
		return cmsCategoryMapper.selectByPrimaryKey(id);
	}

}
