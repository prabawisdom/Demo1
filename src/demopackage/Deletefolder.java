package demopackage;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Deletefolder {
	public static String getCurrentTime =new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
	public static String getreportFolder;
	public static String reportFolderDir;
	public static String OUTPUT_ZIP_FILE;
	public static String SOURCE_FOLDER;
	public static String reportFolder;

	 static public boolean deleteDirectory(File path) {
		    if( path.exists() ) {
		      File[] files = path.listFiles();
		      for(int i=0; i<files.length; i++) {
		         if(files[i].isDirectory()) {
		           deleteDirectory(files[i]);
		         }
		         else {
		           files[i].delete();
		         }
		      }
		    }
		    return( path.delete() );
		  }
	 
	public static void main(String[] args) {
		String resultDir="D:/praba1";
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
			
				boolean bool= subDir.delete();
				if(subDir != null )
					
				if(bool)
				{
					System.out.println(folderName[i]+" is deleted");
				}
			}
		}

}

