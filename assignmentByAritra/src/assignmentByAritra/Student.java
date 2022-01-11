package assignmentByAritra;

import java.util.Scanner;

public class Student {
	int rollno;
	String name;

	void getData (int r, String n) {
		rollno = r;
     	name = n;
		} 
	void display() {
		System.out.println(rollno+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll number : ");
		int roll= sc.nextInt();
		System.out.println("Enter student Name: ");
		String name = sc.next();
		Student s1=new Student();
	
	
	s1.getData(roll,name);
		
	s1.display();		
	}
	}

