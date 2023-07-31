package javasessions;

public class LoopsConcept_2 {

	public static void main(String[] args) {

		// 10 to 1:
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		//
		for (int p = 10; p >= 1; p--) {
			System.out.println(p);// 1098....1
		}
		System.out.println("------");

		// do-while:
		// 1 to 10:
		int s = 1;
		do {
			s++;
			System.out.println(s);// 246810
			s++;
		} while (s <= 10);
		// use cases for do-while:
		// element is already present on the page -- no need to come inside the llop:
		// drop down -- default value ---> 0, 2, 5, 10

		System.out.println("----------");
		//
		int l = 1;
		do {
			System.out.println(l);// 12345Hi
			if (l == 5) {
				System.out.println("Hi");
				break;
			}
			l++;
		} while (l <= 100);

		System.out.println("====");

		// even numbers: for loop: 2 4 6 8 10
		for (int e = 2; e <= 10; e = e + 2) {
			System.out.println(e);
		}

		System.out.println("------");

		// 1 to 100 but print "hii" if the number is divisble by 5:
		for (int num = 1; num <= 100; num++) {
			System.out.println(num);
			if (num % 5 == 0) {
				System.out.println("hii");
			}
		}

		// odd/even numbers with % --> 1 to 100
		// num % 2 == 0 --> even

		System.out.println("-------");
		// double with loop:

		for (double d = 1.0; d <= 10.0; d++) {
			System.out.println(d);// 1.0 2.0 3.0 .....10.0
		}

		System.out.println("-------");
		// 1.0 1.1 1.2
//		for(double v=1.0; v<=10.0; v=v+0.1) {
//			System.out.println(v);
//		}

		System.out.println("---print the ASCII table----");
		// char: a to z --> 97 to 122
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + " " + (int) c);
		}

		System.out.println("A to Z Ascii table");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " " + (int) c);
		}

		System.out.println("-------");
		//
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
			if (c == 'y') {
				System.out.println("execute my test cases");
				break;
			}
		}

		System.out.println("------");
		//
		int count = 0;
		for (;;) {
			System.out.println("bye");
			if (count == 5) {
				break;
			}
			count++;
		}

		//
		int pointer = 0;
		while (true) {
			System.out.println("checking the element in attempt : " + pointer);

			if (pointer == 10) {
				System.out.println("element is displsyed...click on ele");
				break;
			}
			pointer++;
		}

		// for each loop with arrays
		// streams -- lambda

//		int m = 10;
//		int n = 20;

		int m = 10;
		int n = 20;
		int u = 30;

		// click sendkeys gettext
		String actions = "click";

		switch (actions) {
		case "click":
			System.out.println("ele is clicked");
			break;
		case "sendkeys":
			System.out.println("ele is clicked");
			break;
		case "gettext":
			System.out.println("ele is clicked");
			break;

		default:
			break;
		}
		
		
		int b = 1;
		while(b<=10) {
			System.out.println("hello world");
			b++;
		}
		System.out.println("=====");
		
		int s1 = 1;
		int number = 7;
		while(s1<=100) {
			if(s1 % number == 0) {
				System.out.println(s1);
			}
			s1++;
		}

		//
		System.out.println("0 to 9 Ascii table");
		for (char c = '0'; c <= '9'; c++) {
			System.out.println(c + " " + (int) c);
		}
		
		//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		int w = 1;
		while(w<=10) {
			System.out.println(w);
				if(w % 7 ==0) {
					System.out.println("bye -- see u tmw");
					break;
				}
			w++;	
		}
	}

}
