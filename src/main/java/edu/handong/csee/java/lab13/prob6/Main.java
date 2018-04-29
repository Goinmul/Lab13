package edu.handong.csee.java.lab13.prob6;

public class Main {

	public static void main(String[] args) {// there is not much to explain in the main method.

		//Instantiating two classes twice each.
		UpPoint p1 = new UpPoint(3,3);
		DownPoint p2 = new DownPoint(2,5);
		DownPoint p3 = new DownPoint(4,7);
		UpPoint p4 = new UpPoint(9,12);

		//using Print() method in Printer Class. That's all.
		Printer.Print(p1);
		Printer.Print(p2);
		Printer.Print(p3);
		Printer.Print(p4);

	}

}
