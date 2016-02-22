package Sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;

import org.sikuli.script.Screen;

public class gmaildemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Screen screen= new Screen();
		
		Pattern img1=new Pattern("D:\\images\\gmail_signin.JPG");
		
		WebDriver driver;
		
		driver= new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		screen.click(img1);
		
	}

}
