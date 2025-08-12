package sec01;

import java.util.Arrays;
import java.util.List;

public class Quiz1 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Lambda", "Stream");
		words.stream()
			.map(word -> word.toUpperCase())
			.forEach(System.out::println);
	}
}
