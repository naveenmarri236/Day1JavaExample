package com.pack;

public class Java_2 {

	public static void main(String[] args) {
		System.out.println("Hiiii");
		
		System.out.println();
		
		int a1[]=new int[4];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		System.out.println();
		
		for(int a2:a1) {
			System.out.println(a2);
		}
		System.out.println();
		
		int [][]b1=new int[2][2];
		b1[0][0]=1;	b1[0][1]=2;
		b1[1][0]=3;	b1[1][1]=4;
		
		for(int i=0;i<b1.length;i++) {
			for(int j=0;j<b1.length;j++) {
				System.out.println(b1[i][j]);
			}
		}
		
		System.out.println();
		
		for(int c1[]:b1) {
			for(int d1:c1) {
				System.out.println(d1);
			}
		}

		
	}

}
