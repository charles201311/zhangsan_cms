package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangsan.cms.dao.CmsCommentMapper;
import com.zhangsan.cms.domain.CmsComment;

@Service
public class CommentServiceImpl implements CommentService {

	@Resource
	private CmsCommentMapper mapper;
	
	@Override
	public int insertSelective(CmsComment record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<Map> selectComment(Integer userId, Integer articleId) {
		return mapper.selectComment(userId, articleId);
	}

}
