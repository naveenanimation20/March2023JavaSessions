package classandobjects;

public class Student {

	// class vars/template vars:
	String name;
	int marks;
	char grade;

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Ravi";
		s1.marks = 90;
		s1.grade = 'A';
		
		Student s2 = new Student();
		s2.name = "Mitaj";
		s2.marks = 95;
		s2.grade = 'A';
		
		Student s3 = new Student();
		s3.name = "Vinayk";
		s3.marks = 60;
		s3.grade = 'C';
		
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade);

		System.out.println(s1);
		
		
		//no ref object:
		new Student().name = "Aman";
		new Student().marks = 80;
		new Student();
		
		//just the ref name:
		Student s4;
		s4 = new Student();
		s4.name = "Naveen";
		
		
		//Null Reference Object
		Student s5 = new Student();
		s5 = null;
		
		s5.name = "Peter";//NPE
		System.out.println(s5.name);
		
		System.gc();
		
		
		
		
		
	}

}
