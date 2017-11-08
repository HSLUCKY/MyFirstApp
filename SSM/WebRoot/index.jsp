<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <a href="/SpringMVC/sayHello">/SayHello.jsp</a>
    <br>
    
    <form action="/SpringMVC/sayHello" method="post">
    	<input type="hidden" name="username" value="aaaaaaa" />
    	<input type="hidden" name="passwd" value="vvvvvvvvv" />
    	<input type="hidden" name="email" value="123141@qq.com" />
    	<input type="submit" value="submit" />
    </form>
    
    
    
    
  </body>
</html>
