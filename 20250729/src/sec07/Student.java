package sec07;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	@Override
	void method1() {
		System.out.println(name + "student");
		super.method1();
	}
}
