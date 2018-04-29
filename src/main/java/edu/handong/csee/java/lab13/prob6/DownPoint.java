package edu.handong.csee.java.lab13.prob6;

public class DownPoint implements CapitalPrint{

	private int x, y;

	DownPoint(int x, int y){ // constructor to initialize with a specific value
		this.x = x;
		this.y = y;
	}

	@Override
	public String print() { // interface's method, being overridden.
		// TODO Auto-generated method stub
		return "x : " + x + "  y : " + y; // returning this String.
	}

	/*public String toString() // simple method printing sentence
	{
		return "x : " + x + "  y : " + y;

	}*/

}
