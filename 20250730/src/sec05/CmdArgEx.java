package sec05;

public class CmdArgEx {
	
	// 커맨드 라인 아규먼트
	public static void main(String[] args) {
		String[] arr = {"홍길동", "김자바"};
		System.out.println(arr[2]);
		
		
		String str = args[1];
		System.out.println(args[0]);
		System.out.println(str);
	}
}
