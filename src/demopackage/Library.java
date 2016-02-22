package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Library {
  public static WebDriver driver;
  // Click method by xpath
  public void click(String xpath) {
   driver.findElement(By.xpath(xpath));
   
  }
  //click method by id
  public void clickid(String id){
   driver.findElement(By.id(id));
  }
  //Wait method
  public void wait(int value) throws InterruptedException{
   Thread.sleep(value);
   
  }
  //Enter value in editbox by xpath
  public void Entervaluexpath(String xpath, String value){
   driver.findElement(By.xpath(xpath)).sendKeys(value);
  }
  // Maximize window
  public void maximize(){
   driver.manage().window().maximize();
  }
  
}
