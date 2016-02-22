package demopackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinkSelect {
	 
	 @Test
	 public void clickLink() {
	  WebDriver driver;
	  driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
	   List<WebElement> linkcount = driver.findElements(By.tagName("a"));

	      System.out.println(linkcount.size());

	      for(int i=0;i<linkcount.size();i++){
	       
	       String linkname=linkcount.get(i).getText();
	       System.out.println("LinkName"+linkname);
	               // System.out.println(linkname);
	                if(linkname.equalsIgnoreCase("Images")){
	                 driver.findElement(By.xpath("//a[text()='Images']")).click();
	                 System.out.println("Images link clicked");
	                }else{
	                 System.out.println("Other links");
	                }
	          
	          //driver.close();
	 }
	}}
