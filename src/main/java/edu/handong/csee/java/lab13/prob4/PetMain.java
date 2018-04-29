package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;

public class PetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Strings to get names from user
		String cat_name, dog_name;
		
		// instantiating Classes
		Master master = new Master(); 
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		//instantiating Scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the cat name : ");
		cat_name = keyboard.next(); // getting cat_name from user
		
		System.out.print("Enter the dog name : ");
		dog_name = keyboard.next(); // getting dog_name from user
		
		cat.setName(cat_name);// set the "real" cat name as 'cat_name'
		System.out.println("Name : " + cat.getName()); // print cat name
		master.feed(cat); // calls function, Pet(interface) - Cat(implements)
		
		dog.setName(dog_name);// set the "real" dog name as 'dog_name'
		System.out.println("Name : " + dog.getName()); // print dog name
		master.feed(dog);
		
	}

}
/*when you call master.feed(dog); , first you call a function in Master Class.
 * The parameter is "dog", and dog is a type of "Pet".
 * Pet is an interface, by which Dog and Cat Class implements(similar to inherit).
 * So, Class Dog and Cat are type of Animal(inheritance) and type of Pet(interface).
 * Therefore, if you put dog as a parameter, in the Master Class, the "pet.food();" line calls the food() function in the Dog Class.
 * So, in the "public void feed(Pet pet)" line, you can just change the Pet pet part with "Animal pet".(If you are not to use interface)
 * but the reason for using interface is to let others know the structure clearly, so in here we "purposefully" used interface Class.
 */
