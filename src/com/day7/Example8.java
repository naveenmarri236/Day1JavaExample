package com.day7;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Example8 {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<>();
		p.add("Amit");
		p.add("Vinay");
		p.add("kiri");
		p.add("Jaya");
		p.add("Ravi");
		p.add("amit");
		System.out.println(p.element());
		System.out.println(p.peek());
		Iterator itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		p.remove();
		p.poll();
		System.out.println("After removing");
		
		itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
