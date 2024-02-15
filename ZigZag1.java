package arrays;

public class ZigZag1 {
public static void main(String[] args) {
	char[] ip1 = {'a', 'b', 'c','d'};
    char[] ip2 = {'e', 'f', 'g'};
  int l=ip1.length+ip2.length;
    char[] op = new char[l];
    int j=0;
    int k=0;
    for(int i=0;i<op.length;i=i+2)
    {
    	op[i]=ip1[j];
    	j++;
    }
    for(int i=1;i<op.length;i=i+2)
    {
    	op[i]=ip2[k];
    	k++;
    }
    for (int i = 0; i < op.length; i++) {
		System.out.print(op[i]);
	}
}
}
