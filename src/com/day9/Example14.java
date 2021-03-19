package com.day9;

import java.time.LocalTime;

public class Example14 {

	public static void main(String[] args) {
		LocalTime l1=LocalTime.now();
		System.out.println(l1);
		
		LocalTime l2=LocalTime.parse("09:30");
		System.out.println(l2);
		
		LocalTime l3=LocalTime.of(9,45);
		System.out.println(l3);
		
		LocalTime l4=l3.plusHours(2);
		System.out.println(l4);
		
		
		
		
		
		
	}

}
