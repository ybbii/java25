package sec04;

import java.util.HashMap;
import java.util.Map;

public class Quiz4 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student("1234", "홍"), 100);
		map.put(new Student("4321", "김"), 90);
		map.put(new Student("1234", "홍"), 70);
	
		System.out.println(map.get(new Student("1234", "홍")));
	}

}
