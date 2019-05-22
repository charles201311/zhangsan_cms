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
<script type="text/javascript">
 function toDetail(id){
	 window.open("getArticleDetail?id="+id);
 }
 
 </script>
</head>
<body>
	<div class="container">
		<c:forEach items="${list}" var="c">
			<div class="media">
				<img class="align-self-start mr-3" src="${c.picture }" alt="no pic">
				<div class="media-body">
					<a href="javascript:toDetail(${c.id })">${c.title }</a><small>
				</div>
			</div>

			<p class="blog_item_footer">
				<span class="glyphicon glyphicon-user" title="作者"></span>作者：${c.username}&nbsp;&nbsp;
				&nbsp; <span class="glyphicon glyphicon-time" title="发布时间"></span>发布：&nbsp;
				${c.mytime }&nbsp;&nbsp;&nbsp;&nbsp;
			</p>
			</small>
			</h5>

		</c:forEach>
		<div>${pages }</div>

	</div>

</body>
</html>