package com.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example6 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(10);
		l.add(20);
		System.out.println(l);
		
		//1.For loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
			
		}
		System.out.println();
		
		//2.foreach loop
		for(int a:l) {
			System.out.println(a);
		}
		
		//3.Iterator
		System.out.println("using iterator interface");
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext()) {
			//Integer i=(Integer)itr.next();
			System.out.println(itr.next());
		}
		//ListIterator
		System.out.println("using ListIterator");
		
		ListIterator<Integer> ltr=l.listIterator();
		while(ltr.hasNext()) {
			Integer i=ltr.next();
			ltr.set(i+2);
			

			
		}
		
	
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		
		
		
	}

	

}
