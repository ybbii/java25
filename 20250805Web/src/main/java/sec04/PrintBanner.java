package sec04;

public class PrintBanner extends Banner implements Print {
	
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWear() {
		showWithParen();
	}

	@Override
	public void printString() {
		showWithAster();
	}

}
