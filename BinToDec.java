package arrays;
public class BinToDec {
public static void main(String[] args) {
	int a[]= {1,0,1,0,1};
	int dec=0;
	int base=2;
	int raise=0;
	
	for (int i =a.length-1; i>=0; i--)
	{
		int pow=(int)Power.power(base,raise);
		dec=dec+(a[i])*pow;
		raise++;
		
    }
	System.out.println(dec);
	}
//	public static int power(int base,int raise)
//	{
//		int pow=1;
//		for(int i=0;i<raise;i++)
//		{
//			pow=pow*base;
//		}
//		return pow;
//		
//	}
}