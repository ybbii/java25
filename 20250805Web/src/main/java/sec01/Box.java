package sec01;

public class Box {

	// Object 클래스는 모든 클래스의 조상
	private Object object;
	
	// setter
	public void set(Object object) {
		this.object = object;
	}
	
	// getter
	public Object get() {
		return object;
	}
}
