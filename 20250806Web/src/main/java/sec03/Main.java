package sec03;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("끼리빠리");
		Product card2 = factory.create("몽시리");
		card1.use();
		card2.use();
	}

}
