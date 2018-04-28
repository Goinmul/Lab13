package edu.handong.csee.java.lab13.prob2;

public class Book {
	
	private static int idNumber = 0;
	private String Title;
	
	public void Book(String title) {
		this.Title = title;
		this.idNumber = ++idNumber;
	}
	
	public void printBook() {
		System.out.println("<<<BOOK>>>");
		System.out.println("ID : " + idNumber);
		System.out.println("Book Name : " + Title);
	}
	
	
	
	
	// getters and setters for private variables, Strings.
	// actually, setters are pointless here.
	/*public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}*/
	
	

}
