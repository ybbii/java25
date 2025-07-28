package sec01;

public class SingleMain {

	public static void main(String[] args) {
		Single1 sg1 = new Single1();
		Single1 sg2 = new Single1();
		
		Single1 sg3 = Single1.getInstance();
		Single1 sg4 = Single1.getInstance();
	
		if(sg3 == sg4) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
