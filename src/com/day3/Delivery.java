package com.day3;
import java.util.Scanner;
class Sample6{
	long over;
	long ball;
	long runs;
	String batsman;
	String bowler;
	String nonStriker;
	public Sample6(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	void displayDeliveryDetails() {
		System.out.println("over  :"+this.over);
		System.out.println("ball  :"+this.ball);
		System.out.println("runs  :"+this.runs);
		System.out.println("batsman  :"+this.batsman);
		System.out.println("bowler  :"+this.bowler);
		System.out.println("nonStriker  :"+this.nonStriker);
	}
}
public class Delivery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the over");
		int over=sc.nextInt();
		System.out.println("enter the ball");
		int ball=sc.nextInt();
		System.out.println("enter the runs");
		int runs=sc.nextInt();
		System.out.println("enter the batsman name");
		String batsman=sc.nextLine();
		System.out.println("enter the bowler name");
		String bowler=sc.nextLine();
		System.out.println("enter the nonStriker");
		String nonStriker=sc.nextLine();
		
		Sample6 s6=new Sample6(over,ball,runs,batsman,bowler,nonStriker);
		s6.displayDeliveryDetails();
		

	}

}
