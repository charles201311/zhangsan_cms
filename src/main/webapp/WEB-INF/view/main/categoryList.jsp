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

		<ul class="nav nav-tabs">
			<c:forEach items="${list }" var="c">
				<li class="nav-item"><a class="nav-link" name="tabs1"
					href="javascript:void(0)" data="/getArticleList?id=${c.id }">${c.name }</a></li>
			</c:forEach>
		</ul>
       <!-- 默认显示该频道下的所有内容 -->
		<div id="defaultContent">
			<c:forEach items="${articleList }" var="c">
			<div class="media">
				<img class="align-self-start mr-1" src="${c.picture }" alt="no pic">
				<div class="media-body">
					<small>
						<a href="javascript:toDetail(${c.id })">${c.title }</a><small>
				</div>
			</div>
				<h5>
						<p class="blog_item_footer">
							<span class="glyphicon glyphicon-user" title="作者"></span>作者：${c.username}&nbsp;&nbsp;
							&nbsp; <span class="glyphicon glyphicon-time" title="发布时间"></span>发布：&nbsp;
							${c.mytime }&nbsp;&nbsp;&nbsp;&nbsp;
						</p>
						
					</small>
				</h5>

			</c:forEach>

		</div>
	</div>

	<script type="text/javascript">
	$(function(){
		
		
	    <!--为标签页添加点击事件-->
        $('.nav-link').click(function () {
        	  //获取点击的的url
            var url = $(this).attr('data');
        	  
        	  //当点击具体某个分类时,隐藏所有的内容
        	  $('#defaultContent').empty();
           // console.log(url);
           //在中间区域显示地址的内容
            $('#article').load(url);
        });
        
     
		
	})
	//文章明细
	function toDetail(id){
	 window.open("getArticleDetail?id="+id);
 }
	</script>
</body>
</html>