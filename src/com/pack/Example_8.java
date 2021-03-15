package com.pack;

class Box4{
	double heigth;
	double width;
	double depth;
	
	Box4(){
		heigth=10;
		width=20;
		depth=15;
	}
	Box4(double h,double w,double d){
		heigth=h;
		width=w;
		depth=d;
	}
	Box4(int len){
		heigth=width=depth=len;
	}
	Box4(Box4 b){  
		heigth=b.heigth;
		width=b.width;
		depth=b.depth;
	}
	double volume() {
		return heigth*width*depth;
	}
	
}
public class Example_8 {

	public static void main(String[] args) {
		Box4 b1=new Box4();
		Box4 b2=new Box4(5,10,15);
		Box4 b3=new Box4(7);
		Box4 b4=new Box4(b2);
		
		double vol;
		vol=b1.volume();
		System.out.println(vol);
		vol=b2.volume();
		System.out.println(vol);
		vol=b3.volume();
		System.out.println(vol);
		vol=b4.volume();
		System.out.println(vol);

	}

}
