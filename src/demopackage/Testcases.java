package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases extends Library  {
// public WebDriver driver;
 
 @BeforeTest
 public void beforetest(){
  driver= new FirefoxDriver();
  System.out.println("Before test executed");
    
 }
 
 @BeforeClass
 public void beforeclass(){
  maximize();
//  driver.manage().window().maximize();
  System.out.println("Before class executed");
 }
 
 @BeforeMethod
 public void beforemethod(){
  driver.get("http://www.gmail.com");
  System.out.println("Before method executed");
 }
 
  @Test
  public void test1() {
   Entervaluexpath("//input[@id='Email']", "balasunovaa");
   clickid("next");
   Entervaluexpath("//input[@id='Passwd']", "bala1984");
   clickid("signIn");
   System.out.println("test executed");
   
  }
  @AfterMethod
  public void aftermethod() throws InterruptedException{
   wait(2000);
   System.out.println("After method executed");
  }
  
}