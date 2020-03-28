package browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
	driver = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver");
	driver.get("https://www.myntra.com/");
	
	}
	
	
}
