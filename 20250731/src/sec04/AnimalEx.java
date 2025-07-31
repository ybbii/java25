package sec04;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		// 메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
								// 자동 타입 변환
	public static void animalSound(Animal animal) {
		
		// 재정의된 메소드 호출
		animal.sound();
	}
}
