package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeWebDriverManager {

	protected WebDriver driver;
	
	@BeforeClass
	public void openchrome() {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\libs\\driver\\chromedriver.exe");
	
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
		
		@AfterClass
		public void closechrome() {
			
			driver.close();
		}
		
}
