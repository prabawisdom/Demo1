package demopackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat[] dtformat = new DateFormat[6];
	      dtformat[0] = DateFormat.getInstance();
	      System.out.println(dtformat[0]);
	      DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	      String currenttime = new SimpleDateFormat("E-yyyy/MM/dd HH:mm:ss a").format(Calendar.getInstance().getTime());
	      System.out.println(currenttime);
	}

}
