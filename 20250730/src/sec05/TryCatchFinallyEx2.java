package sec05;

public class TryCatchFinallyEx2 {
	public static void main(String[] args) {
		String[] arr = { "홍길동", "김자바" };
		String str = null;
		
		try {
			Integer.parseInt("10");
			System.out.println(arr[1]);
			System.out.println(str.toString());
		} catch(NumberFormatException | ArrayIndexOutOfBoundsException  e) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


// 다른 익셉션이랑 일반 익셉션을 같이 쓸 때는 일반 익셉션을 밑에 써야지 빠져나갈수있음