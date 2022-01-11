package assignmentByAritra;

public class Fact {

	int fact;// member variable
	int res = 1;// member variable
	
	
	Fact(int fact) { // this is a constructor of Fact class becoz the class name and method name same and this is parameterized constructor
		
		this.fact = fact;
		for(int i = 1; i<= this.fact; i++) {/*for (i=1 ; i<=n; i++)*/
			
			this.res = this.res*i;
			
		}
	}
	
	void display() { // this is for output
		System.out.println("The Factorial of "+this.fact+ " is: "+ this.res);
	}

}
