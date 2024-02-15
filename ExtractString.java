package string;

public class ExtractString 
{
	public static void main(String[] args) 
	{
		String s=new String();
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.print(" "+s.charAt(i));
		}
		System.out.println();
		for (int j=s.length()-1;j>=0; j--) 
		{
			System.out.print(" "+s.charAt(j));
		}
		
	}
}
