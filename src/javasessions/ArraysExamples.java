package javasessions;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {

		//online ecomm app:
		//cricinfo
		//
		
		//player : name, int, country, total runs, strike rate
		Object player[] = new Object[5];
		player[0] = "Rashid Khan";
		player[1] = 30;
		player[2] = "AFG";
		player[3] = 5000;
		player[4] = 110.22;
		
		Object player1[] = new Object[5];
		player1[0] = "Naveen";
		player1[1] = 20;
		
		System.out.println(player1[2]);
		System.out.println(player1[3]);
		System.out.println(player1[4]);
		
		System.out.println(Arrays.toString(player1));

		//String array:
		String st[] = new String[5];
		st[0] = "Azmoon";
		st[1] = "Raza";
		System.out.println(Arrays.toString(st));
		

		//int
		int i[] = new int[5];
		i[0] = 100;
		System.out.println(Arrays.toString(i));

		short sh[] = new short[5];
		sh[0] = 200;
		System.out.println(Arrays.toString(sh));
				
		//double:
		double db[] = new double[5];
		db[0] = 200.12;
		System.out.println(Arrays.toString(db));
		
		//char:
		char ch[] = new char[5];
		ch[0] = 'a';
		System.out.println(Arrays.toString(ch));
		
		//boolean:
		boolean bool[] = new boolean[5];
		bool[0] = true;
		System.out.println(Arrays.toString(bool));

		//int, short, long, byte: 0
		//double, float: 0.0
		//char: blank space
		//boolean: false
		//non-primitive: String, Object: null
		
		//
		int num[] = {2,4,55,1,20,67,900};
		System.out.println(Arrays.toString(num));
		num[0] = 100;
		System.out.println(Arrays.toString(num));

		num[9] = 500;
		System.out.println(Arrays.toString(num));

		
	}

}
