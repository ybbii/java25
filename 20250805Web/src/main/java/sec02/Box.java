package sec02;

public class Box<X> {

	private X t;
	
	public void set(X t) {
		this.t = t;
	}
	
	public X get() {
		return t;
	}
}
