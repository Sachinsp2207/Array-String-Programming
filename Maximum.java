package arrays;

class Maximum 
{
	public static void main(String[] args) 
	{
		int a[]={33,66,3,46,56,8,65,6,666};

		int max=a[0];
		int count=0;
		 for (int i=0;i<a.length ;i++ )
		 {
			 
			 if (a[i]>max)
			 {
				 max=a[i];
			 }
		 }
		
		System.out.println("Maximum Element is "+max+" and Repated "+count+" times");
	}
}
