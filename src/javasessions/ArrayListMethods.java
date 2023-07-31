package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		
		ArrayList<String> ar = new ArrayList<String>(5);
		//vc=5, pc=0
		//5/2 = 2
		
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(1);//0
		marksList.add(2);//1
		marksList.add(3);//2
		marksList.add(4);//3
		
		marksList.remove((Object)2);
		System.out.println(marksList);

		//ArrayList Literals:
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
		System.out.println(browserList);
		System.out.println(browserList.size());//pc=3
		System.out.println(browserList.get(0));
		for(String e : browserList) {
			System.out.println(e);
		}

		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "Peter", "Ravi", "Shubham", "Sagar"));
		System.out.println(empList);//normal list
//		Collections.reverse(empList); //reversed
//		System.out.println(empList); //reversed list
//		
//		for(String e : empList) {
//			System.out.println(e);
//		}

		//
		for(int i = empList.size()-1; i>=0; i--) {
			System.out.println(empList.get(i));
		}
		//
		
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10,20,30,50,90,900));
		System.out.println(numList);
		Collections.reverse(numList);
		System.out.println(numList);
		
		//
		Integer num[] = {12,34,55,11,22,33};
		//array to arraylist:
		List<Integer> numbersList = Arrays.asList(num);
		System.out.println(numbersList.size());
		
		
		String browser[] = {"chrome", "firefox", "edge"};
		List<String> browserNamesList = Arrays.asList(browser);
		System.out.println(browserNamesList.size());//3
		
		//
		ArrayList<String> list = new ArrayList<String>() {
			{
				add("Java");
				add("Python");
				add("Ruby");
			}
		};
		System.out.println(list.size());
		list.add("C#");
		System.out.println(list.size());
		
		//JDK 1.9
		//Immutable List -- > can not be changed now - no add/remove
		List<Integer> nList = List.of(1,2,3,4,5);//5
		System.out.println(nList.size());
//		nList.add(6);
//		System.out.println(nList.size());
//		nList.remove(1);
//		System.out.println(nList.size());
		
		//
		ArrayList<String> monthsList = new ArrayList<String>();//vc=10, pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("MARCH");
		monthsList.add("APRIL");
		monthsList.add("May");
		monthsList.add("JUNE");
		//vc=4, pc=6
		
		monthsList.trimToSize(); //trim the VC to the current pc
		//vc=6,pc=6
		//vc=6/2=3
		
		
		//
		monthsList.add(0, "Month");
		//monthsList.add(10,"July");//IOB
		System.out.println(monthsList);
		
		Collections.swap(monthsList, 0, 1);
		System.out.println(monthsList);
		
		Collections.reverse(monthsList);
		System.out.println(monthsList);
		
		List<Object> ls = Collections.emptyList();
		System.out.println(ls.size());
		
		Collections.sort(monthsList);
		System.out.println(monthsList);
		
		//create a number list---1,4,11,22,2,34
		//print in sorting --> asc order
		//print in sorting --> desc
		
		//add a value in the middle of the list:
		//1,2,3,??,4,5,6,7
		//mid = size()/2
		//add(mid,30)
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(1);//0
		ll.add(2);//1
		ll.add(3);//2
		ll.add(4);//3
		ll.add(5);//4
		ll.add(6);//5
		ll.add(7);//6
		
//		int mid = ll.size()/2; //7/2 = 3
//		ll.add(mid, 30);
		System.out.println(ll);
		
		ll.set(6, 60);
		System.out.println(ll);
		
		
		


	}

}
