package string;
import java.util.Iterator;
import java.util.Scanner;

public class PrintASCIIWithChar 
{
	
	 public static void main(String[] args) 
	 {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String s1=new String(s);
		System.out.println(remOdd(s1));
		
	 }
	 public static String remOdd(String s)
	 {
		 String ans="";
		 for (int i = 0; i < s.length(); i++) 
		 {
			 char ch=s.charAt(i);
			 int asc=ch;
			 if (ch%2==0)
			 {
				 ans=ans+" "+ch+"  is even "+asc+",";
			 }
			 else
			 {
			 ans=ans+" "+ch+" is Odd "+asc+",";
			 } 
			 
		 }
			        return ans;
	 }
	}



