package demopackage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
 


// public method to launch browser and load website
 
public class TestCase 
{ 
	public static WebDriver driver;
	
	@BeforeTest
	public static void browser()throws Exception
	{
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");    
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.name("q")).sendKeys("Webdriver");
		//Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void search() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Webdriver");
		Thread.sleep(3000);
	}

	@AfterTest
	public static void browserclose() 
	{

		driver.close();
		System.out.println("After method");
	}

}