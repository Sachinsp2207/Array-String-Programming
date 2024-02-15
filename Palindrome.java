package string;

public class Palindrome {
public static void main(String[] args) {
	String ip="Mam".toLowerCase();;
	
	if (ip.equals(palin(ip))) {
		System.out.println("Its Palindrome String");
	}
	else {
		System.out.println("Not Palindrome String");
	}
}
public static String palin(String ip)
{
	String ans="";
	char[] ch=ip.toCharArray();
	for (int i = ch.length-1; i >=0 ; i--) {
		ans+=ch[i];
	}
	return ans;
	}
}
