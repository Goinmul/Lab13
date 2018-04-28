package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double r)
	{
		this.radius = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2.0*Math.PI*radius;
	}

}
