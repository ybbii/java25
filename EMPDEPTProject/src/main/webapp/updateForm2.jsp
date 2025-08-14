<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update2">
<input type="hidden" name="deptno" value="${dto2.deptno}" /><br/>
<input type="text" name="dname" value="${dto2.dname}" /><br/>
<input type="text" name="loc" value="${dto2.loc}" /><br/>
<input type="submit" />
</form>
</body>
</html>