package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class configurationPage {

	public static WebElement cloudServices(WebDriver driver) {
		WebElement cloudServices = driver.findElement(
				By.xpath("//a[contains(text(),'Cloud Services')]"));
		return cloudServices;

	}


	public static WebElement integration(WebDriver driver) {
		WebElement integration = driver.findElement(
				By.xpath("//*[@id=\"cq-sites-properties-form\"]/div/div/nav/a[contains(text(),'Integration')][1]"));
		return integration;

	}

}
