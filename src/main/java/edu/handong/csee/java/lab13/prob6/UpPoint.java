package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint {

	private int x,y;
	
	UpPoint(int x, int y) // constructor
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x : " + x + "  y : " + y;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
