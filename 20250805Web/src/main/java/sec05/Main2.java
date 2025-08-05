package sec05;

public class Main2 {

	public static void main(String[] args) {
		ExTimeCalculator cal1 = new ExTimeCalculator(new ImpleCalculator());
		System.out.println(cal1.factorial(12));
		System.out.println("-----------------------------");
		ExTimeCalculator cal2 = new ExTimeCalculator(new RecCalculator());
		System.out.println(cal2.factorial(12));
	}

}
