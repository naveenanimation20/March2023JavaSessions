package OOP_AbstractClass;

import WebDriver_Arch.WebDriver;

public abstract class Page implements WebDriver{
	
	int loadingTime = 10;

	public Page() {
		this(5);
		System.out.println("Page -- default const....");
	}
	
	public Page(int i) {
		System.out.println("Page -- const..." + i);
	}

	// can not create the Object of abstract class
	// can i create the const of abstract class??????
	// Ans: YESSSSSSSS
	//it will be called when yu create the object of child class

	// no abstract methods -- 0% abstraction
	// all abstract methods -- 100% abstraction
	// partial abstraction -- 0 to 100% abstraction

	public abstract void title();

	public abstract void url();

	public void defaultPageTimeOut() {
		System.out.println("page -- time out = 20 secs");
	}
	
	public void search() {
		
	}

	public static void displayFooters() {
		System.out.println("page -- displayFooters");
	}

	public final void displayLogo() {
		System.out.println("page -- logo");
	}
	
	//Default methods are allowed only in interfaces.
//	default void billing() {
//		
//	}

}

