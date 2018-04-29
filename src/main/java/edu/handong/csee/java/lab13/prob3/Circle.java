package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {

	private double radius; //we need radius for a circle, obviously.

	public Circle(double r) // constructor with initializing radius.
	{
		this.radius = r;
	}

	@Override
	public double area() { // overriding the method from "abstract" superclass
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2); // in this child class, I'm gonna use the area() as computing the area of a circle.
	}

	@Override
	public double perimeter() { // same concept as area() method. Overriding!
		// TODO Auto-generated method stub
		return 2.0*Math.PI*radius;
	}

}
