package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("ABC");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}

		finally {
			System.out.println("im in finally block");
			try {
				int i = 8 / 0;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				e.printStackTrace();
			} finally {
				System.out.println("im in second finally block");

			}
		}

	}

}
