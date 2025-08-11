package sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<Student> list= new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			System.out.print((i+1) + "학생 학번> ");
			String sno = scan.nextLine();
			System.out.print((i+1) + "학생 이름> ");
			String name = scan.nextLine();

			// student 객체 생성해서 arraylist에 추가
			list.add(new Student(sno, name));
		
		}
		
		// ArrayList 출력
		for (Student stu : list) {
			System.out.println(stu);
		}
	}

}
