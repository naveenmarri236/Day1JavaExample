package com.day3;

class Box{
	private double height;
	private double width;
	private double depth;
	
	Box(){
		height=-1;
		width=-1;
		depth=-1;
	}
	Box(double h,double w,double d){
		height=h;
		width=w;
		depth=d;
	}
	Box(int len){
		height=width=depth=len;
	}
	Box(Box ob){
		height=ob.height;
		width=ob.width;
		depth=ob.depth;
	}
	double volume() {
		return height*width*depth;
	}
	
}

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(){
		super();
		weight=-1;
	}
	BoxWeight(double h,double w,double d,double we){
	super(h,w,d);
	weight=we;
	}
	BoxWeight(int len,double we ){
		super(len);
		weight=we;
	}
	BoxWeight(BoxWeight ob){
		super(ob);
		weight=ob.weight;
	}
}
class Shipment extends BoxWeight{
	double cost;
	
	Shipment(){
		super();
		cost=-1;
	}
	Shipment(double h,double w,double d,double we,double c){
		super(h,w,d,we);
		cost=c;
	}
	Shipment(int len,double we,double c){
		super(len,we);
		cost=c;
	}
	Shipment(Shipment ob){
		super(ob);
		cost=ob.cost;
	}
}
public class Example1 {

	public static void main(String[] args) {
		
		Shipment s1=new Shipment();
		Shipment s2=new Shipment(1,2,3,4,5);
		Shipment s3=new Shipment(3,6,9);
		Shipment s4=new Shipment(s2);
		double vol;
		vol=s1.volume();
		System.out.println("volume is   "+vol);
		System.out.println("weight is  "+s1.weight);
		System.out.println("cost is   "+s1.cost);
		vol=s2.volume();
		System.out.println("volume is   "+vol);
		System.out.println("weight is  "+s2.weight);
		System.out.println("cost is   "+s2.cost);
		vol=s3.volume();
		System.out.println("volume is   "+vol);
		System.out.println("weight is  "+s3.weight);
		System.out.println("cost is   "+s3.cost);
		vol=s4.volume();
		System.out.println("volume is   "+vol);
		System.out.println("weight is  "+s4.weight);
		System.out.println("cost is   "+s4.cost);
		
	}

}
