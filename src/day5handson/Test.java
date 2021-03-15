package day5handson;

import java.util.Scanner;

class InvalidAgeRangeException extends Exception {


	public InvalidAgeRangeException(String message) {
		super(message);
		

	}

}

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the player name :");
		String name = s.nextLine();
		
		System.out.println("enter the player age :");
		int age = s.nextInt();


		try {
			if (age > 19) {
				getUserDetails(name, age);
			} else {
				throw new InvalidAgeRangeException("IntegerAgeRangeException");
			}
		} catch (InvalidAgeRangeException e) {
			
			System.out.println(e.getMessage());

		}

	}

	public static void getUserDetails(String name, int age) {
		System.out.println("Player Name:   " + name);
		System.out.println("Player Age :   " + age);
	}
}
