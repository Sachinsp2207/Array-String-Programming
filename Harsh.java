package arrays;
import java.util.Scanner;
public class Harsh{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
			}
		System.out.println(max(a));
	}
	public static int max(int a[])
	{	int ct=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]==a[i+1]) {
				ct++;
			}
		}
		return ct;	
	}
}