package sec01.ex01;

import java.util.Scanner;

public class ArrayTest1 {

	// Scanner, nextLine() 사용해 점수 입출력
	public static void main(String[] args) {
		int score[] = new int[3]; // 정수 배열 3개 생성
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<score.length; i++) {
			System.out.printf("%d 점수를 입력하세요 :", i);
			score[i] = Integer.parseInt(sc.nextLine());
			sum += score[i];
		}
		
		avg = sum / (double) score.length;
		System.out.printf("총점 : %d, 평균 : %f\n", sum, avg);
	
	}

}
