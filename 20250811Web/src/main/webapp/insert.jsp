<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*" %>
<%
request.setCharacterEncoding("UTF-8");
String title = request.getParameter("title");
String writer = request.getParameter("writer");
String content = request.getParameter("content");
%>
<%
String curTime = LocalDate.now() + "";
Connection conn = null;
Statement stmt = null;
try {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
    stmt = conn.createStatement();
    String sql = String.format("insert into board (num, writer, title, content, regtime, hits) values ('%s', '%s', '%s', '%s', 0)", writer, title, content, curTime);
	stmt.executeUpdate(sql);
    
} catch (SQLException e) {
    out.println("데이터베이스 오류: " + e.getMessage());
} catch (ClassNotFoundException e) {
    out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
} finally {
    try {
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
    }
}
response.sendRedirect("list.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>