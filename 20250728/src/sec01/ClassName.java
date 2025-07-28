package sec01;



// 인스턴스 객체는 생성해서 사용 하고
// static 객체는 생성 안함
class ClassName2 {
	// static이 붙지 않으면 인스턴스 멤버임
	int field1;
	void method1() {
		// 인스턴스 안에서 호출해서 사용 가능 
		field1 = 100;
		method2();
	}
	
	static int field2;
	static void method2() {
	}
}


public class ClassName {
	
	// static이 붙은 유무에 따라 메인 메소드에서의 사용이 달라짐
	// class를 따로 생성해도 사용 가능
	public static void main(String[] args) {
		ClassName2.method2();
		
		ClassName2 cn2 = new ClassName2();
		cn2.method1();
		
		ClassName2 cn3 = new ClassName2();
		cn2.method1();
	}
}
