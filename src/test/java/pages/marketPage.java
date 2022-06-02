package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class marketPage {

	private static WebElement market = null;

	public static WebElement siteName(WebDriver driver, String siteName) {
		market = driver.findElement(
				By.xpath("//div[@class=\"foundation-layout-util-subtletext\" and contains(text(),'"+ siteName +"')]"));
		return market;
	}

//	public static WebElement pmiceapp(WebDriver driver) {
//		market = driver.findElement(
//				By.xpath("//div[@class=\"foundation-layout-util-subtletext\" and contains(text(),'pmiceapp')]"));
//		return market;
//	}
//
//	public static WebElement pmiraas(WebDriver driver) {
//		market = driver.findElement(
//				By.xpath("//div[@class=\"foundation-layout-util-subtletext\" and contains(text(),'pmiraas')]"));
//		return market;
//	}

}
