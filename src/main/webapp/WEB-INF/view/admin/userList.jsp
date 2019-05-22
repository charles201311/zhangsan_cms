<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>用户列表</title>

</head>
<body>
	<div class="container">
		<div class="form-group">
			<label for="username">用户名</label> <input type="text"
				class="input-mini" name="username" value="${username }"
				id="username" placeholder="输入查询条件">
			<button class="btn btn-default" type="button" onclick="query()">查询</button>
		</div>
		<table
			class="table table-striped table-bordered table-hover table-condensed table-sm">
			<tr>
				<td>序号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>生日</td>
				<td>昵称</td>
				<td>是否禁用</td>
				<td>注册时间</td>
				<td>修改时间</td>
			</tr>
			<c:forEach items="${list}" var="c" varStatus="i">
				<tr>
					<td>${i.index+1 }</td>
					<td>${c.username }</td>
					<td>${c.gender==1?"男":"女" }</td>
					<td>${c.birthday }</td>
					<td>${c.nickname }</td>
					<td><button class="btn btn-default" type="button" onclick="update(${c.id},this)">${c.locked==1?"正常":"禁用" }</button></td>
					<td>${c.create_time }</td>
					<td>${c.update_time }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="9">${pageInfo }</td>
			</tr>
		</table>

	</div>

	<script type="text/javascript">
		function query() {
			var username = $("[name='username']").val();
			//location.href="${pageContext.request.contextPath}/getUserList";
			//在中间区域显示地址的内容
			$('#content-wrapper').load(
					"${pageContext.request.contextPath}/getUserList?username="
							+ username);
		}
		
		//更新用户 -启用或停用
		function update(id,obj){
			//  正常:1,禁用:0
			//得到按钮的名称  [正常:禁用]
			var locked =$(obj).text()
			 $.ajax({
				type:"post",
				data:{id:id,locked:locked=="正常"?0:1},
				url:"${pageContext.request.contextPath}/updateUser",
				success:function(result){
				//	alert(result)
					if(result){
						//alert($(this).parent().text())
						$(obj).text(locked=="正常"?"禁用":"正常")
					
					}
				}
				
				
				
			}) 
			
		}
		
		$(function(){
			
		 
	        $('.page-link').click(function (e) {
	        	
	        	  //获取点击的的url
	            var url = $(this).attr('data');
	           // console.log(url);
	           //在中间区域显示地址的内容
	            $('#content-wrapper').load(url);
	        });
		})
	</script>

</body>
</html>