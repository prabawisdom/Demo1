package demopackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class polindrome {
	public static void main(String[] args)
	{
		
		String s1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		s1=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s1);
		//System.out.println("String:");
		while(st.hasMoreTokens())
		{
			String s2=st.nextToken();
//			polin(s2);
			String reverse="";
			for(int i=s2.length()-1;i>=0;i--)
			{
				reverse=reverse+s2.charAt(i);
			}
			System.out.println("\nReverse String:"+reverse);
			if(s2.equals(reverse))
			{
				System.out.println(s2+" is a polindrome");
			}
			else
			{
				System.out.println(s2+" is not a polindrome");
			}
			
		}
		
		}
	public static void polin(String pol)
	{
		String reverse="";
		for(int i=pol.length()-1;i>=0;i--)
		{
			reverse=reverse+pol.charAt(i);
		}
		System.out.println("\nReverse String:"+reverse);
		if(pol.equals(reverse))
		{
			System.out.println(pol+" is a polindrome");
		}
		else
		{
			System.out.println(pol+" is not a polindrome");
		}
	}
	
	}


