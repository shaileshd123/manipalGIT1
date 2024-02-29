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
			
			String expectedTitle = "OrangeHRM";
			
			Assert st;
			Assert.assertEquals(actualTitle, expectedTitle);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			Thread.sleep(2000);
			driver.close();
			
			

		}

		private void assertEquals(String actualTitle, String expectedTitle) {
			// TODO Auto-generated method stub
			
		}

		

	}
	
	
	

