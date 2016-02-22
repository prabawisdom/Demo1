package OR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ORmethods {
  public static WebDriver driver;
  
  
 // Load url
  public void load(String url){
   driver.get(url);
       
  }
  
  
  //Mousehover method
  public void mousehover(String value) throws InterruptedException{
    
       Actions action = new Actions(driver);
       WebElement webElement = driver.findElement(By.xpath(value));
       Thread.sleep(2000);
        action.moveToElement(webElement).build().perform();
  
  }
  
   //Dropdown method
    public void dropdown(String path, String value){
     WebElement drop= driver.findElement(By.xpath(path));
     Select sel= new Select(drop);
     sel.selectByVisibleText(value);
    }
    
   // Click method by xpath
   public void clickxpath(String xpath) {
    driver.findElement(By.xpath(xpath)).click();;
    
   }
   
   //click method by id
   public void clickid(String id){
    driver.findElement(By.id(id)).click();
   }
   
   
   
 //click method by link
   public void clicklink(String link){
    driver.findElement(By.linkText(link)).click();
   }
   
   
   //Wait method
   public void wait(int value) throws InterruptedException{
    Thread.sleep(value);
    
   }
   
   //Enter value in editbox by xpath
   public static void Entervaluexpath(String xpath, String value){
    driver.findElement(By.xpath(xpath)).sendKeys(value);
   }
   
   //Enter value in editbox by id
   public void Entervalueid(String id, String value){
    driver.findElement(By.id(id)).sendKeys(value);
   }
  
   // Maximize window
   public void maximize(){
    
    driver.manage().window().maximize();
   }
   
   //close browser method
   public void close(){
    driver.close();
   }
   
   //Scroll down//
   public void paedown(){
   JavascriptExecutor jse = (JavascriptExecutor)driver; 
   jse.executeScript("window.scrollBy(0,5000)", "");
   }

}