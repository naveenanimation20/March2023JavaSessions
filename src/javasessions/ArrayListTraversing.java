package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTraversing {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		System.out.println(marksList);
		
		marksList.add(100);//0
		marksList.add(200);//1
		marksList.add(300);//2
		marksList.add(400);//3
		marksList.add(500);//4
				
		System.out.println(marksList);
		System.out.println(marksList.get(2));
		
		//print the AL with loop: for loop:
		//1. index based:
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
				if(marksList.get(i).equals(300)) {
					System.out.println("hiii");
					break;
				}
		}
		System.out.println("-----");
		//2. for each loop:
		
		for(Integer e : marksList) {
			System.out.println(e);
		}
		
		System.out.println("-----");
		//2. for each loop:
		
		for(int e : marksList) {
			System.out.println(e);
		}
		
		//
		ArrayList<String> monthsList = new ArrayList<String>();//vc=10, pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("DEC");
		
		for(String e : monthsList) {
			System.out.println(e);
		}

		System.out.println("-----");

		//
		ArrayList<Object> empDataList = new ArrayList<Object>(); //vc=10,pc=0
		empDataList.add("Manisha");
		empDataList.add(2);
		empDataList.add(1);
		empDataList.add(34.55);
		empDataList.add('f');
		empDataList.add(true);
		
		empDataList.remove(1);
		
		System.out.println(empDataList);
		
				
		for(Object e : empDataList) {
			System.out.println(e);
				if(e.equals(25)) {
					System.out.println("age is gr than 20");
				}
		}
	
				
		
		
	}

}
