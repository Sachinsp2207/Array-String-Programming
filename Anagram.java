package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	if (ch1.length==ch2.length) {
		Arrays.sort(ch1);
		Arrays.sort(ch2);	
	
	int i=0;
	for ( i=0;i < ch1.length; i++) {
		if (ch1[i]!=ch2[i]) {
			break;
		}
	}
	if(i==ch1.length) {
		System.out.println("its an anagram");
	}
	else {
		System.out.println("its not anagram");
	}
}
	else
	{
		System.out.println("not an anagram");
	}
}
}
