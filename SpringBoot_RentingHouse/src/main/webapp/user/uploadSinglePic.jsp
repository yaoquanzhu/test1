<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.yc.utils.*,java.util.*"%>


<%
	FileUpload fu=new FileUpload();
	Map<String,String> map=fu.uploadFiles(pageContext,request);
	//取出回调函数名
	response.setContentType("text/html;charset=UTF-8");
	String callback=request.getParameter("CKEditorFuncNum");
	//将结果以客户端指定的形式，以javascript代码写到客户端去，这样客户端的  浏览器的js的引擎就可以运行
	out.println("<script type=\"text/javascript\">");
	out.println("window.parent.CKEDITOR.tools.callFunction("+callback+",'"+map.get("upload_weburl")+"','')");
	out.println("</script>");
	out.flush();
%>



























