package arrays;

import java.util.Scanner;

public class StringArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		String []s=new String [size];
		
		for (int i = 0; i < s.length; i++)
		{
			System.out.println("Enter the Value");
			s[i]=sc.next();
			
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
