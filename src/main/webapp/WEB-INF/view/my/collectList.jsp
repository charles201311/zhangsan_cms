<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>我的收藏</title>

</head>
<body>
	<div class="container">
	 <div>
	  <div class="form-group">
    <label for="name">名称</label>
    <input type="text" class="input-min" id="name" name="name" value="${name}"placeholder="友情链接名称">
   <button class="btn btn-default" type="button" onclick="query()">查询</button>
    <button class="btn btn-default" type="button" onclick="toAdd()">增加</button>
  </div>
	 
	 </div>
		<table
			class="table table-striped table-bordered table-hover table-condensed">
			<tr>
				<td>序号</td>
				<td>名称</td>
				<td>收藏时间</td>
				<td>操作</td>
				
			</tr>
			<c:forEach items="${list}" var="c" varStatus="i">
				<tr>
					<td>${i.index+1 }</td>
					<td>${c.name }</td>
					<td>${c.datetime}</td>
					<td><button class="btn btn-default" type="button" onclick="toDetete(${c.id})">删除</button></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5">${pageInfo }</td>
			</tr>
		</table>
	</div>
 <script type="text/javascript">
   function toDetete(id){
	   $('#content-wrapper').load("/frendlyLink/toDelete?id="+id);
   }
 
   
   
   //分页
   $(function(){
		
		 
       $('.page-link').click(function (e) {
       	
       	  //获取点击的的url
           var url = $(this).attr('data');
          // console.log(url);
          //在中间区域显示地址的内容
           $('#content-wrapper').load(url);
       });
	})
   
   //查询
   function query(){
	   $('#content-wrapper').load("/toCollectList?name="+$("[name='name']").val())
   }
 </script>

</body>
</html>
