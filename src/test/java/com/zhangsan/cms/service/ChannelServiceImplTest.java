package com.zhangsan.cms.service;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;

import com.zhangsan.cms.domain.CmsChannel;

public class ChannelServiceImplTest extends JunitParent {
	@Resource
   private ChannelService channelService;
	
	@Test
	public void testInsertSelective() {
		CmsChannel channel = new CmsChannel();
		channel.setName("游戏");
		channel.setDescription("游戏游戏游戏游戏");
		channelService.insertSelective(channel);
	}

	@Test
	public void testSelectByPrimaryKey() {
		CmsChannel channel = channelService.selectByPrimaryKey(8);
		assertEquals("游戏", channel.getName());
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
	}

	@Test
	public void testSelectChannelList() {
	}

}
