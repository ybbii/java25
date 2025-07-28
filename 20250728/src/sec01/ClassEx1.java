package sec01;


// 사용 관계
class G {
	void gmethod() {}
}

class H {
	void hmethod() {
		G g = new G();
		g.gmethod();
	}
}

// 집합 관계
interface D {}

class E implements D {}
class F implements D {}

class A {
	D d1 = new E();
	D d2 = new F();
}


class B {
	A a;
}

// 상속 관계
class C extends A {}

public class ClassEx1 {

	public static void main(String[] args) {

	}

}
