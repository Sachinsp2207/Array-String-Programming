package string;
import java.util.Scanner;
public class RemoveSpace {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	String ip=s.nextLine();
	System.out.println(removeSpace(ip));
}
public static String removeSpace(String ip)
{	String ans="";
	for (int i = 0; i <ip.length(); i++){
		char ch=ip.charAt(i);
		if (ch!=' '){
			ans=ans+ch;
		}
	}
	return ans;
	}
}
