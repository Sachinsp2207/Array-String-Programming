package arrays;

import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args)
	{
		try (Scanner S = new Scanner(System.in)) {
			System.out.println("Enter The key Number");
			int key=S.nextInt();
      int a[]= {10,20,30,40,50};
      int start=0;
      int end=a.length-1;
      int mid=((start+end)/2);
      boolean found=false;
      for (int i =0; i<a.length; i++) 
      {
			   if (a[mid]==key)
			   {
				found =true;
			   }
			   else if (key>a[mid])
			   {
				 start=mid+1;
			   }
			   else if (key<a[mid])
			   {
				   end=mid-1;
			   }
			   mid=(start+end)/2;
      }
      if (found==true)
      {
			System.out.println("Key is Found at "+(mid)+" position");
      }
      else
			   System.out.println("Key not found");
		}
    }
       
}



