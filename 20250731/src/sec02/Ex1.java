package sec02;

// 추상 클래스는 객체 생성 못 함
abstract class A {
	// 추상 메소드
	// 상속 받은 메소드가 반드시 재정의하게 만든 것
	// 자기 자신을 직접 객체 생성 못하지만
	abstract int method();
}

// 상속 받은 클래스로는 객체 생성 가능
class B extends A {

	@Override
	int method() {
		// 반드시 재정의 해줘야 함
		return 0;
	}}


public class Ex1 {
	public static void main(String[] args) {
		A a = new B();
	}
}
