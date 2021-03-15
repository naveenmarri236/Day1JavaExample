package com.day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example5 {

	public static void main(String[] args) {
		/*HashSet<String> s=new HashSet<>();
		System.out.println(s.size());
		s.add("v");
		s.add("c");
		s.add("f");
		s.add("a");
		s.add("r");
		s.add("y");
		System.out.println(s.size());
		System.out.println(s);
		System.out.println(s);*/
		
		/*LinkedHashSet<String> s=new LinkedHashSet<>();
		
		System.out.println(s1.size());
		s1.add("v");
		s1.add("c");
		s1.add("f");
		s1.add("a");
		s1.add("r");
		s1.add("y");
		System.out.println(s1.size()); //6
		System.out.println(s1);
		System.out.println(s1);*/
		
		TreeSet<String> s=new TreeSet<>();
		
		System.out.println(s.size());
		s.add("v");
		s.add("c");
		s.add("f");
		s.add("a");
		s.add("r");
		s.add("y");
		System.out.println(s.size());
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet("f"));
		System.out.println(s.tailSet("f"));
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(12);
		ts.add(11);
		ts.add(16);
		ts.add(15);
		System.out.println(ts);
		System.out.println(ts.ceiling(13));//return the smallest elt greater than or equal to the given element 
		System.out.println(ts.floor(13));//return the greatest element less than or equal to given element
		
		System.out.println(ts.pollLast());//retrieves and remove the last element
		System.out.println(ts.pollFirst());
		System.out.println(ts);
	}

}
