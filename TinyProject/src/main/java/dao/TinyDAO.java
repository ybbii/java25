package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.TinyDTO;

public class TinyDAO {

	// DBMS 접속 메소드
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");

		return conn;
	}
	
	
	// tiny 테이블의 모든 자료를 가져옴
	public List<TinyDTO> selectList() {
		List<TinyDTO> list = new ArrayList<TinyDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT * FROM tiny");
		    while (rs.next()) {
		    	int num = rs.getInt("num");
		    	String content = rs.getString("content");
		    	list.add(new TinyDTO(num, content));
		    }
		} catch (SQLException e) {
		    System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
		    System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (rs != null) rs.close();
		        if (stmt != null) stmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		        System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}

		return list;
	}
	
	public void insertOne(TinyDTO dto) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = getConnection();
		    stmt = conn.createStatement();
		    stmt.executeUpdate(String.format("insert into tiny(num, content) values (tiny_seq.nextval, '%s')", dto.getContent()));
		} catch (SQLException e) {
		    System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
		    System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (stmt != null) stmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		        System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
}
