package sec01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		//Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		//객체 저장
		map.put("신용", 85);
		map.put("홍길", 90);
		map.put("동장", 80);
		map.put("홍길", 95);
		System.out.println("총 Entry 수: " + map.size());

		// 객체 찾기
		System.out.println("\t홍길동: " + map.get("홍길"));
		System.out.println();
		
		
		System.out.println("******************");
		for (String name : map.keySet()) {
			System.out.println(map.get(name));
		}
		System.out.println("******************");
		
		
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		
		// 객체 삭제
		map.remove("홍길");
		System.out.println("총 Entry 수: " + map.size());
		
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
