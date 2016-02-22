package demopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testdata {
  
  public String Extractdata() throws Exception  {
   String username=null;
   //Using java API to locate doc location to extract data
   try {
  FileInputStream fls= new FileInputStream("D:/praba/Test data.xlsx");
  //Open Workbook with read mode
  Workbook Wb= WorkbookFactory.create(fls);
  //Get control of the sheet
  Sheet sh= (Sheet) Wb.getSheet("Sheet1");
  //Get control of first row
  Row rw= ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
  //Get date from each cell
  username= rw.getCell(1).getStringCellValue();
  System.out.println(username);
  
 } catch (FileNotFoundException e) {
  
  e.printStackTrace();
 }
 return username;
  }
  public static void main(String[] args) throws Exception
  {
	  // Open the Excel file
      FileInputStream fis = new FileInputStream("D:/praba/Test data.xlsx");
      
      // Access the required test data sheet
      XSSFWorkbook wb = new XSSFWorkbook(fis);
      XSSFSheet sheet = wb.getSheet("testdata");
      // Loop through all rows in the sheet
      // Start at row 1 as row 0 is our header row
      for(int count = 1;count<=sheet.getLastRowNum();count++){
          XSSFRow row = sheet.getRow(count);
          System.out.println("Running test case " + row.getCell(0).toString());
          // Run the test for the current test data row
//          runTest(row.getCell(1).toString(),row.getCell(2).toString());
      }
      fis.close();
  } 
}
