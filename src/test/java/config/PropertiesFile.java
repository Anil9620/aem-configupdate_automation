package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import aemupdateconfig.Updateconfig;

public class PropertiesFile {

	static Properties prop=new Properties();
	static String projectPath=System.getProperty("user.dir");
	public static void main(String[] args) {
		getProperties();
		setProperties();

	}


	public static void getProperties() {

		try {


			InputStream input=new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
			prop.load(input);
//			String siteName=prop.getProperty("propertyName");
//			System.out.println(siteName);
			Updateconfig.URL=prop.getProperty("URL");
			Updateconfig.UserName=prop.getProperty("UserName");
			Updateconfig.PassWord=prop.getProperty("PassWord");
			Updateconfig.propertyName=prop.getProperty("propertyName");
			Updateconfig.propertyValue=prop.getProperty("propertyName");
			Updateconfig.propertyLangauge=prop.getProperty("propertyLangauge");
			Updateconfig.market1=prop.getProperty("market1");
			Updateconfig.siteName=prop.getProperty("siteName");
			Updateconfig.SiteId=prop.getProperty("SiteId");
			Updateconfig.Environment=prop.getProperty("Environment");
			Updateconfig.ClientId=prop.getProperty("ClientId");
			Updateconfig.SecretId=prop.getProperty("SecretId");
			Updateconfig.ClientIdForSupportAgent=prop.getProperty("ClientIdForSupportAgent");
			Updateconfig.SecretIdForSupportAgent=prop.getProperty("SecretIdForSupportAgent");
			Updateconfig.DefaultBaseStore=prop.getProperty("DefaultBaseStore");
			Updateconfig.BaseStoreMap=prop.getProperty("BaseStoreMap");
			Updateconfig.Language=prop.getProperty("Language");
			Updateconfig.ClickAndCollectendpoint=prop.getProperty("ClickAndCollectendpoint");
			Updateconfig.countryPath=prop.getProperty("countryPath");
			//integrationPage.siteID();
		}

		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void setProperties() {

		try {
			OutputStream output=new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser","firefox");
			prop.store(output,"File reading" );
		}

		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}



}
