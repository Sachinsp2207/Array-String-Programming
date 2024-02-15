package arrays;

public class DecimalToBinary {
	 public static void main(String[] args) {
	        int ip = 12; 
	        int[] bn = new int[32]; 
	        int i= 0;

	        while (ip > 0) {
	            bn[i] = ip % 2;
	            i++;
	            ip /= 2;
	        }
	        
	       
	        for (int j = i - 1; j >= 0; j--) {
	            System.out.print(bn[j]);
	        }
	    }
}
