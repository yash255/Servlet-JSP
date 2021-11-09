<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="yash"></c:set>
<c:out value="${name }"></c:out>

<c:if test="${3>2}">
<h2>this is true</h2>
</c:if>

<%! int a=5;
int b=0;
%>
<% int division=a/b; %>

<h1>division is: <%= division %></h1>






</body>
</html>