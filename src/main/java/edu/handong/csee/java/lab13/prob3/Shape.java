package edu.handong.csee.java.lab13.prob3;

public abstract class Shape { // Creating an abstract class. The results may differ depending on show you "actually" implement.

	public abstract double area();
	public abstract double perimeter(); // pre-making method, without implementing, but just show what they are doing.

	public void display() { // same as above. Just showing the result from area() and perimeter().

		System.out.println("Area : " +area() + "\nPerimeter : " + perimeter() + "\n");
	}

}
