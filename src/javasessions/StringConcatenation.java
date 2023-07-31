package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		// String is a class in Java
		// " "
		String s = "hello world";
		System.out.println(s);

		String s1 = "100";
		System.out.println(s1 + 20);

		System.out.println(10 + 20);

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";

		System.out.println(a + b);
		System.out.println(x + y);

		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);// HelloSelenium100200
		System.out.println(x + y + (a + b));// HelloSelenium300

		System.out.println(a + b + x + y + a + b);// 300HelloSelenium100200

		System.out.println("the value of a " + a);
		System.out.println("the value of b " + b);
		System.out.println("the sum is : " + (a + b));

		double c = 12.33;
		double d = 12.44;
		System.out.println(c + d);
		System.out.println(x + y + c + d);
		System.out.println(a + b + x + y + c + d);
		System.out.println(a + b + x + y + (c + d));

		char c1 = 'a';// 97
		char c2 = 'b';// 98
		System.out.println(c1 + c2);
		System.out.println(x + y + c1 + c2);

		System.out.println(c1 + c2 + x + y);

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(b / a);
		System.out.println(a * b);
		
		System.out.println(c2-c1);
		System.out.println(c1*c2);
		
		System.out.println("this emp is :" + true);
		System.out.println("your bank account is " + false);
		
		System.out.println(9/3);
		System.out.println(9/2);//4.5--> 4
		System.out.println(9.0/2);
		System.out.println(9/2.0);
		System.out.println(9.0/2.0);
		
		System.out.println(0/1);//0
		System.out.println(0/100);
		//System.out.println(9/0);//ArithmeticException: / by zero
		//System.out.println(0/0);//ArithmeticException: / by zero
		
		System.out.println(9.1/0);//Infinity
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity

		
		System.out.println(0.0/0.0);//NaN - Not A Number
		System.out.println(0/0.0);//NaN - Not A Number
		System.out.println(0.0/0);//NaN - Not A Number
		
		//System.out.println(0/0);//AE
		
		
		//System.out.println('a' / 0);//AE
		
		System.out.println('a'/ '0');//97/48
		
		//-128 to 127
		byte b1 = 125;
		byte b2 = 120;
		int b3 = b1+b2; //30
		System.out.println(b3);
		
		int b4 = b2-b1;
		
		int f1 = 100;
		int f2 = 200;
		int f3 = f1+f2;
		
		System.out.println(10 % 2);
		System.out.println(9 % 2);
		System.out.println(50 % 3);
		System.out.println(100 % 3);
		
		
		byte h = 065; //octal number -- base of 8
		System.out.println(h);
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 0 + 48 + 5 = 53
		
		short t = 0736;//0-7
		System.out.println(t);
		
		int u = 0765676543;
		System.out.println(u);
		//0765676543 = (0 × 8⁹) + (7 × 8⁸) + (6 × 8⁷) + (5 × 8⁶) + (6 × 8⁵) + (7 × 8⁴) + (6 × 8³) + (5 × 8²) + (4 × 8¹) + (3 × 8⁰) = 131562851
		
		
		
		byte x1 = 125;//1
		byte x2 = 120;//1
		int x3 = b1+b3;//64 bits -- 4 ===> 6
		
		byte x5 = (byte) (x1+x2);//245
//		System.out.println(x3);//245-256 = -11
		
		//-128 to 0 to 127 --> 256
		
		int age = 10;
		//byte /short
		
//		int x1 = 125;//4
//		int x2 = 120;//4
//		int x3 = b1+b3;//4 ===> 12
		
		System.out.println(9f/2f);
		
		
		
		
	}

}
