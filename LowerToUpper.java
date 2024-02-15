package string;
import java.util.Locale;
import java.util.Scanner;
public class LowerToUpper 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String s1=new String(s);
		for (int i = 0; i < s1.length(); i++)
		{
		   char ch=s1.charAt(i);
			String ans="";
			if (ch>='a'&&ch<='z')
			{
				ans=ans+(char)(ch-32);
			}
			else 
			{
				ans=ans+ch;
			}
			System.out.print(ans);
		}
		
	}

}
