package com.zhangsan.cms.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("admin")
@Controller
public class AdminController {

	// 跳转到后台主页面
	@RequestMapping({"/","index"})
	public String toIndex() {
		return "admin/index";
	}
}
