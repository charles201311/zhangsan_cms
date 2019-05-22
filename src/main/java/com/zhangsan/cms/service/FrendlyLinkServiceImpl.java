package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangsan.cms.dao.CmsFrendlylinkMapper;
import com.zhangsan.cms.domain.CmsFrendlylink;
import com.zhangsan.cms.utils.CMSRuntimeException;
import com.zhangsan.common.utils.WebUtil;

@Service
public class FrendlyLinkServiceImpl implements FrendlyLinkService {
	@Resource
	private CmsFrendlylinkMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
    /**
     * 如果要保存url不是合法则抛异常
     */
	@Override
	public int insertSelective(CmsFrendlylink record) throws CMSRuntimeException {
		
		if(!WebUtil.isHttpUrl(record.getUrl()))
			 throw new  CMSRuntimeException(record.getUrl()+"不是有效的地址");
		return mapper.insertSelective(record);
	}

	@Override
	public CmsFrendlylink selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CmsFrendlylink record) {
		//判断是否是合法的url
		if(!WebUtil.isHttpUrl(record.getUrl()))
			 throw new  CMSRuntimeException(record.getUrl()+"不是有效的地址");
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Map> selectList(String name) {
		return mapper.selectList(name);
	}

}
