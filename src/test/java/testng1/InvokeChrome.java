package testng1;

	
	
	
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class InvokeChrome {
		@Test
		public void invokechrome() {

			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\BCG1\\\\src\\\\test\\\\resources\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
		}

	}
	
	

