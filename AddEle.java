package arrays;

import java.util.Scanner;

public class AddEle {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("How many element you want to add");
	int no=s.nextInt();
	int []ip= {1,2,3,4,5,6,7,8};
	int len=no+ip.length;
	int[] op=new int[len];
	for (int i = 0; i < no; i++) {
		 int ind=1;System.out.println("enter the pos");
		 	int pos=s.nextInt();System.out.println("enter the element");
			int ele=s.nextInt();
		for (int j = 0; j <op.length; j++) {
			if(ind<pos)
			{
				op[j]=ip[j];ind++;
			}
			else if(ind==pos)
			{
				op[j]=ele;ind++;
			}
			else {
				op[j]=ip[j-1];
			}
		}
		for (int i1 = 0; i1 < op.length; i1++) {
			System.out.print(op[i1]+" ");
		}
	}
	
	
}
}
