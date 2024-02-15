package arrays;

public class SilectionSort {
	public static void main(String[] args) {  
		  int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};    
		  for(int i=0;i<10;i++)  
		  {  
		    int pos = smallest(a,i);  
		   int temp = a[i];  
		    a[i]=a[pos];  
		    a[pos] = temp;  
		  }
		  for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		}
		public static int smallest(int a[],int i)  
		{  
		  
		 int small = a[i];  
		int  pos = i;  
		  for(int j=i+1;j<10;j++)  
		  {  
		    if(small>a[j])
		    {  
		      small = a[j];  
		      pos=j;  
		    }  
		  }  
		  return pos;  
		}
		
}
