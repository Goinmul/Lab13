package edu.handong.csee.java.lab13.prob1;
public class InstanceOf {

	
	//Friend - SchoolFriend - ClassFriend 
	public static void whatFriend(Friend inputInstance) {//for each condition, invoke the right method dynamically.

		if(inputInstance instanceof ClassFriend) {

			((ClassFriend)inputInstance).printClassFriend(); // you MUST TYPE CAST the instances. (Since the parameter type was Friend)
		}

		else if(inputInstance instanceof SchoolFriend) { // Same here.

			((SchoolFriend)inputInstance).printSchoolFriend();
		}

		else {

			inputInstance.printFriend();
		}

	}

}
