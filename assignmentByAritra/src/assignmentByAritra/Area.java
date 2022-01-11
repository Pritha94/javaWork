package assignmentByAritra;
import java.util.*;
import static java.lang.Math.pow; 
import static java.lang.Math.sqrt;

class AreaCalc{
	/* Member or attribute variable */
	int length;
	int breath;
	int side;
	int a;
	int b;
	int c;
	float rad;
	/* Method */
	void area(int length,int breath){
		this.length = length;
		this.breath = breath;
		int res = this.length * this.breath;
		System.out.println("The area of Rectangle is : " + res);
	}
	void area(float a){
		this.rad = a;
		double res = pow(this.rad, 2) * 3.14;
		System.out.println("The area of Circle is: "+ res);
	}
	void area(int a,int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		float s=(this.a+this.b+this.c)/2;
		double res=sqrt((s-this.a)*(s-this.b)*(s-this.c)); 
		System.out.println("The area of Triangle is : "+ res);
	}
	void area(int a) {
		this.side = a;
		double res = pow(this.side, 2);
		System.out.println("The area of Square is : "+ res);
	}
}
	
	public class Area{
		@SuppressWarnings("resource")
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AreaCalc area = new AreaCalc();
		System.out.println("For Triangle:");
		System.out.println("Enter the 1st side: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd side: ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd side: ");
		int c = sc.nextInt();
		area.area(a, b, c);
		System.out.println("_________________________________________");
		System.out.println("For Square:");
		System.out.println("Enter the side: ");
		int side = sc.nextInt();
		area.area(side);
		System.out.println("_________________________________________");
		System.out.println("For Rectangle:");
		System.out.println("Enter the length: ");
		int len = sc.nextInt();
		System.out.println("Enter the breath: ");
		int bre = sc.nextInt();
		area.area(len, bre);
		System.out.println("_________________________________________");
		System.out.println("For Circle:");
		System.out.println("Enter the radius: ");
		float rad = sc.nextFloat();
		area.area(rad);
		System.out.println("_________________________________________");
		}
}
