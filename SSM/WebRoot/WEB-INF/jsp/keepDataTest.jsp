<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@	taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'keepDataTest.jsp' starting page</title>
    
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
     <c:forEach  items="${users}" var="usert">
    	 <textarea>username:${usert.username}</textarea>
    	 <textarea>passwd:${usert.passwd}</textarea>
    	 <br>
    </c:forEach>
    
    <h1>»ØÏÔ²âÊÔ</h1>
    <fr:form method="get" modelAttribute="user"  > 
    	<fr:input path="username" var="${username}" /> <fr:errors path="username"></fr:errors>
    	<fr:input path="passwd" var="${passwd}" />    <fr:errors path="passwd"></fr:errors>
    	<fr:input path="email" var="${email}" />   <fr:errors path="email"></fr:errors>
    	<input type="submit" value="submit" />
    </fr:form>
    
  </body>
</html>
