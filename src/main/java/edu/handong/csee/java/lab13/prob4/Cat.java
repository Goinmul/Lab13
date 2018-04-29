package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet {

	public String food() { // food() method is originally in the interface. In this Cat Class, you need to "customize" it.
		return "(Cat!)" + "Fish";
	}
}
