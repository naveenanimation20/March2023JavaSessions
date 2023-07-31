package constructorconcept;

public class User {

	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean isActive;
	
	//PO - buss -- AC
	//create the user:
	//1. name, age
	//2. name, age, city
	//3. 
	//4. all fields

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public User(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public User(String name, String city, boolean isActive) {
		this.name = name;
		this.city = city;
		this.isActive = isActive;
	}

	public User(String name, int age, String city, double salary, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		User u1 = new User("Tom", 30);
		System.out.println(u1.name + " " + u1.age);

		User u2 = new User("Taru", 35, "LA");
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		
		User u3 = new User("Peter", 20, "Bangalore", 12.33, 'm', true);
		System.out.println(u3.name + " " + u3.salary  + " " + u3.isActive);	
		
		//User u4 = new User();
		
		//Testing t1 = new Testing();
		Testing.getBrowserVersion();
		
		Employee e1 = new Employee();
		
		System.gc();

	}

}
