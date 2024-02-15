package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqNuber {
public static void main(String[] args) {
	int a[]= {1,2,2,1,3,4,3,2,3};
	
	Arrays.sort(a);
	Set<Integer>a1=new HashSet<>();
	for (int i = 0; i < a.length; i++) {
		a1.add(a[i]);
	}
	for (Integer integer : a1) {
		System.out.print(integer);
	}
}
}