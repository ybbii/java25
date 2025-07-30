package sec05;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("파이널리는 조건 상관없이 항상 실행");
		}
	}
}
