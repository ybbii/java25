<%@page import="sec02.Student"%>
<%@page import="java.util.ArrayList"%>
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
ArrayList<Student> list = new ArrayList<>();
list.add(new Student("홍", "서울", "1234"));
list.add(new Student("전", "경남", "3333"));
list.add(new Student("이", "충북", "4444"));
list.add(new Student("김", "하와이", "5432"));
list.add(new Student("고", "제주멤", "7777"));

request.setAttribute("list", list);

%>
<jsp:forward page="to2.jsp" />
</body>
</html>