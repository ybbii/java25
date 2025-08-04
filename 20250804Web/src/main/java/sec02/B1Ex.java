package sec02;

public class B1Ex {

	public static void main(String[] args) {
		double  x = 3.14;
		int y = (int) x;
		
		A1 a1 = new B1();
		a1.run();
		
		
		
		// ((B1) a1).methodB1();
	
		// 위 코드와 똑같음 두가지 방법
		B1 b1 = (B1) a1; // 강제 타입 변환
		b1.methodB1();
	}

}
