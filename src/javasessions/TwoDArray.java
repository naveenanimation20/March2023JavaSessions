package javasessions;

import java.util.Arrays;
import java.util.List;


public class TwoDArray {

	public static void main(String[] args) {

		Object data[][] = new Object[3][3];
		
		data[0][0] = "Virat";
		data[0][1] = 25;
		data[0][2] = "Bangalore";
		
		data[1][0] = "Sachin";
		data[1][1] = 35;
		data[1][2] = "Mumbai";
		
		data[2][0] = "Dhoni";
		data[2][1] = 30;
		data[2][2] = "Chennai";
		
		System.out.println(Arrays.deepToString(data));
		System.out.println(data.length);
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[0].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

		//
		Object d[][] = {
				{"Naveen", "Selenium", "Google"},
				{"Tom", "Peter", "MS"},
		};
		
		System.out.println(Arrays.deepToString(d));

		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[0].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		List<Object[]> list = Arrays.asList(d);
		System.out.println(Arrays.deepToString(list.get(0)));
		System.out.println(Arrays.deepToString(list.get(1)));

	}

}
