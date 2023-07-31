package MethodCallingConcept;

public class User {
	
	
	public void sendEmail() {
		System.out.println("sending email");
	}
	
	
	public static void getName(Employee e) {
		e.m3();
	}
	
	
	
	public static void getEmail(User u) {//u=u1
		System.out.println("getting email");
		u.sendEmail();//NS
		
		User.readEmail(u);
		
		u.test(20);
	}
	
	
	public static void readEmail(User u){
		System.out.println("reading email");
		u.sendEmail();
	}
	
	public void test(int i) {
		System.out.println(i);
	}
	
	

	public static void main(String[] args) {

		User u1 = new User();
		User.getEmail(u1); //call by ref
		u1.test(10);//value -- call by value
		
//		User u1 = null;
//		User.getEmail(u1);
		
	}

}
