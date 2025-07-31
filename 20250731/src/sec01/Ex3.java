package sec01;


class A {}
class B extends A {}
class D extends B {}
class E extends B {}


public class Ex3 {
	// 다형성
	public static void method(B b) {}
	
	public static void main(String[] args) {
		// 자식으로 변수 선언 하고 객체 생성을 부모로 하는 것이라 잘못된 것임
		// method((B)new A());
		
		method(new B());
		B b1 = new D();
		method(b1);
		method(new E());
	}

}
