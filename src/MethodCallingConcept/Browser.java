package MethodCallingConcept;

public class Browser {

	public void b1() {
		System.out.println("b1 method");
		b2();

	}

	public void b2() {
		System.out.println("b2 method");
		Employee e2 = new Employee();
		e2.m1();
	}
	
	
	public static void p1() {
		System.out.println("p1 method");
	}
	

}

