package arrays;

import java.util.*;
public class More {


	    static int sockMerchant(int n, int[] ar) {
	       
	        int count = 0;
	        int[] temp = new int[101];
	        for(int i=0; i<n; i++){
	            temp[ar[i]]++;
	        }
	        for(int i=0; i<101; i++){
	            count += temp[i]/2;
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();     
	        }
	        
	        System.out.println(sockMerchant(n, ar));
	    }
}
