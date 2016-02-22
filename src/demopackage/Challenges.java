package demopackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class Challenges {
 
  
 public static String content = "";

  public static void main (String[] args) {



  try
  {
   
   String html = "dsfdsf";
  
   int i=0;
   String[] array = new String[20000];
 
    {
          BufferedReader in = new BufferedReader(new FileReader("D:\\crowdtest\\Vendor1_doc\\widgets-test.html"));
          String str;
         
          
       
          while ((str = in.readLine()) != null) {
           i++;
              //content +=str;
           array[i]=str;
             
             
                
          }
          
          in.close();
   }
    File file = new File("C:\\Users\\dell\\Desktop\\whtml.html");
            BufferedWriter bf=new BufferedWriter(new FileWriter (file));
            //bf.write(html);
         for(int j=1;j<=i;j++)
          
         {
     
           bf.write(array[j]);
         
         }
         bf.close();
            System.out.print("done");
  
 }
 
  catch(Exception e)
  {
    System.out.print("err");
  }
  }
}