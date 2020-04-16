package locatorsPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browser.LaunchChromeWebDriverManager;

public class LocateByTagName extends LaunchChromeWebDriverManager {

	@Test
	public void tagName() throws InterruptedException {

		driver.get("https://www.expedia.co.in/");
		// findelements returns list of elements

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no link are " + links.size());

		for (WebElement ele : links) {
			// .getText() -> will get text of elements and getAttribute() will get return
			// values assigned to attributes
			System.out.println(ele.getText() + "-----Link -----" + ele.getAttribute("href"));
		}
	}
}
