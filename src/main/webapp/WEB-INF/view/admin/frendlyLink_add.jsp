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
		<form>

			<div class="form-group">
				<label for="name">链接名称</label> <input type="text"
					class="form-control" id="name" name="name" placeholder="name">
			</div>
			
			<div class="form-group">
				<label for="url">链接地址</label> <input type="text" name="url"
					class="form-control" id="url" placeholder="url">
			</div>
			
			<div class="form-group">
				<label for="name">排序序号</label> <input type="text"
					class="form-control" id="name" name="sorted" placeholder="排序序号">
			</div>
			<div class="form-group">
				<button class="btn btn-default" type="button" onclick="add()">保存</button>
			</div>

		</form>
	</div>

<script type="text/javascript">
//增加
 function add(){
	 $.ajax({
		 type:"post",
		 data:$("form").serialize(),
		 url:"/frendlyLink/add",
		 success:function(obj){
			
			if(obj=='保存成功'){
				alert(obj)
				//跳转到列表
				 $('#content-wrapper').load("/frendlyLink/toList");
			 }else{
				 //错误消息
				 alert(obj); 
				
			 } 
		 }
		 
		 
	 })
	 
	 
 }

</script>
</body>
</html>
