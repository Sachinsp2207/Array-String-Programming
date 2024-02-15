package arrays;

import java.util.Scanner;

public class AddElement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int ind=s.nextInt();
	int ele=s.nextInt();
	
	int ip[]= {1,2,3,4,5};
	
	int op[]=new int [ip.length+1];
	
	for (int i = 0; i < op.length; i++) {
		if(i<ind)
		{
			op[i]=ip[i];
		}
		else if (i==ind) {
			op[i]=ele;
		} 
		else
		{
			op[i]=ip[i-1];
		}
	}
	for (int i = 0; i < op.length; i++) {
		System.out.println(op[i]);
	}
}
}
