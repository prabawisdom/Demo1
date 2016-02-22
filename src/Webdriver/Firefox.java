package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class Firefox {
	static WebDriver driver;

	@BeforeTest
	public static void setup() 
	{  String node="http://192.168.1.4:5555/wd/hub";
		
		DesiredCapabilities capa = DesiredCapabilities.firefox();
		capa.setBrowserName("firefox");
		capa.setPlatform(Platform.XP);
//		driver= new RemoteWebDriver(new URL(node),capa);
		
//		iecapa.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, TRUE);
//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"), iecapa);

		
		
//		DesiredCapabilities capa = DesiredCapabilities.firefox();
//		driver = new RemoteWebDriver((new URL("http://localhost:4444/wb/hub"), capa);
//		driver.get("http://google.com/");
////		baseURL= "http://google.com/";
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
