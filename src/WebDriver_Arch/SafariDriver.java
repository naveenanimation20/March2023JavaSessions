package WebDriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("launch safari browser");
	}

	@Override
	public void click() {
		System.out.println("click on element");
	}

	@Override
	public void sendKeys() {
		System.out.println("sending value to element");

	}

	@Override
	public void quit() {
		System.out.println("quit browser");

	}

	@Override
	public void findElement(String ele) {
		System.out.println("find element: " + ele);

	}

}
