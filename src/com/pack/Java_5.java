package com.pack;

class Box2{
	double heigth;
	double breadth;
	double depth;
	
	
	 
	public Box2() {
		super();
		heigth=10;
		breadth=20;
		depth=15;
	}
	



	public Box2(double heigth, double breadth, double depth) {
		super();
		this.heigth = heigth;
		this.breadth = breadth;
		this.depth = depth;
	}




	double volume() {
		return heigth*breadth*depth;
	}
}
public class Java_5 {

	public static void main(String[] args) {
		Box2 b3=new Box2();
		Box2 b4=new Box2();
		Box2 b5=new Box2(6,7,5);
		Box2 b6=new Box2(7,8,6);
		
		
		double vol;
		vol=b3.heigth*b3.breadth*b3.depth;
		System.out.println("volume is  "+vol);
		vol=b4.heigth*b4.breadth*b4.depth;
		System.out.println("volume is  "+vol);
		b5.volume();
		System.out.println("volume is  "+vol);
		b6.volume();
		System.out.println("volume is   "+vol);
		
	}

}
