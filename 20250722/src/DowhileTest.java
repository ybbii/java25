
public class DowhileTest {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		
		do {
			sum += i;
			i++; // 이 문장의 위치에 따라 합계값이 달라짐 밑에 써야함
		} while (i <= 10);
		
		System.out.printf("1~10 합계 : %d\n", sum);
		
	}

}
