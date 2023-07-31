package javasessions;

import java.util.Scanner;

public class ConditonalOperatorsConcept {

	public static void main(String[] args) {

		System.out.println(10==20);
		
		int x = 10;
		int y = 20;
		if(x==y) {
			System.out.println("x is eq to y");
		}
		else {
			System.out.println("x is not eq to y");
		}
		
		if(x>=y) {
			System.out.println("x is eq to or grtr than y");
		}
		else {
			System.out.println("bye");
		}
		
		//> < >= <= == !=
		if(x!=y) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//
		if(true) {
			System.out.println("Hiii");
		}
		else {//dead code
			System.out.println("hello bye");
		}
		
		//
		boolean flag = false;
		if(flag) {
			System.out.println("Hiii");
		}
		else {
			System.out.println("Bye");
		}
		
		//
		double d1 = 12.33;
		double d2 = 12.34;
		if(d1==d2) {
			System.out.println("both are eq");
		}
		else {
			System.out.println("both are not eq");
		}
		
		// == Comparison Operator: is applicable for all primitive data types:
		char c1 = 'a';//97
		char c2 = 'a';
		if(c1 == 97) {
			System.out.println("c1 and c2 are eq");
		}
		
		
		//nested if - else
		int marks = 100;
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("A Grade");
					if(marks>=95) {
						System.out.println("eligible for scholarship");
					}
					else {
						System.out.println("not eligible for scholarship");
					}
			}
			else {
				System.out.println("B Grade");
					if(marks>=70) {
						System.out.println("you got 20% discount on the fee");
					}
			}
		}
		else {
			System.out.println("incorrect marks");
		}
		
		
		//if -  if - if - if
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		if(browser.equals("edge")) {
			System.out.println("launch edge");
		}
		else {
			System.out.println("plz pass the right browser...."+ browser);
		}
		
		//if - elseif
//		String browser = "chrome";
//		if(browser.equals("chrome")) {//true
//			System.out.println("launch chrome");
//		}
//		else if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		else if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		else if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		else {
//			System.out.println("plz pass the right browser...."+ browser);
//		}
		
		
	}

}
