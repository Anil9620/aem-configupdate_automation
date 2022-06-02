package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.PropertiesFile;

public class integrationPage {

	// public static String SiteId=null;

	public static void siteID(WebDriver driver, String SiteId)

	{
		PropertiesFile.getProperties();
		WebElement siteID = null;
		String siteIDText = driver
				.findElement(By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./siteId']"))
				.getAttribute("value");
		// String propertyName = "pmisite";

		if (siteIDText.equalsIgnoreCase(SiteId))

		{

		} else {
			link_icon(driver);

			siteID = driver.findElement(
					By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./siteId']"));
			siteID.sendKeys(SiteId);
		}

	}

	public static void environment(WebDriver driver, String Environment) {

		// String propertyURL = "https://occ.stg.iqos.com/rest";
		PropertiesFile.getProperties();
		WebElement environment = driver.findElement(
				By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./serverRestUrl']"));
		environment.sendKeys(Environment);

	}

	public static void client_Id(WebDriver driver, String ClientId) {

		WebElement client_Id = driver.findElement(
				By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./hybClientId']"));
		client_Id.clear();
		client_Id.sendKeys(ClientId);

	}

	public static void secret_Id(WebDriver driver, String SecretId) {

		WebElement secret_Id = driver.findElement(
				By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./hybSecretId']"));
		secret_Id.sendKeys(SecretId);

	}

	public static void ClientId_SupportAgent(WebDriver driver, String ClientIdForSupportAgent) {

		WebElement ClientId_Agent = driver.findElement(
				By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./hybClientIdAgent']"));
		ClientId_Agent.sendKeys(ClientIdForSupportAgent);

	}

	public static void SecretId_SupportAgent(WebDriver driver, String SecretIdForSupportAgent) {

		WebElement SecretId_Agent = driver.findElement(
				By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./hybSecretIdAgent']"));
		SecretId_Agent.sendKeys(SecretIdForSupportAgent);

	}

	public static void default_BaseStore(WebDriver driver, String DefaultBaseStore) {

		WebElement default_BaseStore = driver.findElement(
				By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./cq:hybrisBaseStore']"));
		default_BaseStore.sendKeys(DefaultBaseStore);

	}

	public static void language(WebDriver driver, String BaseStoreMap) {

		WebElement language = driver.findElement(
				By.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./contentLanguage']"));
		language.sendKeys(BaseStoreMap);

	}

	public static void endPointClickAndCollect(WebDriver driver, String Language) {

		WebElement endPointClickAndCollect = driver.findElement(By
				.xpath("//div[@class='coral-Form-fieldwrapper']//following::input[@name='./endPointClickAndCollect']"));
		endPointClickAndCollect.sendKeys(Language);

	}




	public static void link_icon(WebDriver driver) {

		WebElement link_icon = driver.findElement(By.xpath(
				"//div[@class='coral-Form-fieldwrapper']//child::a[@data-toggle-property-inheritance='siteId']//coral-icon"));
		link_icon.click();

		WebElement inheritance = driver
				.findElement(By.xpath("//button[@xpath='1']//coral-button-label[contains(text(),'Yes')]"));
		inheritance.click();

	}



}
