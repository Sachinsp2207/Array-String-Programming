package string;

import java.util.Scanner;

public class ReplaceChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");	
		String s=sc.next();
		System.out.println("Enter the Char You Want to Replace");
		char chr=sc.next().charAt(0);
		System.out.println("Enter then Char ");
		char rep=sc.next().charAt(0);
		String s1=new String(s);
		for (int i = 0; i < s.length(); i++) 
		{
			String ans="";
			char ch=s1.charAt(i);
			if (ch==chr) 
			{
				ans=ans+rep;
			}
			else
			{
				ans=ans+ch;
			}
			System.out.print(ans);
		}
		
	}
}
