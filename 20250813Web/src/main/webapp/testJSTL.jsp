<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setAttribute("name", "홍길동");
request.setAttribute("money", 5000);
request.setAttribute("dataList", Arrays.asList("홍", "김", "박", "이"));

// forwarding
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="data" items="${dataList}">
${data } <br/>
</c:forEach>

<c:choose>
<c:when test="${money >= 10000 }">
돈 많앙많앙 
</c:when>
<c:when test="${money > 0 }">
돈 쪼꼼쪼꼼 
</c:when>
<c:otherwise>
돈 없뚄
</c:otherwise>
</c:choose>

<c:if test="${name == '홍길동' }">
이름은 홍길동입니다.<br/>
</c:if>

<c:forEach var="i" begin="1" end="10">
${i }<br/>
</c:forEach>
</body>
</html>