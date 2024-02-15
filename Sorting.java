package arrays;

import java.util.Scanner;

public class Sorting 
{
	public static void main(String[]args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=s.nextInt();
		int a[]=new int[size];
    
		for(int i=0;i<a.length;i++) 
		{   
			System.out.print("Enter The Value");
			a[i]=s.nextInt();
		}
		for (int i =  a.length-1; i <=0; i++) 
		{
			for (int j = a.length-1; j <=0; j--) 
			{
				if (a[j]>a[j-1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
