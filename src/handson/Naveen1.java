package handson;

import java.util.Scanner;

class Shape {
	protected String shapeName;

	double calculateArea() {
		return 0;
	}
}

class Square extends Shape {
	private int side;

	public Square(int side) {
		super();
		this.side = side;

	}

	double calculateArea() {
		return side * side;

	}

}

class Rectangle extends Shape {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	double calculateArea() {
		return length * breadth;
	}

}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	double calculateArea() {
		return 3.14 * radius * radius;
	}

}

public class Naveen1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		System.out.println("ENTER SHAPE 1-> REACTANGLE, 2-> SQARE, 3->CIRCLE");
		int typeshape = sc.nextInt();

		switch (typeshape) {

		case 1:
			System.out.println("enter length and breadth");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			shape = new Rectangle(length, breadth);
			break;
		case 2:
			System.out.println("enter side");
			int side = sc.nextInt();

			shape = new Square(side);
			break;
		case 3:
			System.out.println("enter radius");
			int radius = sc.nextInt();
			shape = new Circle(radius);
			break;
		default:
			shape = new Shape();

		}

		System.out.println(shape.calculateArea());
	}

}
