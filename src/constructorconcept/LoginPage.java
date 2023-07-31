package constructorconcept;

public class LoginPage {

	String username;
	String password;

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void doLogin() {
		System.out.println("login to app");
		System.out.println("entering username: " + username);
		System.out.println("entering password: " + password);
		System.out.println("user is logged in");

	}

	public void resetPwd() {
		System.out.println("reset my pwd");
	}

}
