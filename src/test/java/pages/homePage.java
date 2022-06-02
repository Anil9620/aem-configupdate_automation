package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	static WebElement sites = null;

		public static WebElement sites(WebDriver driver) {
		sites = driver.findElement(By.xpath("//div[@class=\"globalnav-homecard-title\" and contains(text(),'Sites')]"));
		return sites;

	}

}
