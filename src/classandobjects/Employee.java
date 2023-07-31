package classandobjects;

import java.util.ArrayList;

public class Employee {
	
	//Class --> Category, BluePrint, Templates
	//Object: physical entity created from Class (Category)
	//Every object is having its own properties
	
	//class/global vars:
	String name;
	int age;
	double salary;
	String city;
	
	public Employee() {
		
	}
	

	public static void main(String[] args) {

		int i = 10; //local variable
		
		//create the object of the class: using new keyword
		Employee obj = new Employee();
		
		//Employee - class name
		//obj --> object ref name
		//new - is keywrod to create the object
		//new Employee() --> Object
		
		obj.name = "Tom";
		obj.age = 20;
		obj.salary = 12.33;
		obj.city = "LA";
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		Employee obj1 = new Employee();
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.salary);
		System.out.println(obj1.city);
		
		
		ArrayList<String> ar = new ArrayList<String>(20);//vc=20,pc=3
		
		ar.add("test");
		ar.add("testing");
		ar.add("testautomaton");
		
		ar.trimToSize(); //vc = pc = 3
		
		
		for(String e : ar) {
			if(e.equals("testing")) {
				ar.set(1, "cypress");
			}
		}
		
		
		
		
		
		
		ar.removeAll(ar);
		System.out.println(ar);
		
		ArrayList<String> lang = new ArrayList<String>();
		lang.add("JAVA");
		lang.add("Py");
		
		ar.addAll(lang);
		System.out.println(ar);

		
		
		

		
	}

}
