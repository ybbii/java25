package sec04;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			// outter field 찍기
			// Neested field 찍으려면 클래스 명 없애기
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	
	public static void main(String[] args) {
		Outter.Nested nested = new Outter().new Nested();
		nested.print();
	}
}
