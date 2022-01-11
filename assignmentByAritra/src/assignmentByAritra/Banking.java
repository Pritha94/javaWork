package assignmentByAritra;

import java.util.*;
public class Banking {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accno: ");
		int accno=sc.nextInt();
		System.out.println("Enter the name: ");
		String name=sc.next();
		System.out.println("Enter the amount: ");
		float amount=sc.nextFloat();
		Account acc=new Account(accno,name,amount);
		acc.display();
		System.out.println("______________________");
		System.out.println("Enter the Deposite amount: ");
		float deposite=sc.nextFloat();
		Account acc1 = new Account(deposite);
		acc1.checkBalance();
		System.out.println("______________________");
		System.out.println("enter the Withdrawl amount: ");
		float withdrawl=sc.nextFloat();
		acc.withdraw(withdrawl);
		acc.checkBalance();	
		System.out.println("______________________");

	}
}