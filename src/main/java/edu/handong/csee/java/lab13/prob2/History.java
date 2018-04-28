package edu.handong.csee.java.lab13.prob2;

public class History extends Book {
	private String author;
	
	public History (String name, String author)
	{
		super(name); // assigning 'name', and modify static integer shown in the superclass
		this.author = author;
		
	}
	
	public String toString() {
		
		return super.toString() + "\n\tAuthor : " + this.author;
	}// toString from superclass shows the id number and book name.
	// plus, I want to add author, which is overridden in this class.
	
	public void show() {
		System.out.println("<<<History>>>" + this.toString());
		
		
	}
}