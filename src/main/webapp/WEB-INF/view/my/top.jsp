<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-light bg-light">
	<a class="navbar-brand" href="/" title="CMS"><img alt="CMS"
		src="/resource/images/logo.png"></a>

	<!-- 搜索框：在专业高级二学完ElasticSearch后实现 -->
	<form class="form-inline">
		<div class="input-group">
			<input type="text" name="key" class="form-control"
				placeholder="输入关键字..." aria-label="key"
				aria-describedby="basic-addon1">
			<div class="input-group-prepend">
				<button class="input-group-btn btn btn-outline-primary"
					id="basic-addon1">搜索</button>
			</div>
		</div>
	</form>

	<!-- 右边登录注册 -->
	<ul class="nav nav-tabs">
		<c:choose>
			<%-- 登录显示用户菜单 --%>
			<c:when test="${sessionScope.cmsUser != null}">
				<li class="nav-item "><a class="nav-link" href="/my/">
						<img alt="" src="/resource/images/default_avatar.png"
						style="max-height: 2rem" class="rounded img-fluid">${sessionScope.cmsUser.username}
				</a></li>

			</c:when>
			<c:otherwise>
				<%-- 未登录显示登录注册链接 --%>
				<li class="nav-item"><a class="nav-link" href="/toReg">注册</a></li>
				<li class="nav-item"><a class="nav-link" href="/toLogin">登录</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
</nav>