package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import browser.LaunchChromeWebDriverManager;

public class LocateByID extends LaunchChromeWebDriverManager{
	
  @Test
  public void byID() throws InterruptedException {
	driver.get("https://www.expedia.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("primary-header-flight")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("primary-header-hotel")).click();
  }
}
