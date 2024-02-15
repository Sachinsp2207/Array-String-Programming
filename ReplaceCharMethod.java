package string;

import java.util.Scanner;

public class ReplaceCharMethod {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		System.out.println("Enter the Charecter ");
		char ip=s.next().charAt(0);
		System.out.println("Enter the new char");
		char newch =s.next().charAt(0);
		System.out.println(replaceChar(s1,ip,newch));
		

	}
	public static String replaceChar(String s1,char ip,char newch)
	{ 
		String ans="";
	for (int i = 0; i < s1.length(); i++) {
		char ch=s1.charAt(i);
		if (ch==ip) {
			ans=ans+newch;
		}
		else {
			ans=ans+ch;
		}
	}
				return ans;
		
	}
}
