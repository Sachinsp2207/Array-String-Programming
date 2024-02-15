
package string;

import java.util.Arrays;

public class NonRepchar {
public static void main(String[] args) {
	String a="sachinpawar";
	char ch[]=a.toCharArray();
	String ans="";
	for (int i = 0; i < ch.length; i++) {
		String temp=String.valueOf(ch[i]);
		if (ans.contains(temp)!=true) {
			ans=ans+ch[i];
		}
		}
	System.out.println(ans);
	}
	
}

