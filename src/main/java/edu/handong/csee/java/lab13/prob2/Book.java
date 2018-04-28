package edu.handong.csee.java.lab13.prob2;

public class Book {
	
	//public Book() {} // explicit default constructor(not necessary)
	
	private static int idCount = 0; // reason for static modifier is that later on I'm gonna use this integer value at other classes.
	private String BookName;
	private int id = 0;
	
	public Book(String Name) // a public constructor 'Book'
	{
		this.BookName = Name; // assigning value to private BookName
		idCount++;
		id = idCount; // assigning value to private int id
	}
	
	public String toString() // printing out sentence with id and BookName
	{
		return "\n\tId : " + id + "\n\tBook Name : " + BookName;
		
	}
	
	public void show() // printing out sentence from toString
	{
		System.out.println("<<<BOOK>>>" + this.toString());
	}
	
	
	
	

}
