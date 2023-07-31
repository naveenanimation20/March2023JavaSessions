package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String browser = null;

		if (browser == null) {
			try {
				throw new Exception("NOBROWSEREXCEPTION");
			} catch (Exception e) {
				System.out.println("browser not found....please pass the right browser");
				e.printStackTrace();
			}
		}

	}

	//finally block - DB connection
	//compile/runtime exception
	//use case of throw -- custom exception
	
}

