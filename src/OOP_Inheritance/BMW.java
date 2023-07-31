package OOP_Inheritance;

public class BMW extends Car {

	// method overriding: Polymorphism (RunTime/dynamic)
	// when we have a method in parent class and the same method in child class
	// with:
	// the same name
	// the same number of parameters
	// the same sequence/order of the parameters
	// the same return type

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	@Override
	public void engine() {
		System.out.println("BMW -- turbo engine");
	}

	// individual
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	// method hiding -- when you try to have the same parent class static method in
	// the child class
	public static void billing() {
		System.out.println("BMW - billing");
	}

	// individual private method
	// this is not method hiding
	private static void testing() {
		System.out.println("Car -- testing");
	}

}
