package arrays;

class Merging 
{
	public static void main(String[] args) 
	{
		char a[]={'A','B','C','D','E'};
		char b[]={'F','G','H','I','J'};
		char c[]=new char [a.length+b.length];
		 int ct=0;
        for (int i=0;i<a.length ;i++ )
        {
			c[i]=a[i];
			ct++;
        }
		for (int i=0;i<b.length ;i++ )
		{
			c[ct]=b[i];
			ct++;
		}
		for (int i=0;i<c.length ;i++ )
		{
			System.out.print(c[i]+" ");
		}
		
	}
}
