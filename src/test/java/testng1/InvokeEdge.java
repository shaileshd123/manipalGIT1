package testng1;



	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

	public class InvokeEdge {
		
			public static WebDriver driver;
			@Test
			public void inovkefirefox() {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\BCG1\\src\\test\\resources\\msedgedriver.exe");

				WebDriver driver = new EdgeDriver();

				driver.get("https://www.selenium.dev/");
			}
		}

	
	
	

