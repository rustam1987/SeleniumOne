package com.wmc.smoke.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wmc.smoke.UIPages.W3schoolPage;
import com.wmc.smoke.Util.Common.Gls_Generic_methods;

public class UserDefinedTest {
 protected WebDriver driver;
 
	@Test
	public void first() throws Exception{
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://www.w3schools.com/");
		 driver.close();
	
	}
	@Test
	public void second(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.close();
	
	}
}
