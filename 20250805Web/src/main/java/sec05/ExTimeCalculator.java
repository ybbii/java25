package sec05;

public class ExTimeCalculator implements Calculator {

	// 인터페이스 타입 -> 위임
	private Calculator delegate;

	// 매개변수의 다형성
	public ExTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		
		long result = delegate.factorial(num);
		
		long stop = System.nanoTime();
		System.out.println((stop - start) + " 나노초");
		return result;
	}

}
