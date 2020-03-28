package browser;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.*;


@Test
public class TestAnnotation  extends LaunchChromeWebDriverManager{

	public void search() {
		
		
		driver.get("https://www.google.com/");
		System.out.println("search");
	
	}
}
