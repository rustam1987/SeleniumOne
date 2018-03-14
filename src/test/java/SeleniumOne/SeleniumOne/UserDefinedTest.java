package SeleniumOne.SeleniumOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserDefinedTest {

	@Test
	public void first(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	@Test
	public void second(){
		System.out.println("This is second test"); 
	}
}
