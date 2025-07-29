package sec07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudEx {
	public static void main(String[] arg) {
		Student stu = new Student("홍길동", "12345", 1234);
		stu.method1();
	}
}
