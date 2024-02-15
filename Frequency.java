package arrays;
class  Frequency
{
	public static void main(String[] args) 
	{
		
		int a[]={3,5,4,6,7,5,4,6,5,4,5};
		int repeat[] ={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		
		for (int i=0;i<a.length ;i++ )
		{
			int count=1;
			for (int j=i+1;j<a.length ;j++)
			{
				if (a[i]==a[j])
				{
					count++;
					repeat[j]=0;
				}
			}
			if (repeat[i]!=0)
			{
				repeat[i]=count;
			}
		}
		for (int i=0;i<a.length ;i++ )
		{
			if (repeat[i]!=0)
			{
				System.out.println("Element "+a[i]+" repeated at "+repeat[i]+" times");
			}
		}
	}

}
