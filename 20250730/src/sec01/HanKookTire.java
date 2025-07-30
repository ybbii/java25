package sec01;

public class HanKookTire extends Tire {

	// 생성자
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
