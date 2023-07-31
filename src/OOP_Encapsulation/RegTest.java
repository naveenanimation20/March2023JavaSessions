package OOP_Encapsulation;

public class RegTest {

	public static void main(String[] args) {

		// CRUD:

		// POST call -- create a user
		Register reg = new Register("Neelam", 25, 9898989890L, "Pune", true);

		reg.dob = "1-1-1990";
		reg.dob = "30-12-1996";
		System.out.println(reg.dob);//30-12-1996
		
		// check my user profile
		// GET call
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		System.out.println(reg.getCity());
		System.out.println(reg.isPerm());

		// update the value:
		// PUT
		reg.setCity("Bangalore");
		reg.setPhoneNumber(9876543212L);

		System.out.println("--------");

		// check my user profile
		// GET call
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		System.out.println(reg.getCity());
		System.out.println(reg.isPerm());

		System.out.println("--------");

		//
		Register reg1 = new Register("Vishnu", 98989898765L);
		System.out.println(reg1.dob);//null

		// check my user profile
		// GET call
		System.out.println(reg1.getName());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getPhoneNumber());
		System.out.println(reg1.getCity());
		System.out.println(reg1.isPerm());

		// update: PUT
		reg1.setAge(30);
		reg1.setCity("Delhi");
		reg1.setPerm(true);

		// check my user profile
		// GET call
		System.out.println(reg1.getName());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getPhoneNumber());
		System.out.println(reg1.getCity());
		System.out.println(reg1.isPerm());

		//
		Selenium.click();
		
		
		
	}

}
