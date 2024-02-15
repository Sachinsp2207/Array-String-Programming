package string;
import java.util.Arrays;
import java.util.Iterator;

public class FindBigString {
public static void main(String[] args) {
	String ip=("asdfghjasgf");
	String s[]=new String[ip.length()];
	String ans="";
	for (int i = 0; i < ip.length(); i++) {
			char ch=ip.charAt(i);
			String x=String.valueOf(ch);
			if (ans.contains(x)==false) {
				ans=ans+x;
			}
			s[i]=ans;
		}
	Arrays.sort(s);
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]);
	}
	}
	}
