package SuperKeyword;

public class Car extends Vehicle{
	
	int min_speed = 100;
	
	
	public Car() {
		this(90);
		System.out.println("car default const...");
	}
	
	public Car(int i) {
		System.out.println("car const..." + i);
	}
	
	
	
	public void speed() {
		System.out.println("car speed");
	}
	
	public static void testing() {
		System.out.println("car -- testing");
	}
	

}
