package string;

public class UniqChar {
public static void main(String[] args) {
	String s1="sachinpawar";
	String op="";
	for(int i=0;i<s1.length();i++ ) {
		char ch=s1.charAt(i);
		String temp=String.valueOf(ch);
	if (op.contains(op)==false) {
		op=op+ch;
	}
	
	
	}
	System.out.println(op);
	}
}

