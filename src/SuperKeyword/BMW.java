package SuperKeyword;

public class BMW extends Car{

	int min_speed = 200;
	
	public BMW() {
		super(20);
		System.out.println("BMW default const...");
	}
	
	public BMW(int i) {
		super();
		System.out.println("BMW const..." + i);
	}
	
	
	public void displaySpeed() {
		System.out.println(min_speed);//200
		System.out.println(super.min_speed);//100 // 50
		
	}
	
	public void speed() {
		System.out.println("BMW speed");
		super.speed();
		System.out.println(super.min_speed);//100
		super.testing();
		Car.testing();
	}

	
	
}
