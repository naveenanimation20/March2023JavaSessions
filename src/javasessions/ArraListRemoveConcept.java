package javasessions;

import java.util.ArrayList;

public class ArraListRemoveConcept {

	public static void main(String[] args) {

		ArrayList<String> empList = new ArrayList<String>();
		
		empList.add("Karishma");//0
		empList.add("Tom");//1
		empList.add("Rina");//2
		empList.add("Ravi");//3
		empList.add("Azmoon");//4
		empList.add("testing");//5
		empList.add("Azmoon");//6
		empList.add(null);//6
		empList.add(null);//6


		
		System.out.println(empList);
		
		//empList.add("Naveen");//5
		
//		empList.remove("Rina");
//		System.out.println(empList);
		
//		empList.remove("Azmoon");
//		System.out.println(empList);
		
		empList.remove(6);
		System.out.println(empList);



		
		
//		empList.add(1, "Peter");
//		
//		System.out.println(empList);

//		empList.remove(3);
//		System.out.println(empList);
//		System.out.println(empList.get(3));
		
//		empList.add(0, "Testing");
//		System.out.println(empList);
//
//		empList.add("Selenium");
//		System.out.println(empList);

		
//		empList.add(8, "Cypress");
//		
//		System.out.println(empList);
		
		
		
	}

}
