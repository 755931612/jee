<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>简单计算器</title>
    
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
    <s:form action="jisuan" theme="simple">
    	请输入第一个数：<input type="text" name="num1">
    	请输入第二个数：<input type="text" name="num2"><br>
    	<s:submit name="operation" value="加" align="left" ></s:submit>
		<s:submit name="operation" value="减" align="left" ></s:submit>
		<s:submit name="operation" value="乘" align="left" ></s:submit>
		<s:submit name="operation" value="除" align="left" ></s:submit>
      </s:form>  
  </body>
</html>
