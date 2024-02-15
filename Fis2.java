package arrays;

import java.util.Arrays;

public class Fis2 {
 public static void main(String[] args) {
	 int ip[]={1,2,4,5,4,5};
	ans(ip);
 }
public static void ans(int a[])
 {													//{1,2,4,5,4,5}
	 												//{1,2,4,4,5,5,}
	 Arrays.sort(a);
	 for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
		
	}
	 System.out.println();
	 int sum=0;
	 for (int i = 0; i < a.length-1; i++) {
		if (a[i+1]<=a[i]) { 						//{1,2,4,5,6,7}
			a[i+1]=a[i]+1;
		}
	}
	 for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
	 for (int i = 0; i < a.length; i++) {
		sum+=a[i];
	}
	 System.out.println();
	 System.out.println(sum);  //25 
 }
}
