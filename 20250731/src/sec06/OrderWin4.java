package sec06;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OrderWin4 extends JFrame {
	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3305/Animal";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "select * from lookanimal";
	JLabel lb1 = new JLabel("관람 순서");
	JLabel lb2 = new JLabel("동물 이름");
	JLabel lb3 = new JLabel("관람 날짜");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JButton btn1 = new JButton("예약");
	JButton btn2 = new JButton("예약내역");
	JButton btn3 = new JButton("수정");
	JButton btn4 = new JButton("삭제");
	JTextArea ta = new JTextArea();
	
	public OrderWin4() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공!");
			stmt = con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con.add(lb1);
		lb1.setBounds(30, 10, 80, 40);
		con.add(lb2);
		lb2.setBounds(120, 10, 80, 40);
		con.add(lb3);
		lb3.setBounds(210, 10, 80, 40);
		
		con.add(tf1);
		tf1.setBounds(30, 50, 80, 40);
		con.add(tf2);
		tf2.setBounds(120, 50, 80, 40);
		con.add(tf3);
		tf3.setBounds(210, 50, 80, 40);
		
		con.add(btn1);
		btn1.setBounds(30, 100, 80, 40);
		
		con.add(btn2);
		btn2.setBounds(110, 100, 90, 40);
		
		con.add(btn3);
		btn3.setBounds(200, 100, 80, 40);
		
		con.add(btn4);
		btn4.setBounds(280, 100, 80, 40);
		
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta);
		sp.setBounds(30, 150, 280, 100);
		con.add(sp);
		
		this.setSize(400, 300);
		this.setLocation(800, 400);
		this.setTitle("동물원 관람 예약 시스템 v1.0");
		showOrders();
		this.setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String orderId = tf1.getText();
				String animal = tf2.getText();
				String date = tf3.getText();

				sql = String.format("insert into lookanimal(order_id, animal, a_date) values ('%s', '%s', %s)", 
						orderId, animal, date);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				showOrders();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showOrders();
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String orderId = tf1.getText();
				String animal = tf2.getText();
				String date = tf3.getText();

				sql = String.format("update lookanimal set animal = '%s', a_date = %s where order_id = '%s'", 
						 animal, date, orderId);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				showOrders();
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String orderId = tf1.getText();

				sql = String.format("delete from lookanimal where order_id = '%s'", orderId);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				showOrders();
			}
		});
		
	}
	
	public void showOrders() {
		sql = "select * from lookanimal";
		try {
			rs = stmt.executeQuery(sql);
			String str = "";
			while (rs.next()) {
				String orderId = rs.getString("order_id");
				String animal = rs.getString("animal");
				String date = rs.getString("a_date");
				
				str += String.format("%s\t%s\t%s\n", orderId, animal, date);
			}
			ta.setText(str);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new OrderWin4();

	}

}




