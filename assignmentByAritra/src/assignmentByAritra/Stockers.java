package assignmentByAritra;
import java.util.*;

public class Stockers {
	static Scanner sc=new Scanner(System.in);//creating an object of scanner class
	int size;
	int i;
	boolean bl;
	double[] array;
	int count=0;
	int count1=0;
	/*For Display Method...*/
	void display() {
		System.out.println("enter the no of companies: ");
		size=sc.nextInt();
		array=new double[size];
		for(i=0;i<size;i++) {
			System.out.println("Enter the stock price of company "+(i+1));
			double stockprice=sc.nextDouble();
			array[i]=stockprice;
			System.out.println("Whether company's stock price rose toay compare to yesterday[true/false]");
			bl=sc.nextBoolean();
			if(bl==true) {
				count++;
			}
			else {
				count1++;
			}
			
		}
	}
	void stockEntryTrue() {
		System.out.println("The total number of company whose stock prices rose today: "+count);
		}
	void stockEntryFalse() {
		System.out.println("The total number of company whose stock prices declined today: "+count1);
	}
	void sortAscend() {
		System.out.println("The company stock prices in ascending order is: ");
		Arrays.sort(array);
		for(i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}
	void sortDescend() {
		System.out.println("The company stock prices in descending order is: ");
		double temp=0;
		for(i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}
	void specificStockPrice() {
		System.out.println("Enter the stock to search ");
		double search=sc.nextDouble();
		for(i=0;i<size;i++) {
			if(search == array[i]) 
			{
				System.out.println(search+" is found");
				break;
			}
		}
		if(i==size) {
			System.out.println(search+" not found");
		}
	}
		
	public static void main(String[] args) {
	 Stockers stock=new Stockers();
	 stock.display();
	int ch=0;
	do {
		System.out.println("Enter the operation you want to perform! ");
		System.out.println("1.Display the company's stock prices in ascending order");
		System.out.println("2.Display the company's stock prices in descending order");
		System.out.println("3.Display the total number of company whose stock prices rose today");
		System.out.println("4.Display the total number of company whose stock prices declined today");
		System.out.println("5.Search a specific stock price");
		System.out.println("6.Exit 0");
		ch=sc.nextInt();
		switch(ch) {
		case 1:stock.sortAscend();
			break;
		case 2:stock.sortDescend();
			break;
		case 3:stock.stockEntryTrue();
			break;
		case 4:stock.stockEntryFalse();
			break;
		case 5:stock.specificStockPrice();
			break;	
		case 6: System.out.println("Exited successfully");
			break;
		default:System.out.println("wrong option! ");
		break;
		}
	}while(ch!=6);

	}

}