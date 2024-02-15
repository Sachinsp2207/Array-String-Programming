package arrays;

import java.util.Scanner;

public class SortingMethod
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the Value");	
			a[i]=s.nextInt();
		}
		
		int ans[]=sortArray(a);
		for (int i = 0; i < ans.length; i++) 
		{
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] sortArray(int a[])
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		return a;
	}
}
