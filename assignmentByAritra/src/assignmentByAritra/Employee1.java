/**
 * method name and class name  same,  known as constructor 
 * constructor is used mainly taken input  send as parameter
 * constructor is called on that moment when object has been created
 * 
 **/

package assignmentByAritra;
import java.util.Scanner;

public class Employee1 {
	int id;
	float salary;
	String name;
	
	Employee1 (int id, float salary, String name) {
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+salary+" "+name);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id:");
		int id=sc.nextInt();
		System.out.println("enter the salary:");
		int salary=sc.nextInt();
		System.out.println("enter the name:");
		String name=sc.next();
		// TODO Auto-generated method stub
		Employee1 emp=new Employee1(id,salary,name);	
		emp.display();
	}
}


