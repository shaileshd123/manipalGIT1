package testng1;



	import org.testng.annotations.Test;

	public class PriorityTesting {
		@Test(priority = 0)

		public void testCase1() {
			System.out.println("Test case1 testing");
		}
		
		@Test(priority = 1)

		public void testCase2() {
			System.out.println("Test case2 testing");
		}
		
		@Test(priority = 2)

		public void testCase3() {
			System.out.println("Test case3 testing");
		}

	}
	
	
	
	

