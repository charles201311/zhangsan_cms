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
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangsan.cms.domain.CmsCollect;
import com.zhangsan.cms.domain.CmsUser;
import com.zhangsan.cms.service.CollectService;
import com.zhangsan.cms.service.UserService;
import com.zhangsan.cms.utils.CMSRuntimeException;
import com.zhangsan.cms.utils.PageUtil;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	@Resource
	private CollectService collectService;

	@RequestMapping("getUserList")
	public String getUserList(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "") String username, HttpServletRequest request) {
		Integer pageSize = 5;
		PageHelper.startPage(page, pageSize);
		List<Map> list = userService.selectUserList(username);
		PageInfo<Map> info = new PageInfo<>(list);
		String pageInfo = PageUtil.page(page, info.getPages(), "/getUserList?username=" + username, pageSize);
		request.setAttribute("list", list);
		request.setAttribute("username", username);
		request.setAttribute("pageInfo", pageInfo);
		return "admin/userList";// 跳转到用户列表

	}

	@ResponseBody
	@RequestMapping("updateUser")
	public boolean updateUser(CmsUser user ) {
		
		return userService.update(user) > 0;
	}
	
	/**
	 * 添加收藏 或取消收藏
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="addOrDelCollect",produces="text/html;charset=utf-8")
	public String addCollect(CmsCollect collect,String flag,HttpSession session) {
		
		//判断是否已经登录,没有登录则不能改变
		CmsUser cmsUser = (CmsUser) session.getAttribute("cmsUser");
	
		if(null ==cmsUser)
			return "请登录后操作....";
		//收藏人的ID
		collect.setUserId(cmsUser.getId());
		//根据标准来决定是收藏还是取消收藏
		if(!flag.equals("收藏")) {
			collectService.deleteByArticleIdAndUserId(collect.getArticleId(),collect.getUserId());
		   return "操作成功";
		}
		try {
			collectService.insertSelective(collect);
			return "操作成功";
		} catch (CMSRuntimeException e) {
		    return e.getMessage();
		}
		
	 
	}
	
	// 去收藏页面
		@RequestMapping("/toCollectList")
		public String toFrindlyLink(@RequestParam(defaultValue = "1") Integer page,
				@RequestParam(defaultValue = "") String name, Model model) {
			Integer pageSize = 10;
			PageHelper.startPage(page, pageSize);
			List<Map> list = collectService.selectList(name);
			PageInfo<Map> info = new PageInfo<>(list);

			String pageInfo = PageUtil.page(page, info.getPages(), "/toCollectList?name=" + name, pageSize);
			model.addAttribute("list", list);// 查询的结果信息
			model.addAttribute("pageInfo", pageInfo);// 分页信息
			model.addAttribute("name", name);// 查询条件
			return "my/collectList";
		}

	
	 
}
