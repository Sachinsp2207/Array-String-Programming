package arrays;

public class SecMax {
	public static void main(String[] args) 
	{
		int a[]={33,4,5,66,55,54,6754,434,322};

		int max=a[0];
		int secmax=a[1];
		for (int i=0;i<a.length;i++ )
		{
			 
			if (a[i]>max)
			 {
			     secmax=max;
				 max=a[i];
			 }
			 else if ((a[i]<max)&&(a[i]!=max))
			 {
				 secmax=a[i];
			 }
		 }
		 System.out.println(secmax);
		System.out.println(max);
		
		
	}

}
