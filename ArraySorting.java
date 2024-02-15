package arrays;

import java.util.Scanner;

public class ArraySorting 
{
	public static void main(String[] args)
	{
		try (Scanner S = new Scanner (System.in)) 
		{
			System.out.println("Enter the length Of Array");
			int size=S.nextInt();
			
			int a[]=new int[size];
			
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("Enter The Value for position"+(i+1));
				a[i]=S.nextInt();
				
			}
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
			}
			
			int temp=0;
			for (int i = 0; i < a.length; i++) 
			{
				for (int j =i+1; j < a.length; j++) 
				{
				  if (a[i]>a[j])
				  {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				  }	
				}
			}
			System.out.println("------------------------------------------");
			for (int i = 0; i < a.length; i++)
			{
				System.out.print(a[i]+" ");
				
			}
			
		}
		
	
	}

}
