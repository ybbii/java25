package sec01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	JButton jb1 = new JButton("확인");
	
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100, 400);
		this.setSize(400, 400);
		
		jb1.setBounds(10, 20, 80, 50);
		con.add(jb1);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인");
				
			}
		});
	}

	public static void main(String[] args) {	
		new MyFrame();

	}

}
