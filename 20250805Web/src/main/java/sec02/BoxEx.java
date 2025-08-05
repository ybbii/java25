package sec02;

class Apple{}

public class BoxEx {

	public static void main(String[] args) {
		
		// <String>을 넣었기 때문에 강제 타입 변환을 안해도 됨
		Box<String> box = new Box<String>();
		box.set("홍길동"); 
		String name = box.get(); 
		System.out.println(name);
		
		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple()); 
		Apple apple = box2.get(); 
		
	}

}
