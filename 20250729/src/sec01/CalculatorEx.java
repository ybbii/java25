package sec01;

public class CalculatorEx {

	public static void main(String[] args) {
		// 생성자 주입 방법_매개변수에 바로 넣기
		Calculator calculator = new Calculator();
		calculator.setX(7);
		calculator.setY(10);
		calculator.execute();
	}

}
