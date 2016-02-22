package demopackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class CrowdTwist {
	 static WebDriver driver;
	 
	
	 
	@Before
	 public static void main (String[] args) throws Exception{
		driver = new FirefoxDriver();
//		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://ct:1178doit@staging-control-center.crowdtwist.com/login?email=vendor1@test.com&password=ct&remember=1");
		Thread.sleep(2000);
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.authenticateUsing(new UserAndPassword("ct", "1178doit"));
		
	
	}

}
