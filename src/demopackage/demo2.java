package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class demo2 {

	public static WebDriver driver;
	 @BeforeTest
     public static void main(String[] args) throws InterruptedException {
		
	    //public void beforeMethod() {
	      
	          // declaration and instantiation of objects/variables
	          driver = new FirefoxDriver();
	          //String baseUrl = "http://gmail.com";
	          driver.get("http://google.com");
	        //System.out.println("Before Method");
	    }
	 
	    @AfterMethod
	    public static void afterMethod() {
	   
	     driver.close();
	       // System.out.println("After Method");
	    }
	

	}


