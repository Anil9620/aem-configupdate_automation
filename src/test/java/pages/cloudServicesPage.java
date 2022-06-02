package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cloudServicesPage {

	static WebDriver driver = null;

	public static WebElement click_config(WebDriver driver)

	{

		WebElement click_config = driver.findElement(By.xpath("//span[contains(text(),'Add Configuration')]"));
		return click_config;
	}

	public static WebElement select_config(WebDriver driver, String propertyName)

	{

		// Cloud Service Configurations Update
		// propertyName

		//propertyName = "Gigya Core";
		WebElement select_config = driver
				.findElement(By.xpath("//coral-selectlist-item//span[contains(text(),'" + propertyName + "')]"));
		return select_config;
	}

	public static WebElement update_gigyaCore(WebDriver driver,String propertyName,String propertyValue)

	{
		WebElement update_gigyaCore = driver
				.findElement(By.xpath("//coral-selectlist-item//span[contains(text(),'" + propertyName + "')]"));
		update_gigyaCore.click();
		WebElement pmistgph = driver.findElement(By.xpath("//span[contains(text(),'" + propertyValue +"')]"));
		return pmistgph;
	}

	public static WebElement adobeMarketing_Cloud(WebDriver driver)

	{
		WebElement adobeMarketing_Cloud = driver
				.findElement(By.xpath("//coral-selectlist-item[contains(text(),'Adobe® Marketing Cloud')]"));
		adobeMarketing_Cloud.click();

		// propertyValue needs to assgin

		WebElement pmistgph = driver.findElement(By.xpath("//span[contains(text(),'PMI Core Service')]"));
		return pmistgph;
	}

	public static WebElement cloudProxy_Configuration(WebDriver driver)

	{
		WebElement cloudProxy_Configuration = driver
				.findElement(By.xpath("//coral-selectlist-item//span[contains(text(),'Cloud Proxy Configuration')]"));
		cloudProxy_Configuration.click();

		// propertyValue needs to assgin
		WebElement IDS_worker = driver.findElement(By.xpath("//coral-selectlist-item[contains(text(),'IDS worker')]"));
		return IDS_worker;
	}

}
