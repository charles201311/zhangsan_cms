package com.zhangsan.cms.web.controllers;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangsan.cms.domain.CmsFrendlylink;
import com.zhangsan.cms.service.FrendlyLinkService;
import com.zhangsan.cms.utils.CMSRuntimeException;
import com.zhangsan.cms.utils.PageUtil;

/**
 * 友情链接维护
 * 
 * @author charles
 *
 */
@RequestMapping("frendlyLink")
@Controller
public class FrendlyLinkController {
	@Resource
	private FrendlyLinkService service;

	// 去友情页面
	@RequestMapping("/toList")
	public String toFrindlyLink(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "") String name, Model model) {
		Integer pageSize = 10;
		PageHelper.startPage(page, pageSize);
		List<Map> list = service.selectList(name);
		PageInfo<Map> info = new PageInfo<>(list);

		String pageInfo = PageUtil.page(page, info.getPages(), "/frendlyLink/toList?name=" + name, pageSize);
		model.addAttribute("list", list);// 查询的结果信息
		model.addAttribute("pageInfo", pageInfo);// 分页信息
		model.addAttribute("name", name);// 查询条件
		return "admin/frendlyLink";
	}

	@RequestMapping("toAdd")
	public String toAdd() {
		return "admin/frendlyLink_add";
	}

	
	//增加友情链接
	@ResponseBody
	@RequestMapping(value="add",produces="text/html;charset=utf-8")
	public String add(CmsFrendlylink record,Model model) {
		String message="";
		try {
			service.insertSelective(record);
			message="保存成功";
		}catch(CMSRuntimeException e) {
			message ="保存失败:"+e.getMessage();
		}catch(Exception e) {
			message= "未知异常,请与管理员联系";
		}
		 return message;
	}

	// 去修改
	@RequestMapping("toUpdate")
	public String toUpdate(Integer id, Model model) {
		CmsFrendlylink f = service.selectByPrimaryKey(id);
		model.addAttribute("f", f);
		return "admin/frendlyLink_update";
	}

	// 执行修改
	@ResponseBody
	@RequestMapping(value="update",produces="text/html;charset=utf-8")
	public String update(CmsFrendlylink record) {
		String message="";
		try {
			service.updateByPrimaryKeySelective(record);
			message="保存成功";
		}catch(CMSRuntimeException e) {
			message ="保存失败:"+e.getMessage();
		}catch(Exception e) {
			message= "未知异常,请与管理员联系";
		}
		 return message;
	}

}
