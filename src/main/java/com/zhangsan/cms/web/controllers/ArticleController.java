package com.zhangsan.cms.web.controllers;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangsan.cms.domain.CmsArticle;
import com.zhangsan.cms.domain.CmsCategory;
import com.zhangsan.cms.domain.CmsChannel;
import com.zhangsan.cms.service.ArticleService;
import com.zhangsan.cms.service.CategoryService;
import com.zhangsan.cms.service.ChannelService;
import com.zhangsan.cms.service.CommentService;
import com.zhangsan.cms.utils.PageUtil;

@RequestMapping("article")
@Controller
public class ArticleController {
	
	@Resource
	private ArticleService articleService;
	@Resource
	private CategoryService categoryService;
	@Resource
	private ChannelService channelService;

	
	@RequestMapping("getList")
	public String getUserList(@RequestParam(defaultValue="0")Integer channelId,@RequestParam(defaultValue="0")Integer catId,@RequestParam(defaultValue="0")Integer status ,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="")String username ,HttpServletRequest request) {
		Integer pageSize=3;
		
		PageHelper.startPage(page, pageSize);
		List<Map> list = articleService.selectArticleList(channelId, catId, status);
		 PageInfo<Map> info = new PageInfo<>(list);
		 String pageInfo= PageUtil.page(page, info.getPages(), "/getList?channelId="+channelId+"&catId="+catId+"&status="+status,  pageSize);
		request.setAttribute("list", list);
		request.setAttribute("channelId",channelId);
		request.setAttribute("catId",catId);
		request.setAttribute("status",status);
		request.setAttribute("pageInfo",pageInfo);
		return "admin/articleList";//跳转到用户列表
		
	}
	@ResponseBody
	@RequestMapping("getChannelList")
	public List<CmsChannel> getChannelList() {
		
		return channelService.selectChannelList();
	}

	
	@ResponseBody
	@RequestMapping("getCategoryList")
	public List<Map> getCategoryList(Integer cid) {
		return categoryService.selectCategoryByChannel(cid);
	}
	//跳转到文章明细页面
	@RequestMapping("toArticleDetail")
	public String toArticleDetail(Integer id,HttpServletRequest request ) {
		Map article = articleService.selectByid(id);
		request.setAttribute("article", article);
		return "admin/articleDedail";
	}
	//审核文章
	@ResponseBody
	@RequestMapping("checkArticle")
	public boolean checkArticle(CmsArticle article) {
		return articleService.updateByPrimaryKeySelective(article)>0;
	}
}
