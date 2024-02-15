package arrays;
import java.util.*;
public class SortDesc 
{
	public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int max=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            for (int j = 0; j < ar.length-1; j++) {
            	if (ar[j]<ar[j+1]) {
            		int temp=ar[j];
            		ar[j]=ar[j+1];
            		ar[j+1]=temp;
				}
			}
        }
        int ans=0;
        int b=ar.length-1;
        int x=(int) Math.pow(10, b);
        for (int i=0; i<ar.length; i++) {
      
        	ans=ans+(ar[i]*x);
        	x=x/10;
    	    }
        System.out.println(ans);
    }
}
