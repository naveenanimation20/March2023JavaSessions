package javasessions;


public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 10:
		//1. while loop:
		
		int i = 1;
		while(i<=100) {
			System.out.println(i);//
			i++;
			//++i;
			//i=i+1;
		}
		System.out.println("------");
		//
		int l = 1;
		while(l<=100) {
			if(l==5) {
				System.out.println("hi");
				break;
			}
			
			System.out.println(l);//1
			l++;
		}
		
		System.out.println("-------");
		//
		while(true) {
			System.out.println("welcome to taj hotel -- 24x7x365 days");
			break;
		}
		
		System.out.println("-------");
		//
		int count = 0;
		while(count<=100) {
			System.out.println(count);//012345...25.....50....100
				if(count==25) {
					System.out.println("25 runs");
				}
				
				if(count == 50) {
					System.out.println("half century");
				}
				
				if(count == 100) {
					System.out.println("century");
				}
			
			count++;	
				
		}
		
		//use cases of while loop:
		//we have to use while loop when number of iterations are not fixed
		//wait for the element on the page: 0, 2, 5, 10, 20
		//wait for the page loading: 0, 5, 10, 20
		//drop down values: 
		//webtable pagination: 
		//calendar: 
		//carousel:
		
		System.out.println("--------");
		//1 to 10:
		//for loop: 
		for(int k=1; k<=10; k++) {
			System.out.println(k);//1
		}
		//
//		System.out.println("----");
//		for(int p=1; p<=10; ) {
//			System.out.println(p);//111111111
//		}
		
		//
		int g=1;
		for(; g<=10; ) {
			System.out.println(g);//1234
			g++;
		}
		System.out.println("------");
		//
		for(int m=1; m<=10; m++) {//11
			System.out.println(m);//13579
			m++;//10
		}
		
		//
		System.out.println("------");

		for(;;) {
			System.out.println("Bye");
			break;
		}
		
		
		//
		for(int run=0; run<=100; run++) {
			System.out.println(run);
				if(run == 0) {
					System.out.println("DUCK....bye");
					break;
				}
				
				System.out.println("Hello");
		}
		
		System.out.println("----");
		
		//use cases for loop:
		//use for loop when number of iterations are fixed
		//to fetch the values from the array 
		int arr[] = new int[4];
		//0 to 3
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		for(int n=0; n<arr.length; n++) {
			System.out.println(arr[n]);//100 200 300 400 
		}
		//drop down -- month -- 1 to 12
		//country drop down
		//menu - sub menu
		
		
		//do-while
		//for each
		//streams - lambda
		
		
		
		
		
	}

}
