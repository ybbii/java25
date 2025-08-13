package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("김", "박", "정", "최");
		list.stream().forEach((s)->System.out.println(s));
		
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
	
		List<String> items = Arrays.asList("apple", "banana", "orange", "apple");
		long count = items.stream()
				.filter(item -> item.equals("apple"))
				.count();
		
		List<Integer> nums = Arrays.asList(5, 1, 9, 3);
		int max = nums.stream().max((a, b) -> a - b).get();
		System.out.println(max);
	}

}
