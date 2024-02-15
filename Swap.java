package arrays;

public class Swap
{
	public static void main(String[] args)
	{
			char ch[]= {'c','d','c','d','c'};
			
			for (int i = 0; i < ch.length-1; i++) 
			{
				for (int j = 0; j < ch.length-1; j++)
				{
					if ((ch[j]>ch[j+1]))
					{
						char temp=ch[j];
						ch[j]=ch[j+1];
						ch[j+1]=temp;
					}
				}
				
			}
			for (int i = 0; i < ch.length; i++) 
			{
			System.out.println(ch[i]);	
			}
	}
}
