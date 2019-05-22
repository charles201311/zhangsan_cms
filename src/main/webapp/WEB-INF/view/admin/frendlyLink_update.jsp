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
					class="form-control" id="name" name="name" placeholder="name" value="${f.name}">
					<!-- 隐藏域...... 千万别忘记写 -->
					<input type="hidden"
					 name="id"  value="${f.id}">
			</div>
			
			<div class="form-group">
				<label for="url">链接地址</label> <input type="text" name="url"
					class="form-control" id="url" placeholder="url"  value="${f.url}">
			</div>
			
			<div class="form-group">
				<label for="name">排序序号</label> <input type="text"
					class="form-control" id="name" name="sorted" placeholder="排序序号"  value="${f.sorted}">
			</div>
			<div class="form-group">
				<button class="btn btn-default" type="button" onclick="update()">修改</button>
			</div>

		</form>
	</div>

<script type="text/javascript">
 function update(){
	 $.ajax({
		 type:"post",
		 data:$("form").serialize(),
		 url:"/frendlyLink/update",
		 success:function(obj){
			 if(obj=='保存成功'){
					alert(obj)
					 $('#content-wrapper').load("/frendlyLink/toList");
				 }else{
					 alert(obj); 
					
				 } 
		 }
		 
		 
	 })
	 
	 
 }

</script>
</body>
</html>
