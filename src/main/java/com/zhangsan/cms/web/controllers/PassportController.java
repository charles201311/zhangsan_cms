package com.zhangsan.cms.web.controllers;

import java.awt.color.CMMException;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zhangsan.cms.domain.CmsUser;
import com.zhangsan.cms.service.UserService;
import com.zhangsan.cms.utils.AssertUtil;
import com.zhangsan.cms.utils.CMSRuntimeException;
import com.zhangsan.cms.utils.Md5Util;
import com.zhangsan.cms.web.forms.UserForm;

@Controller
public class PassportController {

	@Resource
	private UserService userService;

	// 进入注册页面
	@RequestMapping("toReg")
	public String toReg() {
		return "passport/reg";
	}

	// 注册
	@RequestMapping("reg")
	public String reg(UserForm userForm, Model model, RedirectAttributes redirectAttributes) {

		try {
			AssertUtil.hasLength(userForm.getUsername(), "用户名不能为空");
			// 校验用户是否存在
			AssertUtil.isTrue(userService.selectCountByName(userForm.getUsername()) == 0, "用户名已经存在");

			AssertUtil.hasLength(userForm.getPassword(), "密码不能为空");
			AssertUtil.isTrue(userForm.getPassword().equals(userForm.getRepassword()), "两次密码不一致,请重新输入");
			CmsUser user = new CmsUser();
			user.setUsername(userForm.getUsername());
			user.setPassword(Md5Util.md5Encoding(userForm.getPassword()));
			user.setGender(userForm.getGender());

			userService.addUser(user);

			model.addAttribute("message", "恭喜您注册成功，请登录。");

			return "passport/login";// 跳转到登录页面
		} catch (CMSRuntimeException e) {
			// 处理异常
			// 封装获取到异常
			model.addAttribute("message", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "出现未知异常,请与管理员联系.");
		}

		return "passport/reg";// 回到注册页面
	}

	// 进入登录页面
	@RequestMapping("toLogin")
	public String toLogin() {
		return "passport/login";
	}

	// 登录
	@RequestMapping("login")
	public String login(String username, String password,HttpSession session,Model model) {
		try {
			AssertUtil.hasLength(username, "用户名不能为空");
			AssertUtil.hasLength(password, "密码不能为空");
			
			CmsUser cmsUser = userService.getUser(username, Md5Util.md5Encoding(password));
			AssertUtil.isTrue(null!=cmsUser, "用户名或密码不正确");
			 //验证通过,存seession
			cmsUser.setPassword(null);
			session.setAttribute("cmsUser", cmsUser);
			//如果是管理则进入管理的后台
			if(username.equals("admin"))
				return "admin/index";
			//进入普通的后台
			return "my/index";
			
		} catch (CMSRuntimeException e) {
			model.addAttribute("message", e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "出现未知异常,请与管理员联系.");
		}
		return "passport/login";
	}

}
