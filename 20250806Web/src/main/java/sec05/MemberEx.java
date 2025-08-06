package sec05;

public class MemberEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// 같은 blue여도 메모리 값이 다 다름
		// hashcode가 메모리 값을 보여줌
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	
		if (obj1.equals(obj2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
