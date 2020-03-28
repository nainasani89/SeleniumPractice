package browser;

import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

 WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		//String path = "D:\\Javasel\\driver/chromedriver.exe";
		
		
	String macpath = System.getProperty("user.home")+File.separator+"driver"+File.separator+"chromedriver";
	String winpath = System.getProperty("user.home")+File.separator+"driver"+File.separator+"chromedriver.exe";
	
	if (System.getProperty("os.name").startsWith("Windows")) {
		System.setProperty("WebDriver.chrome.driver",winpath);
	}else if(System.getProperty("os.name").startsWith("MacOS")){
			System.setProperty("WebDriver.chrome.driver", macpath);
	}
	

		driver =new ChromeDriver();
		}
	}
