<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>publish</title>
<link rel="stylesheet"
	href="/resource/kindeditor/themes/default/default.css" />
<link rel="stylesheet"
	href="/resource/kindeditor/plugins/code/prettify.css" />
<script charset="utf-8"
	src="/resource/kindeditor/plugins/code/prettify.js"></script>
<script charset="utf-8" src="/resource/kindeditor/kindeditor-all.js"></script>
    
<script charset="utf-8" src="/resource/kindeditor/lang/zh-CN.js"></script>
<script
	src="${pageContext.request.contextPath}/resource/js/jquery-3.0.0.min.js"></script>

<script>
	KindEditor.ready(function(K) {
		window.editor1 = K.create('textarea[name="content1"]', {
			cssPath : '/resource/kindeditor/plugins/code/prettify.css',
			uploadJson : '/resource/kindeditor/jsp/upload_json.jsp',
			fileManagerJson : '/resource/kindeditor/jsp/file_manager_json.jsp',
			allowFileManager : true,
			afterCreate : function() {
				var self = this;
				K.ctrl(document, 13, function() {
					self.sync();
					document.forms['example'].submit();
				});
				K.ctrl(self.edit.doc, 13, function() {
					self.sync();
					document.forms['example'].submit();
				});
			}
		});
		prettyPrint();
	});
	
</script>
</head>
<body>
	<form>

		<div class="form-group">
			<label for="title">标题</label> <input type="text" class="form-control"
				id="title" name="title" placeholder="标题">
		</div>
		<div class="form-group">
			<label for="content">内容</label>
			<textarea class="form-control" id="content" name="content1" cols="100" rows="8"
				style="width: 700px; height: 400px; visibility: hidden;"><%=htmlspecialchars(htmlData)%></textarea>
		</div>
		栏目:
		<div>
		<select class="form-control" id="channel" name="channelId">
		<option></option>
		</select> 
		分类:
		 <select class="form-control"  id="category" name="catId">
			<option></option>
		</select>

		</div>
		<button class="btn btn-default" type="button" onclick="publish()">发布</button>

	</form>
	<script type="text/javascript">
	
	
	function publish() {
		//alert(editor1.html())
			var channelId = $("[name='channelId']").val();
			var categoryId = $("[name='catId']").val();
			var title = $("[name='title']").val();
			var str = $("#content").first().attr("src");
		
		//获取内容中的第一个图片地址
		  var str = editor1.html()
	   var imgReg = /<img.*?(?:>|\/>)/gi;
     var srcReg = /src=[\'\"]?([^\'\"]*)[\'\"]?/i;
      var arr = str.match(imgReg);  // arr 为包含所有img标签的数组
    /*   for (var i = 0; i < arr.length; i++) {
	 var src = arr[i].match(srcReg);
	 //获取图片地址
	  console.log('图片地址'+(i+1)+'：'+src[1]);
	
	} */
		//获取第一个图片地址,当如媒体的显示图
		var firstSRC;
		if(arr!=null && arr.length>0)
		firstSRC =arr[0].match(srcReg)[1];
		
	 	$.ajax({
			type:"post",
			data:{channelId:channelId,categoryId:categoryId,title:title,content:editor1.html(),picture:firstSRC},
			url:"/my/publish",
			success:function(obj){
				if(obj){
					alert("发布成功");
					
				}
			} 
			
			
		}) 
		//alert( $("[name='content1']").attr("src"))
	}
		//当页面加载时
		$(function() {

			$.ajax({
				type : "get",
				url : "/article/getChannelList",//获取所有栏目
				success : function(list) {
					for ( var i in list) {
						//为栏目添加option
						$("#channel").append(
								"<option value='"+list[i].id+"'>"
										+ list[i].name + "</option>")
					}
					//当用户点查询时让栏目选中
					var channelId = '${channelId}';
					$("#channel").find("option[value='" + channelId + "']")
							.prop("selected", true);
					//当用户点查询时如果频道id不为空则调用分类方法,,初始化分类的下拉框
					if (channelId != null) {
						getCategory(channelId);
					}

					//让状态选中
					var status = '${status}';
					$("#status").find("option[value='" + status + "']").prop(
							"selected", true);

				}

			})//当栏目改变时.查询该栏目的下的分类
			$("#channel").change(function() {
				$("#category").empty();
				var cid = $(this).val();
				getCategory(cid);
			})

		})

		//获取所有分类
		function getCategory(cid) {
			$.ajax({
				type : "get",
				data : {
					cid : cid
				},
				url : "/article/getCategoryList",
				success : function(list) {
					for ( var i in list) {
						$("#category").append(
								"<option value='"+list[i].id+"'>"
										+ list[i].name + "</option>")
					}
					//让分类选中	
					var catId = '${catId}';
					$("#category").find("option[value='" + catId + "']").prop(
							"selected", true);
				}
			})
		}
	</script>
</body>


</html>
<%!private String htmlspecialchars(String str) {
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\"", "&quot;");
		return str;
	}%>