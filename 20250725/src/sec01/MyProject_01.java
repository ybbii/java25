package sec01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MFrame extends JFrame implements ActionListener {
	JButton up;
	JButton del;
	JTextArea text;
	JLabel lab1;
	String msg;

	public MFrame() {
		Container cp = this.getContentPane();
		cp.setLayout(null);

		up = new JButton("글 올리기");
		up.setBounds(10, 10, 100, 30);
		cp.add(up);

		del = new JButton("글 삭제");
		del.setBounds(230, 10, 100, 30);
		cp.add(del);

		text = new JTextArea("");
		text.setBounds(10, 80, 320, 300);
		cp.add(text);

		lab1 = new JLabel("게시판");
		lab1.setBounds(10, 50, 100, 30);
		cp.add(lab1);

		this.setSize(400, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(800, 200);
		this.setTitle("게시판");

		up.addActionListener(this);
		del.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == up) {
			msg = JOptionPane.showInputDialog("글을 입력하세요");
			text.setText(text.getText() + "\n" + msg);
		} else if (e.getSource() == del) {
			text.setText("");

		}
	}
}

public class MyProject_01 {
	// 로그인 & 게시판 글 올리기 프로그램
	public static void main(String[] args) {
		new MFrame();

	}
}
