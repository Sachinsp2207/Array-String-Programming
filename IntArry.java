package arrays;

import java.util.Scanner;

public class IntArry 
{
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=s.nextInt();
	int a[]=new int[size];
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter the value");
		a[i]=s.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
		
	}
 }
}
