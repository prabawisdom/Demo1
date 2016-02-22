package demopackage;

import java.net.UnknownHostException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Surfly 
{

	public static WebDriver driver;

	@Test
	public static void url() throws InterruptedException, Exception
	{
		java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
		System.out.println("Hostname of local machine: " + localMachine.getHostName());
		driver=new FirefoxDriver();
		driver.get("https://surfly.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("nicholas+plan@surfly.com");
		driver.findElement(By.name("password")).sendKeys("qatest2015");
		driver.findElement(By.xpath("//button[@class='btn btn-important']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html/body/div[1]/ul[1]/li[1]/span")).click();
		driver.findElement(By.name("url")).sendKeys("www.google.com");
		driver.findElement(By.xpath("//*[@id='registerForm']/button")).click();
		Thread.sleep(20000);
		String one = driver.findElement(By.id("inputLink")).getText();
		System.out.println("get value is : " +one);
		Reporter.log("get value is : " +one);
		
		 String nt = driver.getCurrentUrl();
		 System.out.println("get url is : " +nt);
		 Reporter.log("get url is : " +nt);
		 
		 String[] url = nt.split("https://www.google");
		 
		 
		// driver.get(url[0]);
		/// System.out.println("get final url is : " +url[0]);
		// Reporter.log("get final url is : " +url[0]);
		
		 Actions action= new Actions(driver);
		 WebElement element = driver.findElement(By.id("chat_box_copy"));
		 action.click(element).build().perform();
		 
		 System.out.println("clicked");
		 

		 Actions action1= new Actions(driver);
		 WebElement element1 = driver.findElement(By.id("chat_box_copy"));
		 action1.click(element1).build().perform();
		 
		 System.out.println("clicked");
		 
		//driver.findElement(By.id("chat_box_copy")).click();//*[@id='chat_box_copy']
		//driver.findElement(By.id("chat_box_copy")).click();
		Thread.sleep(10000);
		
		
		System.out.println("get final url is : " +url[0]);
		Reporter.log("get final url is : " +url[0]);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//	     ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	     driver.switchTo().window(tabs.get(0));
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	  
		 System.out.println("open");
		
		
		driver.get(url[0]);
		 System.out.println("get final url is : " +url[0]);
		 Reporter.log("get final url is : " +url[0]);
		
		 Thread.sleep(3000);
		 
		  driver.close();
		    driver.switchTo().window(tabs.get(0));
		    System.out.println("Switched to default window into: "+tabs.get(0));
		 
		 
		
		
	}
	
}