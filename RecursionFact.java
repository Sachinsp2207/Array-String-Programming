package arrays;

public class RecursionFact 
{
	public static void main(String[] args)
	{
		int ans=fact(10);
		System.out.println(ans);
	}
	public static int fact(int num)
	{
		int fact;
		if (num==0) {
			return 1;
		}
		else 
		{
			return fact=num*(fact(num-1));
		}
		
	}

}
