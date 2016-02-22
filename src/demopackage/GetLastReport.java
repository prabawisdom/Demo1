package demopackage;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetLastReport {

	public static String getCurrentTime =new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
	public static String getreportFolder;
	public static String reportFolderDir;
	public static String OUTPUT_ZIP_FILE;
	public static String SOURCE_FOLDER;
	public static String reportFolder;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultDir="D:/Framework/15.7.15/Softwares/Babu/Reports/Results";
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
//			if(folderName[i].contains(getCurrentTime))
//			{
				getreportFolder=subDir.getPath();
//				System.out.println("Folder Name:["+i+"]"+reportFolderDir);
				reportFolderDir=getreportFolder.replace("\\", "/");
				
//						reportFolder=getreportFolder.substring(43, 65);
//			}
		}
		System.out.println("Folder Name:"+reportFolderDir);

	}

}
