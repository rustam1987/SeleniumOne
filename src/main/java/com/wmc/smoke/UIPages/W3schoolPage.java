package com.wmc.smoke.UIPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.wmc.smoke.Util.Common.Gls_Generic_methods;

public class W3schoolPage {
	private WebDriver driver;
	
	public W3schoolPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LaunchApplication(WebDriver driver,String sEnv,String sPage) throws Exception{
		String sURL;
		Thread.sleep(2000);
		sURL=Gls_Generic_methods.getConfigValue("URL");
		Gls_Generic_methods.getURL(driver, sURL);
	}

}
