package assignmentByAritra;
import java.util.*;

public class LinearSearch {

	@SuppressWarnings("resource")
	public static void main (String[] args) {
		int counter, num, item, array[];
		Scanner sc = new Scanner(System.in);//create an object of scanner class which define in java
		
		System.out.println("Enter number of elements:  ");
		num  = sc.nextInt();
		
		array = new int[num]; // creating the array to store the numbers declaration of array
		System.out.println("Enter "+ num +" integer");
		// loop to store each no in array
		for(counter=0; counter<num; counter++) {
			array[counter]=sc.nextInt();
		}
		
		System.out.println("Enter the search value");
		item=sc.nextInt();
		for(counter=0; counter<num; counter++) {
			if(array[counter]==item) {
				System.out.println(item+ " is present at location "+(counter+1));
				break;
			}
		}
		
		if(counter==num) {
			System.out.println(item+" is not present in the list");
		}	
		
	}
	
}
