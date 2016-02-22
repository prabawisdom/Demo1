package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.ie.driver", "D:/jars/iexplore.exe");
                 WebDriver driver=new InternetExplorerDriver(); 
                 Thread.sleep(3000);
		driver.get("http://seleniumeasy.com");	
	}
}
