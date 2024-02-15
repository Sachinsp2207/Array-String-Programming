package string;

import java.util.Scanner;

public class WordCount {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	String ip=s.nextLine();
	String[]s2=ip.split(" ");
	System.out.println("Count of word in String is :"+s2.length);
}
}
