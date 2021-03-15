package com.day3;
import java.util.Scanner;
class Venue{
	String name;
	String city;
	public Venue(String name, String city) {
		this.name = name;
		this.city = city;
		System.out.println("DETAILS : ");
		System.out.println(" name : "+this.name);
		System.out.println(" city : "+this.city);
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("enter the venue name : ");
		String name=sc.nextLine();
		System.out.println("Enter the city name :");
		String city=sc.nextLine();
		
		Venue venue= new Venue(name, city);
		
	}

}
