package thread;

public class threadEx3 {

	// 메인 스레드
	public static void main(String[] args) {
		// 새로운 스레드 시작
		Thread th = new BeepTask2();
		th.start();
	
		for (int i=0; i<5; i++) {
			System.out.println("삐");
			// 0.5초에 한 번씩 출력하기
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
