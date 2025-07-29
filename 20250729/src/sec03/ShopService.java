package sec03;

// shopservice 객체를 싱글톤으로 만들기
public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}
