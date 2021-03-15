package com.day3;
class Test{
	void add(int...a){
		for(int a1:a) {
			System.out.println(a1);
			
		}
	}
	void add(String...s) {
		for(String s1:s) {
			System.out.print(s1);
		}
	}
	void add(boolean b,int...a) {
		System.out.println(b);
		for(int a2:a) {
			System.out.println(a2);
		}
	}
	
	
}
public class Example10 {

	public static void main(String... args) {
		Test t=new Test();
		t.add(20,30);
		t.add(10,20,30,40,50,60);
		t.add("A","b","c");
		t.add(true,10,2,3,6,5,8);
		

	}

}
