package sec02;


interface AA {
	void method();
}


// A는 인터페이스이기 때문에 extends말고 implements가 와야함
// 추상과 인터페이스 공통점은 클래스를 만들어서 구현을 하던 상속을 하던 재정의를 해야함
class BB implements AA {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex2 {
	public static void main(String[] args) {
		AA a = new BB();
	}
}
