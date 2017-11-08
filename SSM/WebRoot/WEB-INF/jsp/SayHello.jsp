<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@	taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SayHello.jsp' starting page</title>
    
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
    <h1>Hello.</h1> <br><br><br>
    <h1>Show</h1> <br>
    <textarea>username:${username}</textarea>
    <textarea>passwd:${passwd}</textarea>
    
    
    <textarea>user:${user.username}</textarea>
    <textarea>user:${user.passwd}</textarea>
    <textarea>user:${user.email}</textarea>
    
    <textarea>String:${string}</textarea>
    
   
     <h1>FOREACH</h1>

    <c:forEach items="${users}" var="usert">
    	 <textarea>username:${usert.username}</textarea>
    	 <textarea>passwd:${usert.passwd}</textarea>
    	 <textarea>user:${usert.email}</textarea>
    	 <br>
    </c:forEach>
    
    <a href="/SpringMVC/keepData">KeepDataTest</a>
    
    <fr:form method="post" modelAttribute="user" action="/SpringMVC/keepData" >
    	<fr:hidden path="username" var="${username}" />
    	<fr:hidden path="passwd" var="${passwd}" />
    	<fr:hidden path="email" var="${email}" />
    	<input type="submit" value="submit" />
    </fr:form>
    
    
    
    
  </body>
</html>
