package com.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		System.out.println(l1);
		boolean b=Collections.addAll(l1,"D","E","F");
		System.out.println(l1);
		
		int i=Collections.binarySearch(l1, "C");
		System.out.println(i);
		
		List<String> src=new ArrayList<>();
		src.add("hello");
		src.add("world");
		src.add("oyy");

		
		List<String> dest=new ArrayList<>();
		dest.add("he");
		dest.add("wo");
		dest.add("hi");
		boolean b1=Collections.disjoint(src,dest);
		System.out.println(b1);
		
		Collections.copy(dest, src);
		System.out.println(src);
		System.out.println(dest);
		Collections.fill(src, "welcome");
		System.out.println(src);
		System.out.println(dest);
		
		System.out.println(Collections.frequency(src, "welcome"));
		
		List<Integer> l2=new ArrayList<>();
		l2.add(8);
		l2.add(-20);
		l2.add(20);
		l2.add(-8);
		System.out.println(Collections.max(l2));
		System.out.println(Collections.min(l2));
		System.out.println(l2);
		
		Collections.reverse(l2);
		System.out.println(l2);
		
		Collections.shuffle(l2);
		System.out.println(l2);
		
		boolean b2=Collections.replaceAll(l2, 8, 18);
		System.out.println(l2);
		
		
		String str[]= {"one","two","three"};
		List<String> l3=new ArrayList<>(Arrays.asList(str));
		System.out.println(l3);
		l3=Collections.singletonList("four");
		System.out.println(l3);

		Collections.sort(l2);;
		System.out.println(l2);
		
		Collections.swap(l2, 0, 2);
		System.out.println(l2);
		
		List<Integer> l4=new ArrayList<>();
		l4.add(4);
		l4.add(2);
		l4.add(3);
		System.out.println(l4);
		List<Integer> l5=Collections.synchronizedList(l4);
		System.out.println(l5);
		
		List<Integer> l6=new ArrayList<>();
		l6.add(1);
		l6.add(2);
		l6.add(3);
		System.out.println(l6);
		
		List<Integer> l7=Collections.unmodifiableList(l6);
		System.out.println(l7);
		
		
		
		
		
		
		
		
		
		

	}

}
