package StringConcept;

import ExceptionHandling.FrameworkException;

public class StringReverseConcept {

	public static String reverseString(String str) {
		
		//1. null check
		if(str == null) {
			System.out.println("NULL VALUES ARE NOT ALLOWED");
			throw new FrameworkException("STRING CAN NOT BE NULL");
		}
		
		//2. blank check
		if(str.isBlank()) {
			System.out.println("Blank VALUES ARE NOT ALLOWED");
			throw new FrameworkException("STRING CAN NOT BE Blank");
		}
		
		int len = str.length();
		System.out.println(str + " length is : " + len);
		
		//3. len ==0
		if(len == 0) {
			System.out.println("str length is zero");
			//return str;
			return "str length is zero";
			//return "-1";
		}
		
		//4. length check len == 1
		if(len == 1) {
			return str;
		}
		
		//5. len >1
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);// muineleS
		}
		return rev;
	}

	public static void main(String[] args) {

		// Selenium --> muineleS
		// T -- T
		// te -- et
		// 123 -- 321
		// null -- ??

		//test cases:
		
		System.out.println(reverseString("123"));

		String revString = reverseString("111");//111
		if(revString.equals("111")) {
			System.out.println("pallindrom string");
		}else {
			System.out.println("not pallindrom string");

		}
		
//		System.out.println(reverseString(" "));
//		System.out.println(reverseString(""));
//		System.out.println(reverseString("Selenium"));
//		System.out.println(reverseString("Selenium test"));
//		System.out.println(reverseString("123"));
//		System.out.println(reverseString("T"));
//		System.out.println(reverseString(null));
		
		//testing selenium cypress ---> sserpyc 
		//123 -- 321 -- no string
		
		


	}

}
