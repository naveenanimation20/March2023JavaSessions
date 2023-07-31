package OOP_Abstraction;

public interface USMedical extends WHO, UN{
	
	int min_fee = 10;
	//vars are static and final by default

	// method has no body
	// only method declaration/method prototype
	// no buss logic
	// abstract methods
	//abs method -- static not allowed
	
	//abstraction -- hiding the implementation
	
	//100% abstraction
	public void physioServices();

	public void cardioServices();

	public void ENTServices();
	
	public void emergencyServices();
	
	public void test(int a);
	
	public String get(int a);
	public String get(int a, int b);
	
	@Override
	public void covidVaccination();
	
	
	// JDK 1.8: partial abstraction
	//1. can have static method with method body(buss logic):
	public static void USMedPharmacy() {
		System.out.println("US -- Med Pharmacy");
	}
	
	public static void USMedPharmacy(int a) {
		System.out.println("US -- Med Pharmacy");
	}
	
	//2. can have a default method (non static) with method body:
	default void billing() {
		System.out.println("US -- medical billing");
	}
	
	default void billing(int a) {
		System.out.println("US -- medical billing");
	}
	
	

}
