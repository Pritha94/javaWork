package assignmentByAritra;
import java.util.Scanner;

public class Factorial{ 
	@SuppressWarnings("resource")
	public static void main (String args[])  
	{  
		int fact = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=sc.nextInt();
		for(int i= 1;i<=number;i++) {
			 fact= fact *i;
		}
		System.out.println("The Factorial of " +number+" is "+ fact);	
	}
	
}