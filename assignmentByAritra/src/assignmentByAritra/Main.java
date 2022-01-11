package assignmentByAritra;

class Parent{
	
	void display() {
		System.out.println("This is Parent Class Method");	
	}
	
}
class Child1 extends Parent{
	@override
	void display() {
		System.out.println("This is Child1 Class Method");	
	}
	
}
class Child2 extends Parent{
	
	@override
	void display() {
		System.out.println("This is Child2 Class Method");	
	}
	
}
class Child3 extends Parent{
	
	@override
	void display() {
		System.out.println("This is Child3 Class Method");	
	}

}

//Driver class
//public class Main {
//
//	public static void main(String[] args) {
//		
//        // If a Parent type reference refers
//        // to a Child object Child's
//		// is called. This is called RUN TIME
//        // POLYMORPHISM.
//		Parent ch1 = new Child1();
//		Parent ch2 = new Child2();
//		Parent ch3 = new Child3();
//		
//		ch1.display();
//		ch2.display();
//		ch3.display();
//	}

//}
