package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import demopackage.*;

public class MainMethod extends TestCase   
{
	
@Test
public void search() throws Exception
{

driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("testing");
driver.findElement(By.id("gsr")).click();
}  

}