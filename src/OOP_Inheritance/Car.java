package OOP_Inheritance;

public class Car extends Vehicle {

	// final:
	// 1. constant values
	// 2. to prevent the method overridding
	// 3. to prevent inheritance

	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}

	@Override
	public void engine() {
		System.out.println("Car -- engine");
	}

	// can not be overridden but can be inherited
	public static void billing() {
		System.out.println("car - billing");
	}

	// can not be overridden, can not be inherited
	private static void testing() {
		System.out.println("Car -- testing");
	}

	public void carTesting() {
		testing();
	}

	// can not be overridden
	public final void power() {
		System.out.println("car -- power");
	}

	public final static void ABS() {
		System.out.println("car -- ABS");
	}

}
