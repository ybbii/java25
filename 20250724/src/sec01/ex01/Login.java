package sec01.ex01;

import java.util.Scanner;

//class 이용해서 로직 돌리기
class BankAccount {
	private String name;
	private String account;
	private int balance;

	public BankAccount(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	void deposit(int balance) { // 입금
		this.balance += balance;
	}

	void withdraw(int balance) { // 출금
		this.balance -= balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class Login {

	public static void main(String[] args) {
//		String name = "홍길동";
//		String account = "H1234";
		boolean run = true;
		boolean signup = false;
		boolean login = false;
//		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		BankAccount ba = new BankAccount("홍길동", "H1234", 10000);

		while (run) {
			// if문 보다 while이 나음--조건을 충족 못 시키면 로그인을 못 빠져나감
			while (!login) {
				System.out.println("------------------------------");
				System.out.println("1.로그인 | 2.회원가입");
				System.out.println("------------------------------");
				System.out.print("선택>");

				int menu = Integer.parseInt(scanner.nextLine());

				switch (menu) {
				case 1:
					System.out.print("이름>");
					String str1 = scanner.nextLine();
					System.out.println("계정>");
					String str2 = scanner.nextLine();
					if (str1.equals(ba.getName()) && str2.equals(ba.getAccount())) {
						System.out.println("로그인 성공");
						login = true;
					} else {
						System.out.println("로그인 실패");
					}
					break;
				case 2:
					System.out.print("이름>");
					ba.setName(scanner.nextLine());
					System.out.println("계정>");
					ba.setAccount(scanner.nextLine());
					break;
				}
			}

			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.로그아웃");
			System.out.println("------------------------------");
			System.out.print("선택>");

			int menunum = Integer.parseInt(scanner.nextLine());

			switch (menunum) {
			case 1:
				System.out.print("예금액>");
				menunum = Integer.parseInt(scanner.nextLine());
				// balance += Integer.parseInt(scanner.nextLine());
				ba.deposit(menunum);
				break;
			case 2:
				System.out.print("출금액>");
				menunum = Integer.parseInt(scanner.nextLine());
				// balance -= Integer.parseInt(scanner.nextLine());
				ba.withdraw(menunum);
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(ba.getBalance());
				break;
			case 4:
				run = false; // 반복문 끊어주기
				System.out.println("로그아웃");
				break;
			}

		}

	}

}
