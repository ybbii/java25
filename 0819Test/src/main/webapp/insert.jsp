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
}

th, td {
	padding: 10px 20px;
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
		  <li><a href="emp">사원 정보</a></li>
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
<table>
<form action="insert" method="post">
<input type="hidden" name="isUpdate" value="${param.isUpdate}" />
<h1 style="margin-top:20px; font-size:20px;">사원 관리</h1>
<tr><td>empno</td><td><input type="text" name="empno" value="${dto.empno}" /></td></tr>
<tr><td>ename</td><td><input type="text" name="ename" value="${dto.ename}" /></td></tr>
<tr><td>job</td><td><input type="text" name="job" value="${dto.job}" /></td></tr>
<tr><td>mgr</td><td><input type="text" name="mgr" value="${dto.mgr}" /></td></tr>
<tr><td>hiredate</td><td><input type="text" name="hiredate" value="${dto.hiredate}" /></td></tr>
<tr><td>sal</td><td><input type="text" name="sal" value="${dto.sal}" /></td></tr>
<tr><td>comm</td><td><input type="text" name="comm" value="${dto.comm}" /></td></tr>
<tr><td>deptno</td><td><input type="text" name="deptno" value="${dto.deptno}" /></td></tr>
<tr><td>등록/수정</td><td><input type="submit" /></td></tr>
</form>
</table>
</body>
</html>