package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;

public class PetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cat_name, dog_name;
		
		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the cat name : ");
		cat_name = keyboard.next();
		
		System.out.print("Enter the dog name : ");
		dog_name = keyboard.next();
		
		cat.setName(cat_name);
		System.out.println("Name : " + cat.getName());
		master.feed(cat);
		
		dog.setName(dog_name);
		System.out.println("Name : " + dog.getName());
		master.feed(dog);
		
	}

}
