package arrays;

public class ReverseSort {
public static void main(String[] args) {
	int ip[]= {4,3,4,2,4,5,6,7,8,};
	for (int i = 0; i < ip.length; i++) {
		for (int j =0 ; j < ip.length; j++) {
			if (ip[j]>=ip[i]) {
				int temp=ip[i];
				ip[i]=ip[j];
				ip[j]=temp;
			} 
		}
	}
	for (int i = 0; i < ip.length; i++) {
		System.out.print(ip[i]+" ");
	}
}
}
