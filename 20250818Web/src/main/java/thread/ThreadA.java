package thread;

public class ThreadA extends Thread {

	public ThreadA() {
		this.setName("스레드A");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
