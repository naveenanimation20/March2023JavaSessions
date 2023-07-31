package StaticConcept;

public class Employee {

	// class static vars: static keyword:

	String name;// instance var
	static int age;// static var
	
	
	public void getEmail() {
		System.out.println("get email method");
	}
	
	public static void sendEmail() {
		System.out.println("send email method");
	}
	
	public static void sendEmail(int a) {
		System.out.println("send email method"+ a);
	}
	
	public static void sendEmail(int a, int b) {
		System.out.println("send email method"+ a+b);
	}
	
	
	

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		//how to access non static vars: using Object ref name
		e.name = "Tom";
		
		//how to access static vars: 
		//1. using the Class name
		Employee.age = 20;
		//2. can access directly also:
		//age = 30;
		//3. can access using object ref name??
		//e.age = 40;
		
		System.out.println(Employee.age);
		System.out.println(e.name);
		
		//how to access non static method: using object ref name
		e.getEmail();
		
		//how to access static methods:
		//1. using the class name:
		Employee.sendEmail();
		//2. directly calling:
		sendEmail();
		//3. can access using obj ref name??
		e.sendEmail();
		
		

	}

}
