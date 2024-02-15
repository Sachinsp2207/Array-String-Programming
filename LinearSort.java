package arrays;

public class LinearSort {
public static void main(String[] args) {
	//Akshay.linearSort();
	int []ip= {5,4,2,1,3};
	for (int i = 0; i < ip.length; i++) {
		int key=ip[i];
		int j;
		for(j=i-1;(j>-1&&ip[j]>key);j--)
		{
			ip[j+1]=ip[j];
		}
		ip[j+1]=key;
	}
	for (int i = 0; i < ip.length; i++) {
		System.out.println(ip[i]);
	}
		
}
	
}
