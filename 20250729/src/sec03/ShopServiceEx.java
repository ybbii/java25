package sec03;

public class ShopServiceEx {

	
	// getInstance() 메소드로 싱글톤 얻음
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 shopservice 객체입니다");
		} else {
			System.out.println("다른 shopservice 객체입니다");
		}
	}

}
