package demopackage;

import java.io.IOException;
import java.util.Scanner;

public class polin 
{
 
 public static void main (String[] args) 
 {
  String one;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String:");
  one=sc.nextLine();
  String[] two=one.split(" ");
  int three=two.length;
  
  
  for(int i=0;i<=three;i++)
  {
  String four=two[i];
  int five=four.length();
  String six="";
  
  for(int j=1;j<=five;j++)
  {
   six=six+four.charAt(five-j);
  }
  if(four.equalsIgnoreCase(six))
   { System.out.println("The string " +six+ " token is palindrome of"+"  "+four );}
  else 
  {
   System.out.println(" the string "  +six+ " token is not palindrome of" +"  "+four);
  }
   }
  
  }
}