package chap02;

public class GreeterEx {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.setFormat("%s");
		System.out.println(greeter.greet("ss"));
	}

}
