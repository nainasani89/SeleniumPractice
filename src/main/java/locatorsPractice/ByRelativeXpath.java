package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browser.LaunchChromeWebDriverManager;

public class ByRelativeXpath extends LaunchChromeWebDriverManager {
  @Test
  
  public void RelativeXpath() throws InterruptedException{
	  
	  driver.get("https://www.google.com/");
	  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("expedia india",Keys.ENTER);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
  }
}
