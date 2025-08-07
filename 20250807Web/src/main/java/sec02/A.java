package sec02;

class Parent {
	void method1() {}
}

public class A {
	Parent field = new Parent() {
		int childField;
		void childMethod() {}
		
		@Override
		void method1() {
			childField = 100;
			childMethod();
		}
		
	};
	
	Parent field2 = new Parent() {};
	
	void method() {
		field.method1();
		
		Parent field3 = new Parent() {};
		
		method2(new Parent() {});
	}
	
	void method2(Parent p) {
		
	}
}



