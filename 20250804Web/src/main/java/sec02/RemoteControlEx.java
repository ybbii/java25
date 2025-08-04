package sec02;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();
		
		
		// 익명의 구현 객체 생성
		// 위의 코드처럼 객체 네임을 언급 안하고 생성해서 익명이라고 함
		rc = new RemoteControl() { 
			
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("Video를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Video를 끕니다.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 Audio 볼륨: " + this.volume);
				
			}
		};
		
		
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
	}
}
