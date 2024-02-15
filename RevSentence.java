package string;

import java.util.Iterator;
import java.util.Scanner;

public class RevSentence{
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the String ");
	String[] ip=s.nextLine().split(" ");
	//String ans[]=new String[ip.length];
	int j=0;
//	for (int i = ip.length-1;i>=0; i--,j++) {
//		ans[j]=ip[i];
//	}
//	for (int i = 0; i < ip.length; i++) {
//		System.out.print(ip[i]+" ");
//	}
	for (int i= ip.length-1; i>=0 ;i--) {
		System.out.print(ip[i]+" ");
	}
	}	
}
