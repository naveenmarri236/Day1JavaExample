package com.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example7 {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(23,"Ram",26,20000));
		l.add(new Employee(20,"Sam",29,40000));
		l.add(new Employee(21,"Ramu",31,50000));
		l.add(new Employee(15,"Raj",22,22000));
		
		System.out.println("using name");
		Collections.sort(l,new NameComparator());
		for(Employee e:l)
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
		
		System.out.println("using Age");
		Collections.sort(l,new AgeComparator());
		for(Employee e:l)
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
		
		System.out.println("using salary");
		Collections.sort(l,new Salarycomparator());
		for(Employee e:l)
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
		

	}

}
