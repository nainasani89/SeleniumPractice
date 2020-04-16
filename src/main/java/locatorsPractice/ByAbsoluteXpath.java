package locatorsPractice;

import browser.LaunchChromeWebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class ByAbsoluteXpath extends LaunchChromeWebDriverManager {
	
	@Test 
	
	 public void byAbsoluteXpath() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Iphone",Keys.ENTER);
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(2000);
		
	  }

}
