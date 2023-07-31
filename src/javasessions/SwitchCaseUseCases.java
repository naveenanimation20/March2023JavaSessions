package javasessions;

import java.util.Arrays;

public class SwitchCaseUseCases {

	public static void main(String[] args) {

		// aeiou

		char alphabet = 'z';
		switch (alphabet) {
		case 'a':
			System.out.println("this is vowel");
			break;
		case 'e':
			System.out.println("this is vowel");
			break;
		case 'i':
			System.out.println("this is vowel");
			break;
		case 'o':
			System.out.println("this is vowel");
			break;
		case 'u':
			System.out.println("this is vowel");
			break;

		default:
			System.out.println("this is a consonant");
			break;
		}

		// env - dev/qa/stage/uat/prod

		String envName = "  prod  ";

		switch (envName.trim().toLowerCase()) {// qa
		case "qa":
			System.out.println("run it on QA");
			break;
		case "dev":
			System.out.println("run it on dev");
			break;
		case "stage":
			System.out.println("run it on stage");
			break;
		case "uat":
			System.out.println("run it on uat");
			break;
		case "prod":
			System.out.println("run it on prod");
			break;

		default:
			System.out.println("no env is found..." + envName);
			break;
		}

		// cross browser testing: chrome//ff//edge//sfari

		// days in a week/months in a year

		// booking app -- uber:
		String carType = "sedan";
		int persons = 6;
		switch (carType) {
		case "mini":
			if (persons <= 4) {
				System.out.println("mini is allocated");
			}
			break;

		case "sedan":
			if (persons >= 5) {
				System.out.println("sedan is allocated");
				switch (persons) {
				case 1:

					break;
				case 6:
					System.out.println("extra price is 10 USD");
					break;

				default:
					break;
				}
			}
			break;

		default:
			break;
		}

		// user based permissions//RBAC: admin, customer, seller, partner, vendor
		// run test cases: sanity, smoke, regression, prod
		//  loan: home, car, education, personal
		int p[] = {1,4,5,2,3,22,31, 2}; 
		int[] a = new int[p.length-1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
		    if (p[i] != 22) {
		        a[j] = p[i];
		        j++;
		    }
		}

		System.out.println(Arrays.toString(a));

		
		
	}

}
