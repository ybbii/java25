package sec04;

public class Main {

	public static void main(String[] args) {
		
		// 괄호 안에는 매개변수를 넣어줘야함 
		MyFunctionalInterface fi = (x) -> { return String.valueOf(x); };
		String str = fi.method(100);
		System.out.println(str);
	}

}
