<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int num = Integer.parseInt(request.getParameter("num"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	for (int i = 1; i <= 9; i++) {
	%>
	<%=num%>
	*
	<%=i%>
	=
	<%=num * i%>
	<br />
	<%
	}
	%>

</body>
</html>