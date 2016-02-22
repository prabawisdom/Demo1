package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import OR.ORmethods;
import OR.Xpaths;


public class testcases {

 Xpaths path= new Xpaths();
 ORmethods methods=new ORmethods();
 
@Test
  public void testMethodOne(){
 String url="http://www.google.com";
 methods.driver= new FirefoxDriver();
 methods.load(url);
//   driver.get(path.url);
   methods.maximize();
//   ORmethods.Entervaluexpath(path.Registerxpath,path.TC1pageid);
 
   
  } 
}