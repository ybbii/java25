package sec02;

public class A02 {
	A02() {
		System.out.println("A 생성자");
	}
	
	class B {
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
		A02 a = new A02();
		A02.B b = a.new B();
		b.method1();
		A02.B.method2();
	}
}
