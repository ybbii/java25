package sec01;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> list = new HashSet<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("Java");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		// 반복자
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		for (String str : list) {
			System.out.println(str);
		}
	}

}
