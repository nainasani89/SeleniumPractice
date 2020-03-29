package locatorsPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import browser.LaunchChromeWebDriverManager;

public class LocateByClass extends LaunchChromeWebDriverManager{
  @Test
  public void ByClass() throws InterruptedException{
	  
	  driver.get("https://www.expedia.com/");
	  
	  driver.findElement(By.className("sp-name")).click();
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.expedia.com/");
  }
}
