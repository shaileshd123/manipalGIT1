package testng1;



	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class SoftAssert {
		public static WebDriver driver;
		
		@Test
		public void testSoftAssert() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\BCG1\\\\src\\\\test\\\\resources\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
			Thread.sleep(500);
			
			driver.manage().window().maximize();
			
			
			String actualTitle = driver.getTitle();
			
			String expectedTitle = "Orange";
			
			Assert st;
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			
			driver.close();
			
			

		}

		private void assertEquals(String actualTitle, String expectedTitle) {
			// TODO Auto-generated method stub
			
		}

		

	}
	
	
	

