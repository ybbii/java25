package spring;

public class Music {

	private int num;
	private String title;
	private String name;
	
	public Music() {}

	public Music(int num, String title, String name) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Music [num=" + num + ", title=" + title + ", name=" + name + "]";
	}
	
	
}
