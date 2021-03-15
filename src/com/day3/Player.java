package com.day3;
import java.util.Scanner;
class Sample2{
	String name;
	String country;
	String skill;
	
	public Sample2(String name, String country, String skil) {
		this.name = name;
		this.country = country;
		this.skill = skill;
		System.out.println("Player details: ");
		System.out.println("name  :" +this.name);
		System.out.println("country   :" +this.country);
		System.out.println("skill   :" +this.skill);
	}

	
}
public class Player {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the player name: ");
		String name=s.nextLine();
		System.out.println("enter the country name :");
		String country=s.nextLine();
		System.out.println("enter the skill name :");
		String skill=s.nextLine();
		
		Sample2 sam=new Sample2(name,country,skill);
		

	}

}
