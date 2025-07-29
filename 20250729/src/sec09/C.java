package sec09;

import sec08.A;

public class C extends A {
	public C() {
		super();
		this.field = "value";
		this.method();
	}
	
	public void method() {
		this.field = "value";
		this.method();
	}
}
