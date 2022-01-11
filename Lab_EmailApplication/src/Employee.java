import java.util.*;
public class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;	
	}
	
	void display() {
		System.out.println("Dear "+this.firstName+" your generated credentials are as follows-");
	}
	
	void generateEmailAddress(String department) {
		System.out.println("E-mail--->"+this.firstName+this.lastName+"@"+department+".company.com");
	}
	
	void generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();//random is an object of Random class.
	      char[] password = new char[length];//array variable password is character type
	      password[0] = numbers.charAt(random.nextInt(numbers.length()));
	      password[1] = numbers.charAt(random.nextInt(numbers.length()));
	      password[2] = numbers.charAt(random.nextInt(numbers.length()));
	      password[3] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[4] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[5] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[6] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[7] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      
	      for(int i = 8; i< length ; i++) {
	          password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	       }
	       System.out.println(password);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String firstName = myObj.nextLine();
		System.out.println("Enter your Last Name: ");
		String lastName = myObj.nextLine();
		Employee emp = new Employee(firstName, lastName);
		System.out.println("Enter The Department(HR/tech/admin): ");
		String dept = myObj.next();
		emp.display();
		emp.generateEmailAddress(dept);
		emp.generatePassword(8);
	}
}