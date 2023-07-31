package constructorconcept;

public class Employee {

	String name;
	int age;
	String city;

	// const:
	// 1. name should same as class name
	// 2. can not return anything/no void
	// 3. can pass parameters to the const...const overloading? yes its possible
	// 4. how to call a const...we need to create the object of the class and respective const.. will be called

	public Employee() {// 0 param -- default const...
		System.out.println("defalt const...");
	}

	public Employee(int a) {// 1 param
		System.out.println(a);
	}

	public Employee(int a, int b) {// 2 param

	}
	
	public Employee(int a, String b) {// 2 param
		System.out.println(a+b);
	}
	
	public Employee(String a, int b) {// 2 param

	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		

	}

}
