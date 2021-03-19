package com.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) throws Exception {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println(age+"   "+name);*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter age");
		String s=br.readLine();
		int age=Integer.parseInt(s);
	}

}
