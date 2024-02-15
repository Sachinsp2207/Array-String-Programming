package arrays;

class Minimum 
{
	public static void main(String[] args) 
	{
		int a[]={33,66,3,46,56,8,65,6,666};

		int min=a[0];
		int count=0;
		 for (int i=0;i<a.length ;i++ )
		 {
			 
			 if (a[i]<min)
			 {
				 min=a[i];
			 }
		 }
		
		System.out.println("Minimum Element is "+min+" and Repated "+count+" times");
	}
}
