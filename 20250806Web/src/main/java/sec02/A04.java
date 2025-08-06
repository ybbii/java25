package sec02;

public class A04 {

	class B {}
	static class C {}
	
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스는 A객체 생성을 안했기 때문에 안됨
	// 정적은 직접 바로 사용 가능 하기 때문에 됨
	static B field3 = new A04().new B();
	static C field4 = new C();
	
	void method1() {
		B v1 = new B();
		C v2 = new C();
	}

}
