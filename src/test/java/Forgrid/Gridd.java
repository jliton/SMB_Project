package Forgrid;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gridd {
 
	@Test
	public static void m() throws MalformedURLException {
		
	
	System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") 
			+ "\\src\\test\\resources\\Executeable\\chromedriver.exe");
		ChromeOptions cp=new ChromeOptions();
     DesiredCapabilities cap=new DesiredCapabilities();
     cap.setPlatform(Platform.WIN8_1);
     
     cap.setBrowserName("Chrome");
    
     cp.merge(cap);
    URL  url= new URL(" http://localhost:4444/wd/hub");
     WebDriver driver=new RemoteWebDriver(url, cap);
    driver.get("www.bdnew.com/");


	}
}
