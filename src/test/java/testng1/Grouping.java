package testng1;



	
	import org.testng.annotations.Test;

	public class Grouping {

		@Test(groups = {"Sanity","Regression"})

		public void login() {
			System.out.println("User is Logged in");
		}
		
		@Test(groups = {"Regression"})

		public void AddToCart() {
			System.out.println("Product Added to Cart");
		}
		
		@Test(groups = {"Sanity"})

		public void Products() {
			System.out.println("Product is listed in the Cart");
		}
		
		@Test(groups = {"Regression"})

		public void Payment() {
			System.out.println("Order Placed");
		}

	}
	
	

