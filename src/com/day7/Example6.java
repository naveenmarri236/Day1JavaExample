package com.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example6 {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"Ram",34));
		l.add(new Student(2,"Sam",24));
		l.add(new Student(3,"Rao",28));
		l.add(new Student(4,"krithi",18));
		
		Collections.sort(l);
		for(Student st:l) {
			System.out.println(st.getId()+" "+st.getName()+" "+st.getAge());
		}
		
		

	}

}
