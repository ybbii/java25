package sec01;

import java.util.Scanner;

public class ScannerTest {

	// 방법 3. 메소드 밖에서 필드 선언 후 프린트를 메인에서 함
	//String str;
	
	// 방법 1. static 메소드로 호출
	static void method(Scanner sc) {
		System.out.print("입력> ");
		String str = sc.nextLine();
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		method(sc);
		
		// 방법 2. 객체 생성해서 메소드 호출
//		ScannerTest sct = new ScannerTest();
//		sct.method(sc);
	}

}
