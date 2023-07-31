package ExceptionHandling;

public class Employee {
	String name;

	public void sum(int p) {

		int a = 10;
		int b = 20;
		int c = a + b;

		try {
			int cd = c / p;
		} catch (Exception e) {
		}
		System.out.println("hello");

	}

	public void test(int a, int b) {

		try {
			int c = a / b;
			Employee e = new Employee();
			e = null;
			System.out.println(e.name);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			System.out.println("B");
			System.out.println("B");

			Employee e = new Employee();
			e = null;
			System.out.println(e.name);// NPE
			int i = 9 / 0;// AE
			System.out.println(i);
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
		}

		catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		} catch (Throwable e) {
			System.out.println("some exception is coming....");
			e.printStackTrace();
		}

		System.out.println("bye");

	}

}
