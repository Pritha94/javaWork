package assignmentByAritra;


public class Overriding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Sbi s=new Sbi();
         System.out.println("The rate of interest Sbi:"+ s.roi());	
		Icici i=new Icici();
		System.out.println("The rate of interest Icici:"+i.roi());	
		Axis a=new Axis();
		System.out.println("The rate of interest Axis:"+a.roi());
	}

}
