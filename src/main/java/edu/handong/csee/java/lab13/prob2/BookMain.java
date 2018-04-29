package edu.handong.csee.java.lab13.prob2;

public class BookMain {

	public static void main(String[] args) {

		Book book = new Book("1984");
		Science science = new Science("Basic Physics", "Newton");
		History history = new History("Korean History","Kwon Hyun Woo");

		book.show();
		science.show();
		history.show();

	} // you must instantiate + use 'show()' method symmetrically, or the Id will increase differently.
	// In other words, the Id increases following the order of instantiation.

}
