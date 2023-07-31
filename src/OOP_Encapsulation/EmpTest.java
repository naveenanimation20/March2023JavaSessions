package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(20);
		e1.setSalary(12.33);
		
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getAmount(100));//30
		
		
		Employee e2 = new Employee();
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());
		
		
		System.out.println(e2.getAmount(5));

		//LoginPageTest:
		LoginPage lp1 = new LoginPage();
		lp1.setUsername("admin@gmail.com");
		lp1.setPassword("admin@123");
		
		lp1.doLogin();
		
		LoginPage lp2 = new LoginPage();
		lp2.setUsername("cust@gmail.com");
		lp2.setPassword("cust@123");
		
		lp2.doLogin();
		
		
	}

}
