/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-12 09:45:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.my;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class articlePublish_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private String htmlspecialchars(String str) {
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\"", "&quot;");
		return str;
	}
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	request.setCharacterEncoding("UTF-8");
	String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>publish</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/resource/kindeditor/themes/default/default.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/resource/kindeditor/plugins/code/prettify.css\" />\r\n");
      out.write("<script charset=\"utf-8\"\r\n");
      out.write("\tsrc=\"/resource/kindeditor/plugins/code/prettify.js\"></script>\r\n");
      out.write("<script charset=\"utf-8\" src=\"/resource/kindeditor/kindeditor-all.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("<script charset=\"utf-8\" src=\"/resource/kindeditor/lang/zh-CN.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tKindEditor.ready(function(K) {\r\n");
      out.write("\t\twindow.editor1 = K.create('textarea[name=\"content1\"]', {\r\n");
      out.write("\t\t\tcssPath : '/resource/kindeditor/plugins/code/prettify.css',\r\n");
      out.write("\t\t\tuploadJson : '/resource/kindeditor/jsp/upload_json.jsp',\r\n");
      out.write("\t\t\tfileManagerJson : '/resource/kindeditor/jsp/file_manager_json.jsp',\r\n");
      out.write("\t\t\tallowFileManager : true,\r\n");
      out.write("\t\t\tafterCreate : function() {\r\n");
      out.write("\t\t\t\tvar self = this;\r\n");
      out.write("\t\t\t\tK.ctrl(document, 13, function() {\r\n");
      out.write("\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tK.ctrl(self.edit.doc, 13, function() {\r\n");
      out.write("\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tprettyPrint();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"title\">标题</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\tid=\"title\" name=\"title\" placeholder=\"标题\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"content\">内容</label>\r\n");
      out.write("\t\t\t<textarea class=\"form-control\" id=\"content\" name=\"content1\" cols=\"100\" rows=\"8\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 400px; visibility: hidden;\">");
      out.print(htmlspecialchars(htmlData));
      out.write("</textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t栏目:\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<select class=\"form-control\" id=\"channel\" name=\"channelId\">\r\n");
      out.write("\t\t<option></option>\r\n");
      out.write("\t\t</select> \r\n");
      out.write("\t\t分类:\r\n");
      out.write("\t\t <select class=\"form-control\"  id=\"category\" name=\"catId\">\r\n");
      out.write("\t\t\t<option></option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<button class=\"btn btn-default\" type=\"button\" onclick=\"publish()\">发布</button>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction publish() {\r\n");
      out.write("\t\t//alert(editor1.html())\r\n");
      out.write("\t\t\tvar channelId = $(\"[name='channelId']\").val();\r\n");
      out.write("\t\t\tvar categoryId = $(\"[name='catId']\").val();\r\n");
      out.write("\t\t\tvar title = $(\"[name='title']\").val();\r\n");
      out.write("\t\t\tvar str = $(\"#content\").first().attr(\"src\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//获取内容中的第一个图片地址\r\n");
      out.write("\t\t  var str = editor1.html()\r\n");
      out.write("\t   var imgReg = /<img.*?(?:>|\\/>)/gi;\r\n");
      out.write("     var srcReg = /src=[\\'\\\"]?([^\\'\\\"]*)[\\'\\\"]?/i;\r\n");
      out.write("      var arr = str.match(imgReg);  // arr 为包含所有img标签的数组\r\n");
      out.write("    /*   for (var i = 0; i < arr.length; i++) {\r\n");
      out.write("\t var src = arr[i].match(srcReg);\r\n");
      out.write("\t //获取图片地址\r\n");
      out.write("\t  console.log('图片地址'+(i+1)+'：'+src[1]);\r\n");
      out.write("\t\r\n");
      out.write("\t} */\r\n");
      out.write("\t\t//获取第一个图片地址,当如媒体的显示图\r\n");
      out.write("\t\tvar firstSRC;\r\n");
      out.write("\t\tif(arr!=null && arr.length>0)\r\n");
      out.write("\t\tfirstSRC =arr[0].match(srcReg)[1];\r\n");
      out.write("\t\t\r\n");
      out.write("\t \t$.ajax({\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdata:{channelId:channelId,categoryId:categoryId,title:title,content:editor1.html(),picture:firstSRC},\r\n");
      out.write("\t\t\turl:\"/my/publish\",\r\n");
      out.write("\t\t\tsuccess:function(obj){\r\n");
      out.write("\t\t\t\tif(obj){\r\n");
      out.write("\t\t\t\t\talert(\"发布成功\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}) \r\n");
      out.write("\t\t//alert( $(\"[name='content1']\").attr(\"src\"))\r\n");
      out.write("\t}\r\n");
      out.write("\t\t//当页面加载时\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\turl : \"/article/getChannelList\",//获取所有栏目\r\n");
      out.write("\t\t\t\tsuccess : function(list) {\r\n");
      out.write("\t\t\t\t\tfor ( var i in list) {\r\n");
      out.write("\t\t\t\t\t\t//为栏目添加option\r\n");
      out.write("\t\t\t\t\t\t$(\"#channel\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<option value='\"+list[i].id+\"'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ list[i].name + \"</option>\")\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//当用户点查询时让栏目选中\r\n");
      out.write("\t\t\t\t\tvar channelId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${channelId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\t\t\t$(\"#channel\").find(\"option[value='\" + channelId + \"']\")\r\n");
      out.write("\t\t\t\t\t\t\t.prop(\"selected\", true);\r\n");
      out.write("\t\t\t\t\t//当用户点查询时如果频道id不为空则调用分类方法,,初始化分类的下拉框\r\n");
      out.write("\t\t\t\t\tif (channelId != null) {\r\n");
      out.write("\t\t\t\t\t\tgetCategory(channelId);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t//让状态选中\r\n");
      out.write("\t\t\t\t\tvar status = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\t\t\t$(\"#status\").find(\"option[value='\" + status + \"']\").prop(\r\n");
      out.write("\t\t\t\t\t\t\t\"selected\", true);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t})//当栏目改变时.查询该栏目的下的分类\r\n");
      out.write("\t\t\t$(\"#channel\").change(function() {\r\n");
      out.write("\t\t\t\t$(\"#category\").empty();\r\n");
      out.write("\t\t\t\tvar cid = $(this).val();\r\n");
      out.write("\t\t\t\tgetCategory(cid);\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t//获取所有分类\r\n");
      out.write("\t\tfunction getCategory(cid) {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tcid : cid\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\turl : \"/article/getCategoryList\",\r\n");
      out.write("\t\t\t\tsuccess : function(list) {\r\n");
      out.write("\t\t\t\t\tfor ( var i in list) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#category\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<option value='\"+list[i].id+\"'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ list[i].name + \"</option>\")\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//让分类选中\t\r\n");
      out.write("\t\t\t\t\tvar catId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${catId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\t\t\t$(\"#category\").find(\"option[value='\" + catId + \"']\").prop(\r\n");
      out.write("\t\t\t\t\t\t\t\"selected\", true);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
