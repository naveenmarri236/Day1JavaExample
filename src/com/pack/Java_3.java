package com.pack;

class Box{
	
	double heigth;
	double breadth;
	double depth;
}
public class Java_3 {

	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box();
		
		b1.heigth=10;
		b1.breadth=20;
		b1.depth=30;
		
		b2.heigth=11;
		b2.breadth=22;
		b2.depth=33;
		
		double vol;
		
		vol=b1.heigth*b1.breadth*b1.depth;
		System.out.println(vol);
		
		vol=b2.heigth*b2.breadth*b2.depth;
		System.out.println(vol);



	}

}
