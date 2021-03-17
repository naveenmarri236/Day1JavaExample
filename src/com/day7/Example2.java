package com.day7;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Example2 {
	public static void main(String[] args) {
		
		Hashtable<Integer,Double> ht=new Hashtable<>();
		System.out.println(ht.size());
		
		ht.put(10,3.14);
		ht.put(2, 6.12);
		ht.put(8, 6.12);
		ht.put(5, 4.12);
		ht.put(4, 1.21);
		
		
		System.out.println(ht.size());
		System.out.println(ht);
		Set s=ht.keySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Integer key=(Integer)itr.next();
			System.out.println(key+" ->"+ht.get(key));	
		}
		
			
	}
}
