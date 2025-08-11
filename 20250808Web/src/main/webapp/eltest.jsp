<%@page import="sec02.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Student stu = new Student("홍길동", "성님시", "010-2134-2342");
request.setAttribute("hong", stu);
%>
<h1>${hong}</h1>
<h2>${hong.name}</h2>
<h2>${hong.addr}</h2>
<h2>${hong.phone}</h2>
</body>
</html>