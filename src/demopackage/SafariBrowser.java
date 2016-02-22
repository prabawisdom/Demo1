package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SafariBrowser {

  private WebDriver driver;

  private static boolean isSupportedPlatform() {
    Platform current = Platform.getCurrent();
    return Platform.MAC.is(current) || Platform.WINDOWS.is(current);
  }

 // @BeforeTest
  public void createDriver() {
//	  assumeTrue(isSupportedPlatform());
//	  System.setProperty("webdriver.safari.driver","C:/workspace/zadoqa/src/main/resources/drivers/Safari.exe");
    driver = new FirefoxDriver();
  }

  
  @Test
  public void shouldBeAbleToPerformAGoogleSearch()
  {
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	  driver.findElement(By.name("q")).sendKeys("webdriver");
	  try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	  driver.findElement(By.name("btnG")).click();
	  new WebDriverWait(driver, 3)
	  .until(ExpectedConditions.titleIs("webdriver - Google Search"));
	  driver.close();
	  driver.quit();

  }
  
  @Test
  public void Open()
  {
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	  driver.findElement(By.name("q")).sendKeys("webdriver");
	  try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	  driver.findElement(By.name("btnG")).click();
	  new WebDriverWait(driver, 3)
	  .until(ExpectedConditions.titleIs("webdriver - Google Search"));
	  driver.close();
	  driver.quit();
  }
}
