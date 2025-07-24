package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//java swing을 이용해 GUI창 만드는 프로그램
// JFrame이 창을 나타냄
class MyFrame extends JFrame implements ActionListener {
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;
	JLabel lab1;
	JLabel lab2;
	JLabel lab3;
	JLabel lab4;
	JLabel lab5;
	int money = 0;
	boolean login = false;
	boolean signup = false;
	String name;
	String account;

	// 생성자 만들기
	public MyFrame() { // 생성자
		Container cp = this.getContentPane(); // 버튼 배치를 위한 컨테이너 추가
		cp.setLayout(null);

		jb1 = new JButton("입금"); // 버튼 생성
		jb1.setBounds(10, 20, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jb1);

		jb2 = new JButton("출금"); // 버튼 생성
		jb2.setBounds(100, 20, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jb2);

		jb4 = new JButton("로그인"); // 버튼 생성
		jb4.setBounds(10, 150, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jb4);

		jb5 = new JButton("회원가입"); // 버튼 생성
		jb5.setBounds(100, 150, 100, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jb5);

		lab1 = new JLabel("금액"); // 버튼 생성
		lab1.setBounds(200, 20, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(lab1);

		jt1 = new JTextField(); // 버튼 생성
		jt1.setBounds(230, 20, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jt1);

		lab2 = new JLabel("잔고 : " + money + "원"); // 버튼 생성
		lab2.setBounds(10, 50, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(lab2);

		jb3 = new JButton("확인"); // 버튼 생성
		jb3.setBounds(10, 200, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jb3);

		lab3 = new JLabel("이름"); // 버튼 생성
		lab3.setBounds(10, 100, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(lab3);

		jt2 = new JTextField(); // 버튼 생성
		jt2.setBounds(40, 100, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jt2);

		lab4 = new JLabel("계정"); // 버튼 생성
		lab4.setBounds(130, 100, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(lab4);

		jt3 = new JTextField(); // 버튼 생성
		jt3.setBounds(160, 100, 70, 30); // 위치 값을 안 주면 나타나지 않음
		cp.add(jt3);
		
		lab5 = new JLabel("로그인이 안된 상태");  // 로그인 상태 정보
		lab5.setBounds(10, 230, 170, 30);
		cp.add(lab5);

		// 창 세팅이기 때문에 순서 상관 없음
		this.setSize(500, 300); // 창 사이즈 설정
		this.setVisible(true); // 창 화면에 보이도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫으면 프로그램 종료
		this.setLocation(800, 200); // 창 위치 설정
		this.setTitle("자바 스윙 1.0"); // 창 제목 설정

		// 액션 이벤트 실행
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);

	}

	// 이벤트 처리 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb4) {
			if (name != null && account != null && name.equals(jt2.getText()) && account.equals(jt3.getText())) {
				JOptionPane.showMessageDialog(this, name + "님이 로그인했습니다.");
				lab5.setText(name + "님 로그인 상태");
				login = true;
			} else {
				lab5.setText("로그인 실패");
			}
		}
		if (e.getSource() == jb5) {
			name = jt2.getText();
			account = jt3.getText();
			JOptionPane.showMessageDialog(this, name + "님이 회원 가입을 했습니다.");
			signup = true;
		}

		if (!login) {
			JOptionPane.showMessageDialog(this, "로그인 하세요");
			return;
		}

		if (e.getSource() == jb1) {
			money += Integer.parseInt(jt1.getText());
			lab2.setText("잔고 : " + money + "원");
			jt1.setText(""); // text 작성 후 빈칸 만들기
		} else if (e.getSource() == jb2) {
			money -= Integer.parseInt(jt1.getText());
			lab2.setText("잔고 : " + money + "원");
			jt1.setText(""); // text 작성 후 빈칸 만들기
		} else if (e.getSource() == jb3) {
			// JOptionPane.showInputDialog("이름 입력");
			// JOptionPane.showMessageDialog(this, "연습");
			int ret = JOptionPane.showConfirmDialog(this, "확인");
			if (ret == JOptionPane.YES_OPTION) {
				System.out.println("잔고 : " + money + "원");
			}
		}
	}
}

public class MyWin {

	public static void main(String[] args) {
		new MyFrame();
	}

}
