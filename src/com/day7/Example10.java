package com.day7;

import java.util.Calendar;

public class Example10 {

	public static void main(String[] args) {
		String []month= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Calendar c=Calendar.getInstance(); //c will contain current date and time
		c.set(2000, 3,23,5,20,23);
		System.out.println("date: ");
		System.out.println(month[c.get(Calendar.MONTH)]);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println("Time: ");
		System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		c.add(Calendar.HOUR, 2);
		c.add(Calendar.MINUTE, 3);
		c.add(Calendar.SECOND, 4);
		System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		
		
		
	}

}
