package OOP_Encapsulation;

import java.io.PrintStream;

public class LoginPage {

	private String username;
	private String password;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		if(password != null) {
			if(password.length()>=8) {
				this.password = password;
			}
		}
		
	}

	public String getPassword() {
		return password;
	}

	
	public void doLogin() {
		System.out.println("login with : " + username +" : " + password);
	}
	
	
}

