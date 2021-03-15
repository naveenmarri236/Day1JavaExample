package com.pack;

class Box5{
	double heigth;
	double width;
	double depth;
	
	Box5(){
		heigth=1;
		width=2;
		depth=3;
		
		
	}
	Box5(Box5 b){
		heigth=b.heigth;
		width=b.width;
		depth=b.depth;
	}
	Box5(double h,double w,double d){
		heigth=h;
		width=w;
		depth=d;
		
	}
	double volume() {
		return heigth*width*depth;
	}
	
}
class BoxWeight extends Box5{
	double cost;
	
	BoxWeight(){
		heigth=1;
		width=2;
		depth=3;
		cost=4;
		
	}
	BoxWeight(double h,double w,double d,double c){
		heigth=h;
		width=w;
		depth=d;
		cost=c;
		
	}
}

public class Example_14 {

	public static void main(String[] args) {
		BoxWeight b=new BoxWeight();
		BoxWeight b1=new BoxWeight(1,2,3,4);
		double vol;
		
		vol=b.volume();
		System.out.println("volume is  "+vol);
		System.out.println("cost is  "+b.cost);
		vol=b1.volume();
		System.out.println("volume is  "+vol);
		System.out.println("cost is  "+b1.cost);

		

		
	

	}

}
