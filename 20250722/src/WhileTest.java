
public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		
		while (i <= 10) {
			sum = sum + i;
			i++; // 이 문장의 위치에 따라 합계값이 달라짐 밑에 써야함
		}

		System.out.printf("1~10 합계 : %d\n", sum);
		
	}

}

