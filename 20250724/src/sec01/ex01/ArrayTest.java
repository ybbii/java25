package sec01.ex01;

public class ArrayTest {

	// 아무것도 안쓰면 패키지 내에서만 사용 가능
	static int method1(String name) {
		System.out.println(name); // -- name은 여기 블록에서 사용되는 지역변수
		return 100;
	}

	
	// 모두 접근 가능 = public
	public static void main(String[] args) {
		int x = method1("홍길동");
		System.out.println(x);
		
		
		// 배열 선언 & 초기화
		int[] arr = new int[] {100, 200, 300, 400};
		
		// int[] arr = {100, 200, 300, 400};  --짧은 코딩 버전
		String names[] = new String[5];

		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
			System.out.println(arr[i]);
		}
	}

}
