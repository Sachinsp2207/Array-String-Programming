package arrays;

public class Recpower
{
	public static void main(String[] args)
	{
		int ans=pow(4,3);
		System.out.println(ans);
	}
	public static int pow(int base,int raise)
	{
		int pow=1;
		if (raise==0) {
			return 1;
		}
		else 
		{
			return pow=base*pow(base,raise-1);
		}
		
	}

}
