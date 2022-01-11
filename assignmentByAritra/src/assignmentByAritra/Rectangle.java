package assignmentByAritra;

import java.util.Scanner;

public class Rectangle {
	int length;
	int width;
	void insert (int length, int width) {
		this.length=length;
		this.width=width;	
	}
	void display() {
		System.out.println("The area of Rectangle is " + length*width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int len=sc.nextInt();
		System.out.println("enter the width");
		int wid=sc.nextInt();
		Rectangle r=new Rectangle();
		r.insert(len, wid);
		r.display();
	}

}
