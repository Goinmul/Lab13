package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape {

	private double length; // for a rectangle, I need length and width.
	private double width;

	public Rectangle(double length, double width) // initializing a constructor with length and width.
	{
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() { // In this childclass, I'm going to use area() as computing the area of a rectangle.
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double perimeter() { // same concept as area() method. Overriding occurred!
		// TODO Auto-generated method stub
		return 2*(length+width);
	}

}
