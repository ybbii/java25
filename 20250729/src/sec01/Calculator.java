package sec01;

public class Calculator {
	
	// 오버로딩_매개변수의 타입,개수,순서가 달라야 함
	void method() {}
	int method(int x) {return 0;}
	
	
	
	
	// 필드
	private int x, y;
	
	// 기본 생성자
	public Calculator() {}
	
	// 생성자
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// setter_메소드를 통해 접근하는 이유
	public void setX(int x) {
		if (x < 0) {
			this.x = -x;
			return;
		}
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	

	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(x, y);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}


// 이 코드의 단점
// execute 메소드의 매개변수 박아놓은 것 

// 이 코드의 장점
// 유기적으로 메소드들끼리 움직임
