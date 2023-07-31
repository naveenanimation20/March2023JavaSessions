package MethodCallingConcept;

public class Employee {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
	}
	
	//static
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		Employee emp = new Employee();
		emp.m1();
	}
	
	

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.m1();
		System.out.println("-----");
		Browser browser = new Browser();
		browser.b2();

		System.out.println("-----");
		Employee.t1();
		
		System.out.println("----");
		Browser.p1();
		
	}

}
