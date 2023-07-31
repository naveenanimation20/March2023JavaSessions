package ConstructorChaining;

public class Employee {

	String name;
	int age;
	double salary;

	public Employee() {
		this("kapil", 20);
		
	}

	public Employee(String name, int age) {
		this(name, age, 90.0);
		this.name = "Mitaj";
		this.age = 35;

	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	
	public static void main(String a[]) {
		Employee obj = new Employee();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
	}
	
	
	
	

}
