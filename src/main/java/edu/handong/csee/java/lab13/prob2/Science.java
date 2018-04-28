package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {

	private String publisher;
	
	public Science(String Name, String Publisher)
	{
		super(Name); // Calling constructor from Book Class.
		// this initializes the variables. (in this case, with name)
		this.publisher = Publisher;
		
	}
	
	public String toString() {
		
		return super.toString() + "\n\tPublisher : " + this.publisher; 
	}// returning the method(from superclass) result + String from this class.
	// \n is changing line, and \t is putting a tab.
	
	public void show() {
		
		System.out.println("<<<Science>>>" + this.toString());
	}
	
	
	
}
