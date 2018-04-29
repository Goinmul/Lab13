package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;
public class ShapeMain {

	public static void main(String[] args) {

		double n1,n2,n3; // a variable for containing values from user.
		Scanner keyboard = new Scanner(System.in); // instantiating a scanner.

		System.out.print("Enter radius : ");
		n1 = keyboard.nextDouble(); // assigning n1 a double number from the user.

		Circle myCircle = new Circle(n1); // Instantiating Circle class, with the radius of n1.
		System.out.println("Radius : " + n1);
		myCircle.display(); // even though in the Circle Class there is no implementation for this method, you just inherited the method from superclass.

		System.out.println(""); // changing line



		System.out.print("Enter length : ");
		n2 = keyboard.nextDouble();// assigning n2 a double number from the user.
		System.out.print("Enter width : ");
		n3 = keyboard.nextDouble();// assigning n3 a double number from the user.

		Rectangle myRec = new Rectangle(n2,n3); // Instantiating a Rectangle Class with length of n2 and width of n3.
		System.out.println("Length : " + n2);
		System.out.println("Width : " + n3);
		myRec.display(); // show the result.
	}

}
