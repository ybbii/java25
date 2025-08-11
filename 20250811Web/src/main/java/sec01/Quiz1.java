package sec01;

public class Quiz1 {
	public static void main(String[] args) {
		GreaterThan gt = (a, b) -> a > b? true : false;
		System.out.println(gt.result(100, 30));
	
		
		
		int x = 100;
		int y = 30;
		if (x > y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		boolean z = (x > y ? true : false);
		System.out.println(z);
	}
}
