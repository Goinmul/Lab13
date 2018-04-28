package edu.handong.csee.java.lab13.prob2;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book("1984");
		History history = new History("Korean History","Kwon Hyun Woo");
		Science science = new Science("Basic Physics", "Newton");
		
		book.show();
		science.show();
		history.show();


	}

	
}
