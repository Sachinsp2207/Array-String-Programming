package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add(20);
	a1.add(40);
	a1.add(90);
	a1.add(61);
	a1.add(30);
	
	
//	Arrays.sort(ip);
//	
//	for (int i = 0; i < ip.length; i++) {
//		System.out.print(ip[i]+" ");
//	}
	for(int i=0;i<a1.size();i++)
	{
	 for (int j = i; j <a1.size(); j++) {
		if (a1.indexOf(i)>a1.indexOf(j)) 
		{
			int temp=a1.indexOf(i);
		//	a1.indexOf(i)=a1.indexOf(j);
		}
		}
	}
	}
	
	
	}
