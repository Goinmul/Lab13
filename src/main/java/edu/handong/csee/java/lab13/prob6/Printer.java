package edu.handong.csee.java.lab13.prob6;

public class Printer {

	public static void Print(Object object)
	{
		String str = object.toString(); // str is toString()

		if(object instanceof CapitalPrint) 
			str = str.toUpperCase();

		System.out.println(str); // printing out str
	}
}
