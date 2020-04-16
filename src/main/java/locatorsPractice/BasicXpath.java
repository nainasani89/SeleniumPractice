package locatorsPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browser.LaunchChromeWebDriverManager;

public class BasicXpath extends LaunchChromeWebDriverManager {
	@Test
  public void byBasicXapth() throws InterruptedException {
	  
	  // xpath using combination of attributes
	  
	  driver.get("https://www.expedia.co.in/");
	  
	  driver.findElement(By.id("account-menu")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("account-register")).click();
	  Thread.sleep(2000);
	  
	 // We can user "and" & "or" key word
	  
	  driver.findElement(By.xpath("//input[@type='text' and @name = 'signup-first-name']")).sendKeys("Naina");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='text' and @name = 'signup-last-name']")).sendKeys("Sani");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='email' and @name = 'signup-loginid']")).sendKeys("Test@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='password' and @id ='gss-signup-password']")).sendKeys("Test@123");
	  Thread.sleep(2000);
	 // driver.findElement(By.xpath("//input[@type='password' and @id ='gss-signup-password']")).clear();
	  driver.findElement(By.xpath("//input[@type ='password' and  id = 'gss-signup-password' or @class= 'clear-btn-input' ][1]")).clear();
  }

}
