package sec01;

public class FacTest {

	int fac(int x) {
		return x == 1 ? 1 : x * fac(x - 1);
//		if (x == 0) {
//			return 1;
//		} else {
//			return x * fac(x - 1);
//		}
	}

	public static void main(String[] args) {
		FacTest ft = new FacTest();
		System.out.println(ft.fac(5));
	}
}
