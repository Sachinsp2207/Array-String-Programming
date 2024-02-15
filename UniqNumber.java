package arrays;

import java.util.HashSet;

public class UniqNumber {
	public static void main(String[] args) {
        int[] ip = {6,4,1,2,1,3,4,5,5,5,4,886,2,4,3};
        
        for (int i = 0; i < ip.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < ip.length; j++) {
                if (i != j && ip[i] == ip[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(ip[i] + " ");
            }
        }
      
	}
}