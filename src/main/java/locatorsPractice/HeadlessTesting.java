package locatorsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting {

	WebDriver driver;

	@BeforeTest

	public void NoBrowser() {
		//Error is displayed
		//java.lang.NoSuchMethodError: org.openqa.selenium.chrome.ChromeOptions.addArguments([Ljava/lang/String;)Lorg/openqa/selenium/chrome/ChromeOptions;
 
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--incognito");
		op.addArguments("--headless");
		op.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(op);
	}

	@Test
	public void HeadlessTagName() {

		driver.get("https://www.expedia.co.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no link are " + links.size());

		for (WebElement ele : links) {

			System.out.println(ele.getText() + "-----Link -----" + ele.getAttribute("href"));
		}
	}
}
