package locatorsPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browser.LaunchChromeWebDriverManager;

public class LocateByLinkText extends LaunchChromeWebDriverManager {
  @Test
  public void ByinkText() throws InterruptedException {
	  
	  driver.get("https://www.expedia.com");
	  Thread.sleep(3000);
	  driver.findElement(By.className("sp-name")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Bundle and Save")).click(); 
	  Thread.sleep(2000);
  }
}
