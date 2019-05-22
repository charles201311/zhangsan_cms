package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangsan.cms.dao.CmsCollectMapper;
import com.zhangsan.cms.domain.CmsCollect;
import com.zhangsan.cms.utils.CMSRuntimeException;
import com.zhangsan.common.utils.WebUtil;

@Service
public class CollectServiceImpl implements CollectService {
	@Resource
	private CmsCollectMapper collectMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return collectMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insertSelective(CmsCollect record) {
		if(!WebUtil.isHttpUrl(record.getUrl())) {
			throw new CMSRuntimeException(record.getUrl()+"不是有效的http地址");
		}
		return collectMapper.insertSelective(record);
	}

	@Override
	public CmsCollect selectByPrimaryKey(Integer id) {
		return collectMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CmsCollect record) {
		return collectMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Map> selectList(String name) {
		// TODO Auto-generated method stub
		return collectMapper.selectList(name);
	}

	@Override
	public int deleteByArticleIdAndUserId(Integer aid, Integer userId) {
		// TODO Auto-generated method stub
		return collectMapper.deleteByArticleIdAndUserId(aid, userId);
	}

	@Override
	public int selectCountByUseridAndArtilceId(Integer aid, Integer userId) {
		// TODO Auto-generated method stub
		return collectMapper.selectCountByUseridAndArtilceId(aid, userId);
	}

}
