package constructorconcept;

public class LoginTest {

	public static void main(String[] args) {

		//taru
		LoginPage lp = new LoginPage("taru@gmail.com", "taru@123");
		lp.doLogin();
		
		//vijay
		LoginPage lp1 = new LoginPage("vijay@gmail.com", "vijay@123");
		lp1.doLogin();
		
		
		
	}

}
