package sec01.ex01;

public class ScoreTest {

	// case문을 이용한 점수 프로그램
	public static void main(String[] args) {
		int score = 100;
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
	}

}
