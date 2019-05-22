package com.zhangsan.cms.web.controllers;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangsan.cms.domain.CmsChannel;
import com.zhangsan.cms.domain.CmsUser;
import com.zhangsan.cms.service.ArticleService;
import com.zhangsan.cms.service.CategoryService;
import com.zhangsan.cms.service.ChannelService;
import com.zhangsan.cms.service.CollectService;
import com.zhangsan.cms.service.FrendlyLinkService;
import com.zhangsan.cms.utils.PageUtil;
/**
 * 主页面控制
 * @author charles
 *
 */
@Controller
public class MainController {

	@Resource
	private ChannelService channelService;

	@Resource
	private CategoryService categoryService;

	@Resource
	private ArticleService articleService;
	@Resource
	private FrendlyLinkService frendlyLinkService;
	
	@Resource
	private CollectService collectService;

	private Integer pageSize =5;//每页记录数
	// 跳转到前台主页面
	@RequestMapping({ "/", "index" })
	public String toIndex(Model model,@RequestParam(defaultValue="1")Integer page) {
		//查询出频道
		List<CmsChannel> list = channelService.selectChannelList();
		model.addAttribute("list", list);
		//默认查询出新闻热点内容
		PageHelper.startPage(page, pageSize);
		List<Map> hotList = articleService.selectArticleByHot();
	   PageInfo<Map> info = new PageInfo<>(hotList);
		
		String pages= PageUtil.page(page, info.getPages(), "/getHotList", pageSize);
		
		//查询出友情链接
		List<Map> linkList = frendlyLinkService.selectList(null);
		
		
		model.addAttribute("hotList", hotList);
		model.addAttribute("pages", pages);
		model.addAttribute("linkList", linkList);
		
		return "main/index";
	}
	
	//返回热点文章
		@RequestMapping("getHotList")
		public String getHotList(@RequestParam(defaultValue="1")Integer page, Model model) {
			//默认查询出新闻热点内容
			PageHelper.startPage(page, pageSize);
			List<Map> hotList = articleService.selectArticleByHot();
		   PageInfo<Map> info = new PageInfo<>(hotList);
			
			String pages= PageUtil.page(page, info.getPages(), "/getHotList", pageSize);
			
			model.addAttribute("list", hotList);
			model.addAttribute("pages", pages);
			return "main/articleTitleList";
		}

	
	

	// 根据频道获取获取分类
	@RequestMapping("getCategoryList")
	public String categoryList(Integer cid, Model model) {
		List<Map> list = categoryService.selectCategoryByChannel(cid);
		model.addAttribute("list", list);
		//获取该频道下所有 分类文章内容
		List<Map> articleList = articleService.selectArticleByChannel(cid);
		model.addAttribute("articleList", articleList);
	
		return "main/categoryList";
	}

	// 根据分类获取文章内容
	@RequestMapping("getArticleList")
	public String getArticleList(Integer id, Model model) {
		List<Map> list = articleService.selectArticleByCategory(id);
		model.addAttribute("list", list);
		return "main/articleTitleList";
	}

	// 根据文章ID 查询文章明细
	@RequestMapping("getArticleDetail")
	public String getArticleDetail(Integer id, Model model,HttpSession session) {
		
	Map map = articleService.selectByid(id);
	
	int isCollect=0;//是否收藏
	
	//获取当前用户session
	CmsUser cmsUser = (CmsUser) session.getAttribute("cmsUser");
	  if(null!=cmsUser) {
		  Integer userId = cmsUser.getId();
		  isCollect = collectService.selectCountByUseridAndArtilceId(id, userId);
	  }
	
		model.addAttribute("map", map);
		model.addAttribute("isCollect", isCollect);
		
		return "main/articleDetail";
	}

}
