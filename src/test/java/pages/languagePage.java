package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class languagePage {
	private static WebElement language = null;

	public static WebElement en(WebDriver driver, String propertyLangauge,String market1,String siteName) {
		language = driver.findElement(By.xpath("//div[@class='foundation-layout-util-subtletext' and contains(text(),'"
				+ propertyLangauge + "')]//preceding::img[@src='/content/"+siteName+"/"+market1+"/" + propertyLangauge
				+ ".thumb.48.48.png?ck=']"));

		return language;
	}
}
