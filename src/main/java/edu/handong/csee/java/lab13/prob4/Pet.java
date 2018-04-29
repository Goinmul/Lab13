package edu.handong.csee.java.lab13.prob4;

public interface Pet { // interface is, in a view of hierarchy, higher than cat and dog. 
	
	public String food(); // I don't have to implement this method. Just show the structure is fine in "interface" !!

}
// so when you call Pet, the function food() is called,
// following the Class' function that implements this interface.