package classandobjects;

public class EmployeeTest {
	
	//ACC Criteria: WAF
	//I want to calculate the score/marks of my employee
	//create a function: getEmployeemarks
	//input param: empName (String)
	//return: marks (int)
	
	public int getEmployeeMarks(String empName) {
		
		System.out.println("getting employee marks..." + empName);
		int marks=-1;
		
		if(empName.equals("Neelam")) {
			marks = 90;
			//return 90;
		}
		else if(empName.equals("Mitaj")) {
			marks = 95;
			//return 95;
		}
		else if(empName.equals("Ravi")) {
			marks = 80;
			//return 80;
		}
		else if(empName.equals("Naveen")) {
			marks = 10;
			//return 10;
		}
		else {
			System.out.println("emp name is not found....." + empName);
			//return -1;
			//return -100;
		}
		
		return marks;
	}
	

	public static void main(String[] args) {

		EmployeeTest e1 = new EmployeeTest();
		int m1 = e1.getEmployeeMarks("Tom");
		System.out.println(m1);
		
		if(m1>=0) {
			System.out.println("print the marksheet");
		}
		
	}

}
