package string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class CountOFChar {
public static void main(String[] args) {
	
	Scanner s=new Scanner (System.in);
	System.out.println("enter the string");
	String ip=s.nextLine().toLowerCase().trim();
	char []ch=ip.toCharArray();
	Arrays.sort(ch);
			
	int ct[]=new int [ch.length];
	int k=0;
	for (char i = 'a'; i <='z'; i++) {
		int count=0;
		
		for (int j = 0; j < ch.length; j++) {
			if (i==ch[i]) {
				count++;
			}
			ct[k]=count;
			k++;
		}
	}
	
	for (int i = 0; i < ct.length; i++) {
		System.out.println(ct[i]);
	}
}
}
