package locatorsPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browser.LaunchChromeWebDriverManager;

public class LocateByPartialLinkTest extends LaunchChromeWebDriverManager {
  @Test
  public void patialLinkTest()  throws InterruptedException{
	  
	  driver.get("https://www.expedia.co.in/");
	 driver.findElement(By.partialLinkText("Fin")).click();
	  Thread.sleep(2000);
	  
	 // driver.findElement(By.partialLinkText("ima")).click();
	 // driver.findElement(By.xpath("//a[@href='/Hotels'][1]")).click();
	  
  }
}
