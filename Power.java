package arrays;

public class Power {
	public static void main(String[] args) {
		System.out.println(power(2, 3));
	}
static int power(int b,int r)
{
	int pow=1;
	while(r!=0)
	{
		pow*=b;
		r--;
	}
	return pow;
	}
}
