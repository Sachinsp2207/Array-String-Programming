package arrays;

public class Min {
public static void main(String[] args) {
	int a[]= {5,6,4,3,5,2,10,7,8};
	int min=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]<min) {
		min=a[i];			
		}
	}
	System.out.println(min);
}
}
