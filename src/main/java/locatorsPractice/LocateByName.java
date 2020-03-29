package locatorsPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browser.LaunchChromeWebDriverManager;

public class LocateByName extends LaunchChromeWebDriverManager{
	
  @Test
  public void byName() throws InterruptedException {
	  
	  driver.get("https://www.expedia.com/");
	  Thread.sleep(1000);
	  driver.findElement(By.id("account-menu")).click();
	  Thread.sleep(2000);
	//  driver.findElement(By.id("account-signin")).click();
	  //Thread.sleep(2000);
	  driver.findElement(By.id("account-register")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("signup-first-name")).sendKeys("FirstName001");
	  Thread.sleep(2000);
	  driver.findElement(By.name("signup-last-name")).sendKeys("LastName001");
	  Thread.sleep(2000);
	  driver.findElement(By.id("gss-modal-01"));
  }
}
