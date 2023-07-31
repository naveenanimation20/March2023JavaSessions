package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {

		Shopping shop = new Shopping();
		
		
		//1.
		shop.login("naveen@gmail.com", "naveen123")
				.search("Macbook Pro")
					.addToCart("Macbook Pro")
						.doPayment("9999999@ybl")
							.generateOrder()
								.logout();
		
		
		//2. 
		shop.login("naveen@gmail.com", "naveen123")
				.search("Tshirt", 1000)
					.addToCart("Tshirt")
						.logout();
		
		//3.
		shop.login("naveen@gmail.com", "naveen123")
				.search("Apple Imac")
					.search("Apple Iphone")
						.search("Apple Macbook pro")
							.addToCart("Apple Iphone")
								.doPayment("2121 2121 2121 2121", 900)
									.generateOrder()
											.logout();
		
		//4. 
		shop.login("naveen@gmail.com", "naveen123")
				.logout();
				
				
		
		
	}

}
