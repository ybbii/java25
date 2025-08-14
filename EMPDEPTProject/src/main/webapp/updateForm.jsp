<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="hidden" name="empno" value="${dto.empno}" />
<input type="text" name="ename" value="${dto.ename}" />
<input type="text" name="job" value="${dto.job}" />
<input type="text" name="deptno" value="${dto.deptno}" />
<input type="submit" />
</form>
</body>
</html>