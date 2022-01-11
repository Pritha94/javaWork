
class SuperDepartment{

	 String departmentName() {
		return "Super Department";
	} 
	 
	String getTodaysWork() {
		return "No Work as of now";
	}
	
	 String getWorkDeadline() {
		return "Nil";
	}
	
	 String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}

 class AdminDepartment extends SuperDepartment{
	String departmentName() {
		return "Admin Department ";
	} 
	
	 String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	 String getWorkDeadline() {
		return "Complete by EOD ";
	}

}

 class HrDepartment extends SuperDepartment{
	String departmentName() {
		return "Hr Department ";
	} 
	
	String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	String doActivity() {
		return "team Lunch";
	}
	
}
class TechDepartment extends SuperDepartment{
	 String departmentName() {
		return "Tech Department  ";
	} 
	
	 String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	 String getTechStackInformation() {
		return "core Java ";
	}
}

public class Main{
	
	public static void main(String[] args) {
		HrDepartment hrDepartment = new HrDepartment(); 
		TechDepartment techDepartment = new TechDepartment(); 
		AdminDepartment adminDepartment = new AdminDepartment();
		
		adminDepartment.departmentName();
		adminDepartment.getTodaysWork();
		adminDepartment.getWorkDeadline();
		adminDepartment.isTodayAHoliday();
		}
}