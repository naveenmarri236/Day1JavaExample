package com.day7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example11 {
	public static void main(String[] args) {
		String []month= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		GregorianCalendar g=new GregorianCalendar();
		System.out.println("Date");
		int year=g.get(Calendar.YEAR);
		System.out.println(g);
	}
}
