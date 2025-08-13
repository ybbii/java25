package thread;

public class threadEx {

	public static void main(String[] args) {
		// 싱글 스레드이기 때문에 동시실행 아니고
		// 순차적으로 하나씩 실행 됨
		for (int i=0; i<5; i++) {
			System.out.println("삐");
			// 0.5초에 한 번씩 출력하기
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			// 0.5초에 한 번씩 출력하기
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
