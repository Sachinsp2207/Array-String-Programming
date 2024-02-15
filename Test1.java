package arrays;
import java.util.*;
public class Test1 
{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int ar[]=new int[a];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=s.nextInt();
			
			}
		System.out.print(Arrays.toString(ar));
	}

}
