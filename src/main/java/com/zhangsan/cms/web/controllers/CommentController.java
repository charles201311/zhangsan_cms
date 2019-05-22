package com.zhangsan.cms.web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangsan.cms.domain.CmsComment;
import com.zhangsan.cms.domain.CmsUser;
import com.zhangsan.cms.service.CommentService;
import com.zhangsan.cms.utils.PageUtil;

@Controller
public class CommentController {
	@Resource
	private CommentService commentService;
    //增加评论
	@ResponseBody
	@RequestMapping("addComment")
	public boolean addComment(CmsComment cmsComment, HttpSession session) {
		// 为当前评论的设置ID
		CmsUser cmsUser = (CmsUser) session.getAttribute("cmsUser");
		if(null ==cmsUser)
			return false;
		
		cmsComment.setUserId(cmsUser.getId());
		
		return commentService.insertSelective(cmsComment) > 0;
	}

	/**
	 * 返回所有评论
	 * 
	 * @param cmsComment
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getCommentList")
	public Map<String, Object> getCommentList(@RequestParam(defaultValue = "1") Integer page, Model model,Integer articleId) {
		Map<String, Object> map = new HashMap<>();

		// 为当前评论的设置ID
		PageHelper.startPage(page, 10);
		List<Map> list = commentService.selectComment(null,articleId);

		PageInfo<Map> info = new PageInfo<>(list);

		String pages = PageUtil.page(page, info.getPages(), "/getCommentList?articleId="+articleId, 10);

		// 封装评论集合
		map.put("list", list);
		// 封装分页数据
		map.put("pages", pages);
		return map;
	}

}
