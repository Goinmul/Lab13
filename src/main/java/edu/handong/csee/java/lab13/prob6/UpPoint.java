package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint {

	private int x,y;

	UpPoint(int x, int y) // constructor
	{
		this.x = x;
		this.y = y;
	}

	/*public String toString() {
		return "x : " + x + "  y : " + y;
	}*/

	@Override
	public String print() { // interface's method, overridden here.
		// TODO Auto-generated method stub
		return "X : " + x + "  Y : " + y; // returning this String.

	}

}
