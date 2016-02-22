package demopackage;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetFolder {
	
	public static String getCurrentTime =new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
	public static String getreportFolder;
	public static String reportFolderDir;
	public static String OUTPUT_ZIP_FILE;
	public static String SOURCE_FOLDER;
	public static String reportFolder;
	public static void main(String[] args) {
		String resultDir="D:/FTPS_Automation/ftpsproject/TestResults";
		File dir = new File(resultDir);
		String[] folderName = new String[100];
		File[] subDirs = dir.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		} );
		int i=0;
		for (File subDir : subDirs) {

			folderName[i]=subDir.getPath();
			if(folderName[i].contains(getCurrentTime))
			{
				getreportFolder=subDir.getPath();
				reportFolderDir=getreportFolder.replace("\\", "/");
				
						reportFolder=getreportFolder.substring(43, 65);
			}
		}
		String toChangeName=resultDir+"/CurrentResult";
//		File oldDir=new File(reportFolderDir);
//		File newDir= new File(toChangeName);   
		 System.out.println("Current Dir: "+reportFolderDir);
		 System.out.println("New     Dir: "+toChangeName);
//		boolean isFileRenamed=oldDir.renameTo(newDir);
//		  if(isFileRenamed)
//		       System.out.println("File has been renamed");
//		     else
//		    	 oldDir.mkdirs(); 
//		  oldDir.renameTo(newDir);
//		       System.out.println("Error renaming the file");
		OUTPUT_ZIP_FILE=reportFolderDir+".zip";
		
		SOURCE_FOLDER=reportFolderDir;
	}
}
