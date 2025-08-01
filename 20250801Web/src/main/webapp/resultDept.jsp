<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dept 테이블</title>
<style type="text/css">
table, th, td {
	border: 1px solid #ccc;
	border-collapse: collapse;
}

th, td {
	padding: 10px 20px;
}
</style>
</head>
<body>
	<%@ page import="java.sql.*, javax.sql.*"%>
	<%
	String deptno = request.getParameter("deptno");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/spring5fs", "root", "1234");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM dept where deptno = "+ deptno);
	%>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<%
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("deptno")%></td>
		</tr>
		<%
		}
		} catch (SQLException e) {
		out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
		out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		try {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
		} catch (SQLException e) {
		out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		}
		}
		%>
	</table>
</body>
</html>












