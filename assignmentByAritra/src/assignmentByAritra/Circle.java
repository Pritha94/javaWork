/**
 * If a class have an entity reference, it is known as Aggregation. 
 * Aggregation represents HAS-A relationship.
 */
package assignmentByAritra;

class Operation{
	int square(int n) {
		return n*n;
	}
}


public class Circle {
	Operation op;
	double pi = 3.143;
	
	double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir = new Circle();
		double result = cir.area(5);
		System.out.println(result);

	}

}
