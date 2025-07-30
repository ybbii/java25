package sec01;

class A {} 

class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PromotionEx {
	public static void main(String[] args) {
		// 다향성이란?
		// 객체 생성은 자식으로 하고 변수 선언을 부모로 할 수 있음
		// 생성자 클래스와 객체가 달라도 됨
		B b = new B();
		A a1 = b;
		
		C c = new C();
		A a2 = c;
		
		D d = new D();
		A a3 = d;
		
		B b1 = d;
	}
}
