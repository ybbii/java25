package sec01;

public enum Season {
	SPRING("봄", 15), SUMMER("여름", 31), FALL("가을", 18), WINTER("겨울", -3);
	
	String name;
	int temp;
	
	Season(String name, int temp) {
		this.name = name;
		this.temp = temp;
	}
}
