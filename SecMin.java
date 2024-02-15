package arrays;

public class SecMin 
{
	public static void main(String[] args) 
	{
		int a[]= {65,655,215,47};
		int min=a[0];
		int secmin=a[1];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if ((a[i]>min)&&(a[i]!=min))
			{
				secmin=a[i];
			} 
		}
		System.out.println(min);
		System.out.println(secmin);
		
		
	}
}
