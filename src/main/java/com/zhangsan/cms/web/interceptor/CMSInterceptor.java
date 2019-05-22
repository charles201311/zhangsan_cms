package com.zhangsan.cms.web.interceptor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.zhangsan.cms.domain.CmsUser;

public class CMSInterceptor extends HandlerInterceptorAdapter {
 @Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	 
	 //不拦截   my/  admin/  
	 
	 String url = request.getRequestURI();
	 CmsUser cmsUser = (CmsUser) request.getSession().getAttribute("cmsUser");
	  //只拦截url 中包含  my   admin的地址
	 if(url.contains("my") || url.contains("admin") ) {
		 if(null!=cmsUser && url.contains("my") && !cmsUser.getUsername().equals("admin")  ) {
			 return true;//普通用户
		 }else if(null!=cmsUser && url.contains("admin") && cmsUser.getUsername().equals("admin")  ) {
			 return true ;//管理员
			 
		 }else {
			 myForward(request,response);//用户非法,则进入登录页面
			 return false;//管理员不能进入一般用户页面, 一般用户不能进入管理员页面
		 }
		 
		 
	 }else {
		 //进入主页面
		 
		 return true;
	 }
	 
}
 
 
 private void myForward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 request.setAttribute("message", "没有权限,请登录后操作....");
	 request.getRequestDispatcher("/WEB-INF/view/passport/login.jsp").forward(request, response); 
 }
}
