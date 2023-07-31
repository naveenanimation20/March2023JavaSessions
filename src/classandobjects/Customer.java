package classandobjects;

public class Customer {

	// instance vars
	String name;
	int age;

	// data members of the class
	// vars -- class
	// methods/functions -- are used for buss logic/feature/implementation/actions

	// can not create a method inside a method.
	// but can call a method from another method.
	// methods are independent or parallel to each other

	// types of methods:

	// 1. no return and no input:
	// void - can not return anything -- no return keyword
	public void test() { // 0 parameter
		System.out.println("test method");
		int i = 10;
		System.out.println(i);
	}

	// 2. some return and no input:
	// return type: int
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a + b;// 30
		return c;
	}

	// return type: String
	public String getTrainerName() {
		System.out.println("getting the trainer from NAL");
		String name = "naveen";
		int a = 100;
		return name;
	}

	public short getNumber() {
		System.out.println("getting number");
		return 100;
	}

	// 3. some return and some input:
	// return type: int
	// input params: a,b (int)
	public int add(int a, int b) { // parameters
		System.out.println("adding two numbers");
		int z = a + b;
		return z;
	}

	public int multiply(int a, int b) {
		System.out.println("multiplying two numbers");
		int mul = a * b;
		return mul;

	}

	public double getTotalMarks(double score, int handWritingScore, int attendScore) {
		System.out.println("calculating marks");
		double finalScore = score + handWritingScore + attendScore;
		return finalScore;
	}
	
	
	public void getURL() {
		System.out.println("print the url");
		return; //blank return/no return --> void
	}
	
	

	public static void main(String[] args) {

		System.out.println("main method");
		// create the object of the class:
		Customer c1 = new Customer();
		c1.name = "Tom";
		c1.age = 20;

		c1.test(); // calling a method
		c1.test();

		int m1 = c1.sum();
		System.out.println(m1 - 5 + 10);

		String trName = c1.getTrainerName();
		System.out.println(trName + " for JAVa and Selenium");
		if (trName.equals("naveen")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		System.out.println(c1.getNumber());// 100
		short m2 = c1.getNumber();
		System.out.println(m2 + 10);

		// System.out.println(c1.test());//syntax error
		int sum = c1.add(10, 20);// values -- arguments
		System.out.println(sum);
		sum = c1.add(100, 200);//// values -- arguments
		System.out.println(sum);

		int v1 = c1.multiply(2, 3);
		System.out.println(v1);

		double score = c1.getTotalMarks(90, -5, -10);
		System.out.println(score);

	}

}
