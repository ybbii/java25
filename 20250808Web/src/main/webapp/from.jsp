<%@page import="sec01.Student"%>
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
<jsp:forward page="to.jsp" />
</body>
</html>