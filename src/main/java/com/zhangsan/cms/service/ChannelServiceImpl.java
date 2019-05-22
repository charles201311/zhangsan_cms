package com.zhangsan.cms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangsan.cms.dao.CmsChannelMapper;
import com.zhangsan.cms.domain.CmsChannel;
@Service
public class ChannelServiceImpl implements ChannelService {

	@Resource
	private CmsChannelMapper cmsChannelMapper;
	@Override
	public int insertSelective(CmsChannel record) {
		return cmsChannelMapper.insertSelective(record);
	}

	@Override
	public CmsChannel selectByPrimaryKey(Integer id) {
		return cmsChannelMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CmsChannel record) {
		return cmsChannelMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<CmsChannel> selectChannelList() {
		return cmsChannelMapper.selectChannelList();
	}

}
