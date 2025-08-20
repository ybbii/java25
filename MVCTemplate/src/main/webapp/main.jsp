<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${aaa }
<br/>
<a href="b?val=홍길동">명령어 연습</a>
<form action="c">
<input type="text" name="nn" value="${val}"/>
<input type="text" name="n2" value="${res}"/>
<input type="submit">
</form>
</body>
</html>