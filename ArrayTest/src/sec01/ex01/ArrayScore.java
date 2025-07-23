package sec01.ex01;

import java.util.Scanner;

public class ArrayScore {

	public static String method(int score) {
		String grade;
		
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "F";
			break;
		}
		
		return grade;
	}

	public static void main(String[] args) {
		String name[];
		String grade[];
		int score[];
		int count;

		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 학생 수 :");

		count = Integer.parseInt(sc.nextLine());
		name = new String[count];
		grade = new String[count];
		score = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.printf("학생(%d) 이름 : ", i);
			name[i] = sc.nextLine();
			System.out.printf("학생(%d) 점수 : ", i);
			score[i] = Integer.parseInt(sc.nextLine());
			
			grade[i] = method(score[i]);
		}
		
		System.out.println("이름\t점수\t학점");
		for (int i=0; i < count; i++) {
			System.out.printf("%s\t%d\t%s\n", name[i], score[i], grade[i]);
		}

	}

}
