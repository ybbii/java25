import java.util.Scanner;

public class ScannerTest {
            // static = 자동 컴파일 로딩(객체 생성 따로 안해도 바로 쓸 수 있음)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		String inputData = sc.nextLine();
		
		int sum = Integer.parseInt(inputData); // 문자열을 정수로 타입 변환
		System.out.println(sum+10);
		// System.out.println(Integer.parseInt(inputData)+10);
	}

}
