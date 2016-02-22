package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Pagedown {
	WebDriver driver;
	
	@Test
	public void page() throws Exception
	{
	driver=new FirefoxDriver();
	 driver.get("http://www.gmail.com");
	   driver.manage().window().maximize();
	   //driver.findElement(By.cssSelector("input#sb_ifc0")).sendKeys("testing");
	   
	   
	   
	   driver.findElement(By.cssSelector("input#Email")).sendKeys("balaindium");
	   driver.findElement(By.cssSelector("input#next")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.cssSelector("input#Passwd")).sendKeys("krishnan1984");
	   driver.findElement(By.cssSelector("input#signIn[name='signIn']")).click();
	   Thread.sleep(2000);
	   Actions actions = new Actions(driver);
	   actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	   
	   // Scroll down//
	   
	   actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	
	}

}
