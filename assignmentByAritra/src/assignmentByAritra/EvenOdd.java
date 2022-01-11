package assignmentByAritra;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		chkEvenOdd(num);

	}
	public static void chkEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
		System.out.println(num+"is odd");
		}
	}
}