package demopackage;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chromebrowser {
	private static final String TRUE = null;
	WebDriver driver;
	Boolean AcceptNextAlert = true;
	@Before
	public void setup() throws Exception
	{
		DesiredCapabilities iecapabilities = new DesiredCapabilities().internetExplorer();
		iecapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, TRUE);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"), iecapabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws Exception
	{
		driver.get("http://app.qa.mfg.com/index_noclogin.jsp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("mfgbuyertest1@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@class='btn']")).click();
	}
	

}
