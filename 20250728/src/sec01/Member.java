package sec01;


// 생성자 오버로딩
public class Member {
	String name;
	String phone;
	String address;
	int sal;

	// 기본 생성자
	// 디폴트 값이 있을 땐 여기에 넣음
	Member() {
		this("사용자", "010-1234-5677", "성남", 50);
	}
	
	void method() {}
	
	// 괄호 안에 타입이나 갯수가 다르면 원래는 메소드 명을 다르게 해야 함
	// this()와 this.은 다른거임
	public Member(String name, String phone) {
		this(name, phone, "서울", 100);
	}

	public Member(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	// 수동으로 생성자를 명시적 작성하면 컴파일러가 기본 생성자를 안 만들어줘서 에러 남
	public Member(String name, String phone, String address, int sal) {
		// this.은 객체와 메소드 둘 다 호출 할 수 있음
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sal = sal;
		this.method();
		System.out.println("생성 완료");
	}



	public static void main(String[] ar) {
		Member member = new Member();
	}
}
