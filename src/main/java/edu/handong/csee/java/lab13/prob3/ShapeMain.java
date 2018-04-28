package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;
public class ShapeMain {
	
	public static void main(String[] args) {
		
		
		double n1,n2,n3;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter radius : ");
		n1 = keyboard.nextDouble();
		
		Circle myCircle = new Circle(n1);
		System.out.println("Radius : " + n1);
		myCircle.display(); // even though in the Circle Class there is no implementation for this method, you just inherited the method from superclass.
		
		System.out.println(""); // changing line
		
		
		
		System.out.print("Enter length : ");
		n2 = keyboard.nextDouble();
		System.out.print("Enter width : ");
		n3 = keyboard.nextDouble();
		
		Rectangle myRec = new Rectangle(n2,n3);
		System.out.println("Length : " + n2);
		System.out.println("Width : " + n3);
		myRec.display();
	}

}
