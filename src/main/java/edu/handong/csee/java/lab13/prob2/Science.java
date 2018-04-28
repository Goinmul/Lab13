package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {

	private String Publisher;
	
	public Science(String title, String publisher) 
	{
		super();
		this.Publisher = publisher;
	}
	
	public void printScience() {
		
		System.out.println("<<<Science>>>");
		System.out.println("ID : " + getIdNumber());
		System.out.println("Book Name : " + getTitle());
		System.out.println("Publisher : " + getPublisher());
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	
	
}
