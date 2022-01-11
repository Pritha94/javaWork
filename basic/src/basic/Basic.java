//The new keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.
/*
3 Ways to initialize object
There are 3 ways to initialize object in Java.

    By reference variable
    By method
    By constructor

 */
package basic;
/* Object and Class Example: main within the class */

//public class Basic {
//	int id;
//	String name;
//	public static void main(String args[]) {
//		Basic b1=new Basic();// creating an object Basic class
//		System.out.println(b1.id);
//		System.out.println(b1.name);
//		
//	}
//
//}

/*Object and Class Example: main outside the class*/

// class Test{
//	int id;
//	String name;
//}
//
//public class Basic{
//	public static void main(String args[]) {
//		Test b1=new Test();// creating an object Basic class
//		System.out.println(b1.id);
//		System.out.println(b1.name);
//		
//	}
//
//}


/* Object and Class Example: Initialization through reference */
//class Test{
//	int id;
//	String name;
//	double sal;
//}
//
//public class Basic{
//	public static void main(String args[]) {
//		Test b1=new Test();// creating an object Basic class
//		Test b2=new Test();
//		b1.id = 101;
//		b1.name = "BABU";
//		b1.sal = 20000.12;
//		
//		b2.id = 102;
//		b2.name = "PRITHA";
//		b2.sal = 24000.12;
//		
//		System.out.println(b1.id+" "+b1.name+" "+b1.sal);
//		System.out.println(b2.id+" "+b2.name+" "+b2.sal);
//	}
//
//}

/* Object and Class Example: Initialization through method */

//class Test{
//	int id;
//	String name;
//	double sal;
//	void getData(int id, String name,  double sal) {
//		this.id = id;
//		this.name = name;
//		this.sal = sal;
//	}
//	void putData() {
//		System.out.println(id+" "+name+" "+sal);
//	}
//}
//public class Basic{
//	public static void main(String args[]) {
//		Test b1=new Test();// creating an object Basic class
//		Test b2=new Test();
//		b1.getData(101, "ABHIK", 20000.12);
//		b2.getData(102, "PRITHA", 24000.50);
//		b1.putData();
//		b2.putData();
//	}
//}

/*Object and Class Example: Initialization through a constructor*/
      
/*
In Java, a constructor is a block of codes similar to the method. 
It is called when an instance of the class is created. 
At the time of calling constructor, memory for the object is allocated in the memory.
It is a special type of method which is used to initialize the object.
Every time an object is created using the new() keyword, at least one constructor is called.
It calls a default constructor if there is no constructor available in the class. 
In such case,Java compiler provides a default constructor by default.
*/

/*Default constructor*/
//class Basic{
//	Basic(){
//		System.out.println("তুমি রবে নীরবে, হৃদয়ে মম");
//	}
//	
//	public static void main(String args[]) {
//		Basic b1 = new Basic();
//	}
//}

/*Parameterized constructor*/
class Test{
	int id;
	String name;
	double sal;
	Test(int id, String name,  double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	void putData() {
		System.out.println(id+" "+name+" "+sal);
	}
}
public class Basic{
	public static void main(String args[]) {
		Test b1=new Test(101, "ABHIK", 20000.12);// creating an object Basic class
		Test b2=new Test(102, "PRITHA", 24000.50);
		b1.putData();
		b2.putData();
	}
}