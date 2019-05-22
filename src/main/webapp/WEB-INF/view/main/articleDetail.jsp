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
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">

</head>
<body>
	<div class="container">${map.content }</div>

	<div id="comment">
	
		<div class="form-group">
		   <p class ="text-right"><button type="button" onclick="toCollect(this)" >${isCollect>0?"已收藏":"收藏" }</button></p>
			<label for="c">评论</label>
			<textarea name="content" class="form-control" id="c" rows="3"></textarea>

			<p class="text-right">
				<button type="button" class="btn btn-primary" onclick="addComment()">发布</button>
			</p>
		</div>


	</div>
	<div id="content"></div>


	<div id="pages"></div>

	<jsp:include page="/WEB-INF/view/main/footer.jsp" />
	<script type="text/javascript">
$(function(){
	//${param.id}获取传递的参数
	$.ajax({
		type:"get",
		url:"getCommentList",
		data:{articleId:'${param.id}'},
		success:function(obj){
			//评论内容
			var list = obj.list;
			for(var i in list){
			$("#content").append("<div>"+list[i].username+"    "+list[i].mytime+"</div><span>"+ list[i].content+"</span><hr/>");	
			}
			//分页
		$("#pages").html(obj.pages)	
		}
		
		
		
	})
	
	
	
	
})
<!--增加评论-->

function addComment(){
	//获取参数 评论内容,评论文章ID
	
	$.ajax({
		type:"post",
		data:{content:$("#c").val(),articleId:'${param.id}'},
		url:"/addComment",
		success:function(obj){
			if(obj){
				alert("评论成功");
				
				location.reload();
			}else{
				alert("评论失败,请登录后再评论....")
			}
		}
		
		
	})
	
}


//收藏该文章链接
function toCollect(obj){
	var articleId ='${map.id}';//文章的id
	var titleName='${map.title}'//文件标题
	//获取按钮的名称.用来判断是收藏还是取消收藏
		var flag =$(obj).text();
	var url= window.location.href;//当前页面的地址并包含参数
	//	alert(flag)
	$.ajax({
		type:"post",
		data:{articleId:articleId,name:titleName,flag:flag,url:url},
		url:"/addOrDelCollect",
		success:function(result){
		   	if(result=="操作成功"){
		   		alert(result)
		   		$(obj).text(flag=="收藏"?"已收藏":"收藏")
		   	}else{
		   		alert(result)
		   	}
		}
		
	})
	
}

</script>
</body>
</html>