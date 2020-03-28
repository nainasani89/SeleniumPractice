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
		
		
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		
		@AfterClass
		public void closechrome() {
			
			driver.close();
		}
		
}
