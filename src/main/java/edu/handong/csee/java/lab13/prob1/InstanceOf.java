package edu.handong.csee.java.lab13.prob1;
public class InstanceOf {

	//Friend - SchoolFriend - ClassFriend 
	public static void WhatFriend(Friend inputInstance) {

		if(inputInstance instanceof ClassFriend) {

			((ClassFriend)inputInstance).printClassFriend();
		}

		else if(inputInstance instanceof SchoolFriend) {

			((SchoolFriend) inputInstance).printSchoolFriend();
		}

		else {

			inputInstance.printFriend();
		}

	}

}
