package testng1;



	import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

	@Test
	public class ParallelTesting {
		public void invokechrome() {

			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\BCG1\\\\src\\\\test\\\\resources\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
		}
			@Test
		
		public void invokeEdge() {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\BCG1\\src\\test\\resources\\msedgedriver.exe");

			WebDriver driver1 = new EdgeDriver();

			driver1.get("https://www.selenium.dev/");
			
		

	}
	
	
	
}
