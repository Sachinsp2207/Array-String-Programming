package string;

import java.util.Iterator;
import java.util.Scanner;

public class SortChar {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ip");
		String ip=s.next();
		
		System.out.println(demo(ip));
	}
	public static String demo(String ip) {
		
		char []c=ip.toCharArray();
		char ans[]=new char[c.length];
		int k=0;
		for (int i = 0; i < c.length; i+=2,k++) {
			ans[i]=c[k];
		}
		int l=c.length-1;
		for (int i = 1; i < c.length; i+=2,l--) {
			ans[i]=c[l];
		}
		
		String op = new String(ans);
		return op;
	}
	}


