package sec01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// Car의 setGas() 메소드 호출
		myCar.setGas(5);;

		// Car의 isLeftGas() 메소드 호출
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run() 메소드 호출
		}
		
		// Car의 isLeftGas() 메소드 호출
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}
}
