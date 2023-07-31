package classandobjects;

public class Testing {

	// WAF:
	// launch a browser --> chrome//ff//safari//edge
	// statement: browser is launched
	// return: true/false -- boolean
	// launchBrowser(browserName (string))

	public boolean launchBrowser(String browserName) {
		System.out.println("launching the browser..." + browserName);

		boolean flag = true;

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome -- PASS");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox -- Pass");
			break;

		default:
			System.out.println("plz pass the right browser..." + browserName);
			flag = false;
			break;
		}

		return flag;
	}

	// with multiple returns:
	public boolean launchBrowerTest(String browserName) {
		System.out.println("launching the browser..." + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome -- PASS");
			return true;
		case "edge":
			System.out.println("launch edge");
			return true;
		case "safari":
			System.out.println("launch safari -- pass");
			return true;
		case "firefox":
			System.out.println("launch firefox -- Pass");
			return true;

		default:
			System.out.println("plz pass the right browser..." + browserName);
			return false;
		}

	}

	public static void main(String[] args) {

		Testing test = new Testing();
		if (test.launchBrowser("opera")) {
			System.out.println("enter the url");
		}
		
		boolean f = test.launchBrowerTest("opera");
		System.out.println(f);
	}

}
