package sec02;

public class A01 {
	class B {} // 인스턴스 멤버 클래스 A객체 생성 먼저 해야 함

	static class C {} // 정적 멤버 클래스 A클래스 바로 접근 가능

	void method() { // 로컬 클래스 메소드가 실행할 때만 사용 가능
		class D {}
		D d1 = new D();	
	}
		
		
	public static void main(String[] args) {
		// A를 먼저 선언해야 B를 사용할 수 있다
//		A a1 = new A();
//		B b1 = a1.new B();
			
		B b1 = new A01().new B();
			
		A01.C c1 = new A01.C();
		
	}
}
