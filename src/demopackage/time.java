package demopackage;

import java.math.BigDecimal;

public class time {
public static void main(String[] args){
	/*String sequenceCaptureTime = "";
	BigDecimal roundThreeCalc = new BigDecimal("7200");
	BigDecimal hours = new BigDecimal("0");
	BigDecimal myremainder = new BigDecimal("0");
	BigDecimal minutes = new BigDecimal("0");
	BigDecimal seconds = new BigDecimal("0");
	BigDecimal var3600 = new BigDecimal("3600");
	BigDecimal var60 = new BigDecimal("60");
	
	hours = (roundThreeCalc.divide(var3600));
	myremainder = (roundThreeCalc.remainder(var3600));
	minutes = (myremainder.divide(var60));
	seconds = (myremainder.remainder(var60));
	sequenceCaptureTime =  hours.toString()+"Hours" + minutes.toString()+"Minutes" + seconds.toString()+"Seconds";
	*/
	int input=100000;
	int numberOfDays;
	int numberOfHours;
	int numberOfMinutes;
	int numberOfSeconds;

	numberOfDays = input / 86400;
	numberOfHours = (input % 86400 ) / 3600 ;
	numberOfMinutes = ((input % 86400 ) % 3600 ) / 60; 
	numberOfSeconds = ((input % 86400 ) % 3600 ) % 60  ;
	System.out.println(numberOfDays+"Days"+numberOfHours+"Hours"+numberOfMinutes+"Minutes"+numberOfSeconds+"Seconds");
}
}
