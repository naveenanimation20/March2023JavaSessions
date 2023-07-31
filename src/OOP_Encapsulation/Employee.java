package OOP_Encapsulation;

public class Employee {

	// private vars
	private String name;
	private int age;
	private double salary;
	private int amount;//110, 15
	
	
	private void calculateShareAmount(int fee) {
		int i = 10;
		//int fee = 20;
		amount = i + fee;//110, 15
	}
	
	public int getAmount(int fee) {
		calculateShareAmount(fee);
		return amount;//110, 15
	}

	// public getter and setter methods:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
