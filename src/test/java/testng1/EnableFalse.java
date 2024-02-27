package testng1;


	import org.testng.annotations.Test;

	public class EnableFalse {

		@Test(enabled = false)

		public void testCase1() {
			System.out.println("Test case1 testing");
		}
		
		@Test

		public void testCase2() {
			System.out.println("Test case2 testing");
		}
		
		@Test

		public void testCase3() {
			System.out.println("Test case3 testing");
		}

	}
	
	

