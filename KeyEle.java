package arrays;

public class KeyEle {
public static void main(String[] args) {
	int []ip= {1,2,3,4,5,6,7};
	int key=3;
	boolean flag=false;
	int ind=0;
	for (int i = 0; i < ip.length; i++) {
		if (ip[i]==key) {
			flag=true;
			ind=i;
			break;
		} 
	}
	if (flag==true) {
		System.out.println("Key Element " + key+" found at "+ind+" index");
	} else {
System.out.println("element not found");
	}
	
		}
}
