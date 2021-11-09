<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page import="java.util.Random,java.util.ArrayList,java.io.*" %>
<%@page isErrorPage="true" %>
<%@page session="false" %>
<%-- <%@page extends="" %> --%>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello</h1>
	<!-- declarative tag -->
	<%!int a = 50;
	int b = 30;
	String name = "yash";

	public int doSum() {
		return a + b;

	}

	public String reverse() {
		StringBuffer br = new StringBuffer(name);
		return br.reverse().toString();
	}%>

<!-- Scriplet tag -->
	<%
	out.println(a);
	out.println("<br>");
	out.println(b);
	out.println("<br>");

	out.println(doSum());
	out.println("<br>");
	out.println(reverse());
	%>
<!-- expression tag -->
<h1>Sum is <%= doSum() %><br>
<%=name %>
</h1>

<%@include file="header.jsp" %>
<h1>Random Number:
<% Random r =new Random();
int n=r.nextInt(10);

%>
<%=n %>
</h1>

</body>
</html>