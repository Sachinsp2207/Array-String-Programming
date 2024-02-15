package string;

import java.util.Arrays;
import java.util.Scanner;

public class Ana {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String 1");
		String ip1 = s.nextLine().toLowerCase().trim();
		char[] inp1 = ip1.toCharArray();
		Arrays.sort(inp1);
		String s1 = String.copyValueOf(inp1);
		
		
		System.out.println("Enter The String 2");
		String ip2 = s.nextLine().toLowerCase().trim();
		char[] inp2 = ip2.toCharArray();
		Arrays.sort(inp2);
		String s2 = String.copyValueOf(inp2);
		
		if (inp1.length == inp2.length) {

			if (s1.equals(s2)) {
				System.out.println("Its Anagram");

			} else {
				System.out.println("its not Anagram");
			}

		} else {
			System.out.println("its not Anagram");
		}
	}

}
