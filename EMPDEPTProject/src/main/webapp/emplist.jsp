<%@page import="DTO.EmpDTO"%>
<%@page import="DAO.EmpDAO"%>
<%@page import="DTO.DeptDTO"%>
<%@page import="DAO.DeptDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
	border: 1px solid #ccc;
	border-collapse: collapse;
	text-align: center;
}

th, td {
	padding: 10px 20px;
	text-align: center;
}
	ul {
	    list-style-type: none;
	    margin: 0;
	    padding: 0;
	    overflow: hidden;
	    background-color: rgb(53,94,169);
	    /* background-color:  #999 ; */
	}
	li {
	    float: left;
	}
	li a, .dropbtn {
	    display: inline-block;
	    color: white;
	    text-align: center;
	    padding: 14px 16px;
	    text-decoration: none;
	}
	li a:hover, .dropdown:hover .dropbtn {
	    /* background-color: red; */
	    background-color: #6799FF;
	}
	li.dropdown {
	    display: inline-block;
	}
	li a.active, a.active:hover{
	    /* background-color: #4CAF50; */
	    background-color: #6799FF;
	}
	.dropdown-content {
	    display: none;
	    position: absolute;
	    background-color: #f9f9f9;
	    min-width: 160px;
	    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
	    z-index: 1;
	}
	.dropdown-content a {
	    color: black;
	    padding: 12px 16px;
	    text-decoration: none;
	    display: block;
	    text-align: left;
	}
	.dropdown-content a:hover {background-color: #f1f1f1}
	.dropdown:hover .dropdown-content {
	    display: block;
	}
</style>
</head>
<body>
	<ul>
		  <li><a href="#home">Home</a></li>
		  <li><a href="list">사원 정보</a></li>
		  <li><a href="list2">부서 정보</a></li>
		  <li><a href="#blog">블로그</a></li>
		  <li class="dropdown">
			    <a href="#shopping" class="dropbtn">쇼핑</a>
			    <div class="dropdown-content">
				      <a href="#">가전제품</a>
				      <a href="#">의류/악세사리</a>
				      <a href="#">가방/신발</a>
			    </div>
		  </li>
		  <li class="dropdown">
			    <a href="#new" class="dropbtn">뉴스</a>
			    <div class="dropdown-content">
			      <a href="#">정치</a>
				      <a href="#">경제</a>
				      <a href="#">생활/문화</a>
			    </div>
		  </li>
		  <li style="float:right"><a class="active" href="#login">로그인</a></li>
	</ul>
<h1 style="margin-top:20px; font-size:28px;">사원 목록</h1>
<table>
<c:forEach var="dto" items="${list}">
	<tr>
	<td><a href="updateForm?empno=${dto.empno }">${dto.empno }</a></td><td>${dto.ename }</td><td>${dto.job }</td><td>${dto.hiredate }</td><td>${dto.deptno }</td><td><button type="button" onclick="location.href='delete?empno=${dto.empno}' ">삭제</button></td>
	</tr>
</c:forEach>
</table>
<br/><button type="button" onclick="location.href='insertForm' ">사원등록</button>
</body>
</html>