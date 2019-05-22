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
		<div class="form-group">
			栏目:<select id="channel" name="channelId">
				<option></option>

			</select>分类: <select id="category" name="catId">
				<option></option>

			</select> 审核状态<select name="status" id="status">
				<option value="">全部</option>
				<option value="0">待审</option>
				<option value="1">已审</option>
				<option value="-1">驳回</option>

			</select>

			<button class="btn btn-default" type="button" onclick="query()">查询</button>
		</div>
		<table
			class="table table-striped table-bordered table-hover table-condensed">
			<tr>
				<td>序号</td>
				<td>标题</td>
				<td>作者</td>
				<td>栏目</td>
				<td>分类</td>
				<td>创建时间</td>
				<td>修改时间</td>
				<td>状态</td>
				<td>详情</td>
			</tr>
			<c:forEach items="${list}" var="c" varStatus="i">
				<tr>
					<td>${i.index+1 }</td>
					<td>${c.title }</td>
					<td>${c.username}</td>
					<td>${c.cname}</td>
					<td>${c.catname}</td>
					<td>${c.created}</td>
					<td>${c.updated}</td>
				<td><button class="btn btn-default" type="button" >${c.status==0?"待审":c.status==1?"已审":"驳回"}</button></td>
					<td><button class="btn btn-default" type="button" onclick="toCheck(${c.id})">详情</button></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="9">${pageInfo }</td>
			</tr>
		</table>
	</div>

	<script type="text/javascript">
		function query() {
			var channelId = $("[name='channelId']").val();
			var catId = $("[name='catId']").val();
			var status = $("[name='status']").val();
			//location.href="${pageContext.request.contextPath}/getUserList";
			//在中间区域显示地址的内容
		
			$('#content-wrapper').load("/article/getList?channelId="+ channelId+"&catId="+catId+"&status="+status);
		}
		//去审核
		function toCheck(id){//调到明细页面.进一步审核
			$('#content-wrapper').load("/article/toArticleDetail?id="+id);
			
		}
		
		
		
		
		
		//当页面加载时
		$(function(){
		
			$.ajax({
			type:"get",
			url:"/article/getChannelList",//获取所有栏目
			success:function(list){
				for(var i in list){
					//为栏目添加option
				  $("#channel").append("<option value='"+list[i].id+"'>"+list[i].name+"</option>")	
				}
				//当用户点查询时让栏目选中
				var channelId='${channelId}';
				 $("#channel").find("option[value='"+channelId+"']").prop("selected",true);
				 //当用户点查询时如果频道id不为空则调用分类方法,,初始化分类的下拉框
				if(channelId!=null){getCategory(channelId);}
				
				
						//让状态选中
				var status ='${status}';
				$("#status").find("option[value='"+status+"']").prop("selected",true);
				
			}
				
			})//当栏目改变时.查询该栏目的下的分类
		$("#channel").change(function(){
			$("#category").empty();
			var cid =$(this).val();
			getCategory(cid);
		})	
			
		})
		
		//获取所有分类
		function getCategory(cid){
			$.ajax({
				type:"get",
				data:{cid:cid},
				url:"/article/getCategoryList",
				success:function(list){
					for(var i in list){
					  $("#category").append("<option value='"+list[i].id+"'>"+list[i].name+"</option>")	
					}
					//让分类选中	
					 var catId='${catId}';
					$("#category").find("option[value='"+catId+"']").prop("selected",true);
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
