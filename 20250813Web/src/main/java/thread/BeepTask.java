package thread;

public class BeepTask implements Runnable {

	@Override
	public void run() {
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
