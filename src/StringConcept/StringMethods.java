package StringConcept;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		
		String s = "this is my java code and i am so happy and i am so cool";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(37));
		//System.out.println(s.charAt(38));//StringIndexOutOfBoundsException
		System.out.println(s.indexOf("t"));
		System.out.println(s.charAt(4));
		
		System.out.println(s.indexOf("i"));//1st occurrence of i
		System.out.println(s.indexOf("i", s.indexOf("i")+1));//2nd occurrence of i
		System.out.println(s.indexOf("i", s.indexOf("i", s.indexOf("i")+1)+1));//3rd
		//4th
				
		
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("cypress"));//-1
		
		String mesg = "welcome null";
		if(mesg.indexOf("admin")>0) {
			System.out.println("admin is present");
		}
		else {
			System.out.println("FAIL");
		}

		//trim:
		String test = "   selenium automation    ";
		System.out.println(test.trim());//selenium automation
		System.out.println(test);//   selenium automation    
		
		//replace:
		String dob = "01-01-1990"; //01/01/1990
		String dob2 = dob.replace("-", "/");//01/01/1990
		System.out.println(dob2);//01/01/1990
		
		dob2.intern();
		
		String dob1 = "01/01/1990";
		
		System.out.println(dob1 == dob2);
		System.out.println(dob1.equals(dob2));
		
		System.out.println("-----");
		
		String test1 = "   selenium automation    ";//scp
		//test1 = test1.trim();
		test1 = test1.replace(" ", "");//heap
		System.out.println(test1);
		
		test1 = test1.concat("cypress");
		
		
		int a = 10;
		int b = 10;
		
		
		String s1 = "JavaProgram";
		String s2 = "Java";
		String s3 = s2 + "Program";//JavaProgram -- heap
		String s4 = "Java"+"Program"; //scp
		
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		//
		String ts = "this is my java code";
		System.out.println(ts.toUpperCase());
		System.out.println(ts.toLowerCase());
		
		//substring:
		String mg = "your username is naveen";
		System.out.println(mg.substring(7));
		System.out.println(mg.substring(0, 7));
		System.out.println(mg.substring(mg.indexOf("is")+3, mg.length()));
		
		//contains:
		String g = "your username is naveen";
		System.out.println(g.contains("naveen"));
		if(g.contains("naveen")) {
			System.out.println("PASS");
		}
		
		
		//equals:
		String p1 = "Hello Selenium";
		String p2 = "Hello selenium";
		System.out.println(p1.equals(p2));
		System.out.println(p1.equalsIgnoreCase(p2));
		
		//split:
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		
		
		String lg[] = lang.split("_");
		System.out.println(lg[0]);
		System.out.println(Arrays.toString(lg));
		
		//
		String top = "xXtestingXxXSeleniumXXxXAutomationxXXCypress";
		String tp[] = top.split("xX");
		System.out.println(tp[0]);
		System.out.println(tp[1]);
		System.out.println(tp[2]);
		System.out.println(tp[3]);
		System.out.println(tp[4]);

		
		String mg1 = "your username is naveen";
		String userId = mg1.split("is")[1].trim();
		System.out.println(userId);
		
		System.out.println("-----");
		//
		String empData = "Mitaj;Automation;Pune;India;323232;SDET;123.33";
		String emp[] = empData.split(";");
		for(String e : emp) {
			System.out.println(e);
		}
		
		System.out.println("-----");

		String empData1 = "Sagar|Automation|Pune|India|323232|SDET|123.33";
		String e[] = empData1.split("\\|");
		System.out.println(e[0]);
		
		String d1 = "I Love \"Java\" and I am so happy";
		//I Love "Java" and I am so happy
		System.out.println(d1);
		
		//
		
		createXpath("Waseem");

	}
	
	
	public static void createXpath(String empName) {
		String xpath = "//a[text()='"+empName+"']";
		System.out.println(xpath);
	}
	
	
	

}
