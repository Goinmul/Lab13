package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet {

	public String food() {// food() method is originally in the interface. In this Dog Class, you need to "customize" it.
		return "(Dog!)" + "Sausage";
	}
}
