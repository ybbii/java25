<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    request.setCharacterEncoding("UTF-8");

    String mid = request.getParameter("mid");
    String kname = request.getParameter("kname");
    String addr = request.getParameter("addr");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/du08", "root", "1234");

        String sql = "UPDATE member SET kname = ?, addr = ?, email = ?, phone = ? WHERE mid = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, kname);
        pstmt.setString(2, addr);
        pstmt.setString(3, email);
        pstmt.setString(4, phone);
        pstmt.setString(5, mid);

        int result = pstmt.executeUpdate();

        if (result > 0) {
            out.println("<p>회원 정보가 성공적으로 수정되었습니다.</p>");
        } else {
            out.println("<p>회원 정보를 수정할 수 없습니다. mid를 확인하세요.</p>");
        }
    } catch (SQLException e) {
        out.println("<p>데이터베이스 오류: " + e.getMessage() + "</p>");
    } catch (ClassNotFoundException e) {
        out.println("<p>드라이버 로딩 실패: " + e.getMessage() + "</p>");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            out.println("<p>리소스 정리 중 오류: " + e.getMessage() + "</p>");
        }
    }
%>

<a href="showMem.jsp">회원 목록으로 돌아가기</a>
