package com.day7;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		//int []a=new int[10];
		//for(int i=0;i<a.length;i++) {
			//a[i]=i*-3; //0 -3 -6 -9.......-27
			
		//}
		int a[]= {0,-3,-6,-9,-12,-15,-18,-21,-24,-27};
		
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, -9));
		System.out.println(Arrays.binarySearch(a, -11));
		//-(index)-1=-6-1=-7
		System.out.println(Arrays.binarySearch(a, -1));
		//-9-1=-10
		
		Arrays.sort(a,4,8);
		for(int a2:a) 
			System.out.println(a2);
			
			System.out.println();
			Arrays.fill(a, 2);
			System.out.println(a);
			for(int a3:a) 
				System.out.println(a3);
			
			System.out.println();
			Arrays.fill(a, 2,6,3);
			for(int a4:a)
				System.out.println(a4);
			
		
		
		
	}

}
