package StaticConcept;

public class Car {

	String name;
	String engineNumber;
	String chasisNumber;
	double price;
	final static int wheels=4; //class static final var
	
	//utils/generic functions
	public static void displayLogo() {
		
	}
	
	public void getUrl() {
		
	}
	
	

	public static void main(String[] args) {
		
		final int i = 10;//local var
		
		Car c1 = new Car();
		c1.name = "Audi A6";
		c1.chasisNumber = "AEBVNM121212";
		
		Car c2 = new Car();
		c2.name = "Audi Q5";
		c2.chasisNumber = "AUDI121212122";
		
		Car c3 = new Car();
		c3.name = "BMW  X7";
		c3.chasisNumber = "BMWVNM121212";
		
		//Car.wheels = 5;
		
		System.out.println(c3.name +  " "  + c3.engineNumber + " " + c3.chasisNumber + " "  + Car.wheels);
		

	}

}
