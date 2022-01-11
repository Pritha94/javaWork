package assignmentByAritra;
 class Address{
	String city, state, country;
	
	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class Emp {
	int id;
	String name;
	Address address;
    Emp(int id, String name, Address address){
    	this.id=id;
    	this.name=name;
    	this.address=address;
    }
    void display() {
    	System.out.println(id +" "+name);
    	System.out.println(address.city);
    	System.out.println(address.state);
    	System.out.println(address.country);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("kolkata","West Bengal","India");
		Emp emp = new Emp(111, "@Pri", address);
		
		emp.display();

	}

}
