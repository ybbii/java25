package sec01.ex01;

import java.util.Scanner;

public class ArrayTest2 {

	// 고정 배열 말고 입력 받아 배열 생성
	public static void main(String[] args) {
		int score[]; // 배열 변수 선언 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 점수의 개수 : ");
		int count = Integer.parseInt(sc.nextLine());
		score = new int[count]; //초기화

	}

}
