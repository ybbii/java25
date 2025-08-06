package sec02;

public class Outter {
	
	// final 속성이랑 똑같기 때문에 특별한 연산 못 함
	public void method1(int arg) {
		
		// 확정된 값이기 때문에 선언부분에서 변경 못 함
		int var = 1;
		var = 2;
		
		class Inner{
			public void method() {
				int result = arg + 100;
			}
		}
	}
}
