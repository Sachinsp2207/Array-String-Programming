package string;
import java.util.Locale;
import java.util.Scanner;
public class UpperToLower 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String ip=sc.nextLine();
		System.out.println(toLower(ip));	
	}
	public static String toLower(String ip)
	{
		String ans="";
		for (int i = 0; i < ip.length(); i++)
		{
		   char ch=ip.charAt(i);
				if (ch>='A'&&ch<='Z')
			{
				ans=ans+(char)(ch+32);
			}
			else 
			{
				ans=ans+ch;
			}
		}
		return ans;
	}
}
