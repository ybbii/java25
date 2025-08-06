package sec02;

public class A03 {
	A03() {
		System.out.println("A 생성자");
	}
	
	static class B {
		B() {
			System.out.println("B 생성자");
		}
		
		int field1;
		static int field2;
		void method1() {}
		static void method2() {
			System.out.println("method2");
		}
	}
	
	public static void main(String[] args) {
		A03.B b = new A03.B();
		b.method1();
		A03.B.method2();
	}
}
