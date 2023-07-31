package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		//TC --> BIG O
		//SC ---> BIG O
		
		//1 to 5 --> 
		//1 to 1M ---> 
		
		int i = 1; 
		System.out.println(i);
		//O(1) -- Constant Time
		String s = "Selenium";
		System.out.println(s);
		//O(1)
		
		//loop: 1 to 10:
		//10 mins --> 0.00001 sec
		//space --> Aux space + actual var space 
		for(int k = 1; k<=10; k++) {
			System.out.println(k);
			System.out.println("hi");
		}
		//1 + n + n + n --> 3n+1 --> Linear Equation
		//3n + 1 --> 3n --> O(3n) ---> O(n)
		
		//
		int p = 1;
		while(p<=100) {
			System.out.println(p);
				if(p == 30) {
					System.out.println("hiii");
				}
			p++;
		}
		//1+n + n + n + 1 + n ==> 4n + 2 ==> 2(2n+1) ==> 4n --> O(4n) --> O(n)
		
		System.out.println("----");
		//nested for loops:
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		//50 51 52 53 54 55
		for(int m = 0; m<=9; m++) {
			for(int n = 0; n<=9; n++) {
				System.out.print(m+""+n+" ");//00 01 02 03
				//take some space 
				
			}
			System.out.println();
		}
		//(1+n+n+n)(1+n+n+n) ==> (1+3n)(1+3n) ==> 1+3n+3n+9n^2 ==> 9n^2 + 6n + 1 --Quadratic equation
		//9n^2+6n ==> 3n(3n+2)--> 9n^2 --> O(n^2)
		
		for(int m = 0; m<=9; m++) {
			for(int n = 0; n<=9; n++) {
				for(int k = 0; k<=9; k++) {
					System.out.print(m+""+n+k+" ");//00 01 02 03
				}
				System.out.println();
			}
			System.out.println();
		}
		//(n)(n)(n)-->n^3+n2+n+1 -- cubic
		
		
		//binary search: 25
		//1 to 30 -- len = 30
		//li = 0
		//hi = 29
		
		//30/2
		//15 + 15
		//15 --> 15/2 --> 7 + 8 
		//8 --> 8/2 --> 4 + 4 --> 4 / 2 = 2 --> 1+1
		//n --> n/2 --> n/4 --> n/8 
		//k = n/2
		//log(k) = log(n/2)
		//log(k) = log n - log2
		//log(k) = log n - 1 => log n
		
		//8/2 --> 4/2 --2/2 --> 1 
		//8 --> 0 to 7 --> 
		
		//divided by 2 --> log with base 2
		//divided by 3 --> log with base 3
		
		//log(a/b) --> log a - log b
		//k = n/2
		//log k = log(n/2) --> log n - log 2
		//log k = log n - 1
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
		list.add("naveen");
		System.out.println(list);
		
		
		
	

	}

}
