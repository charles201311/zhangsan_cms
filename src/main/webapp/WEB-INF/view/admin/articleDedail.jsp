<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title></title>

</head>
<body>
	<div class="container">

		<table
			class="table table-striped table-bordered table-hover table-condensed">
			<tr>
				<td>标题:${article.title }</td>
			</tr>
			<tr>
				<td>作者::${article.username }</td>
			</tr>
			<tr>
				<td>创建时间:${article.created }</td>
			</tr>
			<tr>
				<td>修改时间:${article.updated }</td>
			</tr>
			<tr>
				<td>内容:${article.content }</td>
			</tr>
			<tr>
				<td>状态:<input type="radio" name="status" value="0">待审 <input
					type="radio" name="status" value="1">已审 <input type="radio"
					name="status" value="-1">驳回
				</td>
			</tr>
			<tr>

				<td><button class="btn btn-info" type="button" onclick="check()">提交</button></td>
			</tr>

		</table>
	</div>

	<script type="text/javascript">

		//当页面加载时
		$(function() {
			//获取当前文章的状态
			var status='${article.status}'
			//遍历所有单选框,
			$("[name='status']").each(function(){
				 //让单选框选中
				if($(this).val() == status){
					$(this).prop("checked",true);
				}
				
			})

		})
		
		//审核
		function check(){
			//文章的id
			var id ='${article.id}';
			//选中的状态
			var status=$("[name='status']:checked").val();
			$.ajax({
				type:"post",
				data:{id:id,status:status},
				url:"/article/checkArticle",
				success:function(obj){
					if(obj){
						alert("操作成功");
						  $('#content-wrapper').load("/article/getList");
					}
				}
				
				
				
			})
		}
	</script>

</body>
</html>
