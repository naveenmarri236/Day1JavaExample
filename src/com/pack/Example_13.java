package com.pack;

class C{
	int i,j;
	void showij() {
		System.out.println(i+"     "+j);
	}
}
class B extends C{
	int k;
	
	public B(int a,int b,int c) {
		i=a;
		j=b;
		k=c;
	}
	void subk() {
		System.out.println(k);
	}
}
public class Example_13 {

	public static void main(String[] args) {
		B b=new B(10,20,30);
		b.showij();
		b.subk();
		
		
	}

}
