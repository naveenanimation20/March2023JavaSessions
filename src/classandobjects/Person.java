package classandobjects;

public class Person {

	// Method overloading: Poly(many) + Morphism(forms) --> CompileTime(static binding) 
	// within the same class if you have multiple methods:
	// 1. with the same name
	// 2. with the different parameters
	// 3. with the different types of parameters
	// 4. with the different sequence/order of the parameters
	// 5. return type does not matter

	public void test() {// 0 param
		System.out.println("0 param");
	}

	public String test(int a) {// 1 param
		return "testing";
	}
	
	
	public Integer pop(Integer a) {//call/pass by ref
		System.out.println("bye");
		return 100+a;
	}
	
//	public int pop(int a) {//call by value
//		System.out.println("hiiii");
//		return 1000;
//	}
	
//	public int pop(long a) {
//		System.out.println("hello");
//		return 1000;
//	}
	
	

	public int test(int a, boolean flag, char c) {// 1 param
		return 100;
	}

	public void test(int a, int b) {// 2 params

	}

	public void test(String a) {// 1 param

	}

	public void test(String a, int b) {// 2 params - string, int

	}

	public void test(int y, String x) {// 2 params - int, string

	}

	public void test(int b, String a, int c) {// 3 params - int, string, int

	}

	// real time use cases of Method Overloading:
	// amazon:
	// search:
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {
		System.out.println(name + " " + price);
	}

	public void search(String name, int price, String color) {

	}

	// login:
	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, String role) {

	}

	public void login(String phone, int otp) {

	}

	// payment:
	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	// uber:
	// booking
	public void booking(String stPoint, String endPoint) {
		
	}

	public void booking(String stPoint, String endPoint, String carType) {

	}
	
	//255
	public void booking(String stPoint, String endPoint, String carType, int persons) {

	}
	
	

	public static void main(String[] args) {
		Person p = new Person();
		//which method has to be called -- its already decided at the compile time --it will not be decided at the run time.
		p.search("macbook");
		p.search("Mouse", 1000);
		p.search("laptop", 1000, "silver");
		
		
		int u = p.pop(10);
		System.out.println(u);//110
	}

}
