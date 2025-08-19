//package com.du.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.du.dto.Dept;
//
//public class DeptDao {
//	private Connection getConnection() throws ClassNotFoundException, SQLException {  // DBMS 접속
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
//		return conn;
//	}
//	
//	public void delete(String deptno) {
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		try {
//			conn = getConnection();
//			stmt = conn.prepareStatement("delete from dept where deptno = ?");
//			stmt.setString(1, deptno);
//			stmt.executeUpdate();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//		        if (stmt != null) stmt.close();
//		        if (conn != null) conn.close();
//		    } catch (SQLException e) {
//		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
//		    }
//			
//		}
//	}
//	
//	public void update(Dept dept) {
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		try {
//			conn = getConnection();
//			stmt = conn.prepareStatement("update dept set dname = ?, loc = ? where deptno = ?");
//			stmt.setString(1, dept.getDname());
//			stmt.setString(2, dept.getLoc());
//			stmt.setInt(3, dept.getDeptno());
//			stmt.executeUpdate();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//		        if (stmt != null) stmt.close();
//		        if (conn != null) conn.close();
//		    } catch (SQLException e) {
//		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
//		    }
//			
//		}
//	}
//	
//	public void insert(Dept dept) {
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		try {
//			conn = getConnection();
//			stmt = conn.prepareStatement("insert into dept(deptno, dname, loc) values (?, ?, ?)");
//			stmt.setInt(1, dept.getDeptno());
//			stmt.setString(2, dept.getDname());
//			stmt.setString(3, dept.getLoc());
//			stmt.executeUpdate();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//		        if (stmt != null) stmt.close();
//		        if (conn != null) conn.close();
//		    } catch (SQLException e) {
//		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
//		    }
//			
//		}
//	}
//	
//	public List<Dept> selectList() {
//		List<Dept> list = new ArrayList<>();
//		
//		Dept dept = null;
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		ResultSet rs = null;
//		try {
//			conn = getConnection();
//			stmt = conn.prepareStatement("select deptno, dname, loc from dept");
//			rs = stmt.executeQuery();
//			while (rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				dept = new Dept(deptno, dname, loc);
//				list.add(dept);
//			}
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//		        if (rs != null) rs.close();
//		        if (stmt != null) stmt.close();
//		        if (conn != null) conn.close();
//		    } catch (SQLException e) {
//		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
//		    }
//			
//		}
//		return list;
//		
//	}
//	
//	public Dept selectOne(int deptno) {
//		Dept dept = null;
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		ResultSet rs = null;
//		try {
//			conn = getConnection();
//			stmt = conn.prepareStatement("select deptno, dname, loc from dept where deptno = ?");
//			stmt.setInt(1, deptno);
//			rs = stmt.executeQuery();
//			if (rs.next()) {
//				int deptno1 = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				dept = new Dept(deptno1, dname, loc);
//			}
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//		        if (rs != null) rs.close();
//		        if (stmt != null) stmt.close();
//		        if (conn != null) conn.close();
//		    } catch (SQLException e) {
//		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
//		    }
//			
//		}
//		return dept;
//	}
//	
//}