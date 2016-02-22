package demopackage;

import java.io.File;
import java.io.FileFilter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class filename {

	static String getCurrentTime =new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
	static String reportFolder;
	static String reportFolder1;
	public static void main(String[] args) {
		
		
		System.out.println(getCurrentTime);
		
		File dir = new File("D:/FTPS_Automation/ftpsproject/TestResults");
		
		  String[] folderName = new String[100];
		File[] subDirs = dir.listFiles(new FileFilter() {
		    public boolean accept(File pathname) {
		        return pathname.isDirectory();
		    }
		});
		int i=0;
		for (File subDir : subDirs) {
			
			folderName[i]=subDir.getPath();
			if(folderName[i].contains(getCurrentTime))
			{
				reportFolder=subDir.getPath();
				System.out.println("Report folder dir"+reportFolder);
				reportFolder1=reportFolder.substring(43, 65);
				System.out.println("Report folder Name"+reportFolder1);
				
			}
			
//		    System.out.println(subDir.getPath());
		    i++;
//		    System.out.println("FirstName:"+folderName[0]);
		}
		// TODO Auto-generated method stub
		
		

	}

	

}
