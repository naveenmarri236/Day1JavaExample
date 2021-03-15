package com.pack;


class Box1{
	
	double heigth;
	double breadth;
	double depth;
	
	double volume() {
		return heigth*breadth*depth;
	}
	
}

public class Java_4 {

	public static void main(String[] args) {
		Box1 b2=new Box1();
		
		b2.heigth=10;
		b2.breadth=20;
		b2.depth=15;
		
		double vol=b2.volume();
		System.out.println("Volume is   "+vol);
	}

}
