package com.zhangsan.cms.web.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhangsan.cms.domain.CmsArticle;
import com.zhangsan.cms.domain.CmsUser;
import com.zhangsan.cms.service.ArticleService;

@Controller
@RequestMapping("my")
public class MyController {

	@Resource
	private ArticleService articleService;
	// 跳转到个人主页面
	@RequestMapping({ "/", "index" })
	public String toIndex() {
		return "my/index";
	}
	//去发布文章
	@RequestMapping("toPublish")
	public String toPublish() {
		return "my/articlePublish";
	}
	
	//发布文章
	@ResponseBody
	@RequestMapping("publish")
	public boolean publish(CmsArticle cmsArticle,HttpSession session) {
		//设置发布的ren用户ID
		CmsUser user = (CmsUser) session.getAttribute("cmsUser");
		cmsArticle.setUserId(user.getId());
		
		return articleService.insertSelective(cmsArticle)>0;
	}
}
