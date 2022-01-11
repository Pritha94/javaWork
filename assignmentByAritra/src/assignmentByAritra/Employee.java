package assignmentByAritra;

public class Employee {
	int sal;
	String name;
	
	void getSalary(int sal, String name) {
		this.name = name;
		this.sal = sal;
	}
	
	void display() {
		System.out.println("The Salary of Employee "+name+" is "+sal);
	}
}
