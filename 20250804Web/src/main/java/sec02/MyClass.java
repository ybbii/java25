package sec02;

public class MyClass {
	
	RemoteControl rc = new Television();
	
	MyClass() {
		
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {   
		RemoteControl rc = new Audio();  // 지역변수
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	// 매개변수의 다형성
	void methodB(RemoteControl rc) {  
		rc.turnOn();
		rc.setVolume(5);
	}
}
