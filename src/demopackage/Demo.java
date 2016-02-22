package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	
//	@Test
	  public void function() throws InterruptedException {
	   driver= new FirefoxDriver();
	   driver.get("http://jqueryui.com/slider/");
	   driver.manage().window().maximize();
	   WebElement containerframe= driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
	   driver.switchTo().frame(containerframe);
	   WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));  
	     Actions move = new Actions(driver);
	     move.clickAndHold(slider);
	     move.moveByOffset(100, 0).build().perform();
	  }
	
	 @Test
	  public void f() {
	   WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("http://google.co.in");
	  System.out.println(driver.manage().window().getSize());
	  
	  Dimension d = new Dimension(420,600);
	  //Resize the current window to the given dimension
	  driver.manage().window().setSize(d) ;
	  
	  }

}
