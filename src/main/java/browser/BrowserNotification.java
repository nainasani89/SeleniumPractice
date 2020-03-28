package browser;

import org.testng.annotations.Test;
import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.*;

public class BrowserNotification  extends LaunchChromeWebDriverManager{
	
  @Test
  public void notification() throws InterruptedException {
	  
	  driver.get("https://www.icicibank.com/");
  }
}
