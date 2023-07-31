package StaticConcept;

public class MainMethodConcept {

	// calling purpose
	// no buss logic
	// no return
	// CMA
	// no need to create the obj to call main()
	//PSVM - String[]
	public static void main(String a[]) {
		System.out.println("this is the main guy");
		
		MainMethodConcept.main(10);
		MainMethodConcept.main(10,"Naveen");
	}

	public static void main(int a) {
		System.out.println("hi");
		System.out.println(a);
	}

	public static void main(int a, String b) {
		System.out.println("hello");
		System.out.println(a + b);
	}

}
