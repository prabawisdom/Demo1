package demopackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class duplicate {
 public static void main(String args[]) 
 { 
  String a,ans="";
  char ch ;
  int l,i=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter any string:"); 
  a = sc.nextLine();
  l=a.length();
  a+=" "; 
  ch=a.charAt(0); 
  while(i<l)
  { 
  ans= ans+ch;
  while(a.charAt(++i)==ch )
	  
	  
	  
	  
  {}
  ch=a.charAt(i); 
  }
  System.out.println("String after removing repeated characters:");
  StringTokenizer st = new StringTokenizer(ans);  
      while (st.hasMoreTokens()) {  
          System.out.println(st.nextToken());  
      }  
  }
      }
