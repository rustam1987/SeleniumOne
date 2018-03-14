package com.wmc.smoke.Util.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gls_Generic_methods {
	
	public  WebDriver fn_LaunchBrowser(String BrowserType){
		WebDriver driver_Object=null;
		if(BrowserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver_Objec=new ChromeDriver();

		}else{
			System.out.println("Provided Browser Type is invalid , PLEASE CHECK");
		}
		return driver_Object;
	}
	
	
	public static void getURL(WebDriver driver,String URL){
		driver.get(URL);
	}
	
 /**
 * @This method gets value from Config properies file
 */
public static String getConfigValue(String val) throws Exception{

	 File path=new File(System.getProperty("user.dir"+"\\Config\\Config.properties"));
	 FileInputStream stPath=new FileInputStream(path);
	 Properties p=new Properties();
	 p.load(stPath);
	 return  p.getProperty(val);
 }
}
