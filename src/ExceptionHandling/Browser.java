package ExceptionHandling;

public class Browser {

	public static void main(String[] args) {

		
		String name = "naveen";
		
		if(name.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else {
			System.out.println("browser not found");
			throw new FrameworkException("browser not found");
		}
		
		System.out.println("enter the url");
		
		
	}

}
