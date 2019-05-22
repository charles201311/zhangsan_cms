package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangsan.cms.dao.CmsArticleMapper;
import com.zhangsan.cms.domain.CmsArticle;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Resource
  private CmsArticleMapper cmsArticleMapper;
	@Override
	public List<Map> selectArticleByHot() {
		return cmsArticleMapper.selectArticleByHot();
	}

	@Override
	public List<Map> selectArticleByChannel(Integer cid) {
		return cmsArticleMapper.selectArticleByChannel(cid);
	}

	@Override
	public List<Map> selectArticleByCategory(Integer catId) {
		// TODO Auto-generated method stub
		return cmsArticleMapper.selectArticleByCategory(catId);
	}

	@Override
	public int insertSelective(CmsArticle record) {
		// TODO Auto-generated method stub
		return cmsArticleMapper.insertSelective(record);
	}

	@Override
	public CmsArticle selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return cmsArticleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CmsArticle record) {
		// TODO Auto-generated method stub
		return cmsArticleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Map> selectArticleList(Integer channelId, Integer catId, Integer status) {
		// TODO Auto-generated method stub
		return cmsArticleMapper.selectArticleList(channelId, catId, status);
	}

	@Override
	public Map selectByid(Integer id) {
		// TODO Auto-generated method stub
		return cmsArticleMapper.selectByid(id);
	}



}
