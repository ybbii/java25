package sec01;

public class StringTest {

	public static void main(String[] args) {
		// 변수 생성 시 각 메모리 주소가 생기므로 문자가 같아도 다른 게 맞음
		String str1 = null;
		String str2 = null;
		
		if (str1 != null && str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}

}
