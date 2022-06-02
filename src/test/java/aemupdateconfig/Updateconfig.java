package aemupdateconfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.cloudServicesPage;
import pages.configurationPage;
import pages.homePage;
import pages.integrationPage;
import pages.languagePage;
import pages.marketPage;

public class Updateconfig {
	static WebDriver driver = null;
	public static String propertyName = null;
	public static String propertyValue = null;
	public static String propertyLangauge=null;
	public static String SiteId = null;
	public static String Environment = null;
	public static String ClientId = null;
	public static String SecretId = null;
	public static String ClientIdForSupportAgent = null;
	public static String SecretIdForSupportAgent = null;
	public static String DefaultBaseStore = null;
	public static String BaseStoreMap = null;
	public static String Language = null;
	public static String ClickAndCollectendpoint = null;
	public static String URL = null;
	public static String UserName = null;
	public static String PassWord = null;
	public static String countryPath = null;
	public static String language = null;
	public static String market1=null;
	public static String siteName=null;

	public static void main(String[] args) {

		loginTest();
		homePageTest();
		countryPageTest();
		langaugePageTest();
		click_Properties_btn();
		goto_cloudServicesconfiguration();
		goto_integrationconfiguration();

		// close browser
		driver.close();
	}

	public static void loginTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// goto Login page
		PropertiesFile.getProperties();
		driver.get(URL);
		driver.manage().window().maximize();

		// enter user name and password
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(PassWord);
		driver.findElement(By.xpath("//coral-button-label[contains(text(),'Sign In')]")).click();

	}

	public static void homePageTest() {
		homePage.sites(driver).click();
		PropertiesFile.getProperties();
		marketPage.siteName(driver,siteName).click();

	}

	public static void countryPageTest() {

		// String countryPath =
		// "http://52.28.150.61:4502/sites.html/content/pmisite/ph";
		PropertiesFile.getProperties();
		driver.get("http://52.28.150.61:4502/sites.html/content/"+siteName+"/"+market1+"");
		//driver.get(countryPath);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void langaugePageTest() {

		PropertiesFile.getProperties();
		languagePage.en(driver,propertyLangauge,market1,siteName).click();

	}

	public static void click_Properties_btn() {

		// Action menu bar
		// Click on properties
		driver.findElement(By.xpath(
				"//button[@class='betty-ActionBar-item cq-siteadmin-admin-actions-properties-activator foundation-collection-action coral-Button--graniteActionBar coral3-Button coral3-Button--quiet']//coral-button-label[contains(text(),'Properties')]"))
				.click();

	}

	public static void goto_cloudServicesconfiguration() {
		// Calling pages under cloudServicesconfiguration page
		configurationPage.cloudServices(driver).click();
		cloudServicesPage.click_config(driver).click();
		PropertiesFile.getProperties();
		if (propertyName.equalsIgnoreCase("Gigya Core")) {
			cloudServicesPage.select_config(driver, propertyName).click();
			cloudServicesPage.update_gigyaCore(driver, propertyName, propertyValue).click();
		} else {
			cloudServicesPage.select_config(driver, propertyName).click();
		}

		// saveclose_btn();
	}

	public static void goto_integrationconfiguration() {

		// Calling pages under integrationconfiguration page

		configurationPage.integration(driver).click();
		integrationPage.siteID(driver, SiteId);
		integrationPage.environment(driver, Environment);
		integrationPage.client_Id(driver, ClientId);
		integrationPage.secret_Id(driver, SecretId);
		integrationPage.ClientId_SupportAgent(driver, ClientIdForSupportAgent);
		integrationPage.SecretId_SupportAgent(driver, SecretIdForSupportAgent);
		integrationPage.default_BaseStore(driver, BaseStoreMap);
		integrationPage.language(driver, Language);
		integrationPage.endPointClickAndCollect(driver, ClickAndCollectendpoint);

		// saveclose_btn();
	}

	public static void saveclose_btn() {

		// Save Changes
		driver.findElement(By.xpath("//coral-button-label[contains(text(),'Save & Close')]")).click();

	}

}
