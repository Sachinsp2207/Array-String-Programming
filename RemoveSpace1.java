package string;

import java.util.Iterator;
import java.util.Scanner;

public class RemoveSpace1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String ip=s.nextLine();
	char []ch=ip.toCharArray();
	System.out.println(ch);
	String ans="";
	for (int i = 0; i < ch.length; i++) {
		
		if (ch[i]!=' ') {
			ans=ans+ch[i];
		} else {
			ans=ans+ch[i+1];
			i++;
		}
	}
		System.out.println(ans);
	}
}

