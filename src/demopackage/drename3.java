package demopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class drename3 {
 public static void main(String[] args) throws IOException

 {
  File file = new File("D:/FTPS_Automation/ftpsproject/TestResults");
  String[] names = file.list();

  for(String name : names)
  {
   if (new File("D:/FTPS_Automation/ftpsproject/TestResults" + name).isDirectory())
//	  System.out.println(name);
   {
    System.out.println(name);
    String s="D:/FTPS_Automation/ftpsproject/TestResults"+name;
    String s1="D:/FTPS_Automation/ftpsproject/TestResults"+name+".zip";
    FileOutputStream fos = new FileOutputStream(s1);
    ZipOutputStream zos = new ZipOutputStream(fos);
    zos.close();
    File oldName = new File(s1);
    File newName = new File("D:/FTPS_Automation/ftpsproject/TestResults/Main1.zip");
    if(oldName.renameTo(newName))
    {
     System.out.println("renamed");
    } else 
    {
     System.out.println("Error");
    }
   }  
  }
 }
}