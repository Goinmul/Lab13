package edu.handong.csee.java.lab13.prob6;

public class Printer {

	public static void Print(Object object)
	{
		//String str = object.toString(); // str is toString(). Default call is DownPoint's toString().
		//But I didn't like the way of using interface in this way(empty interface).

		String str = ((CapitalPrint) object).print(); //so I changed it in this way. I used the overridden method, print().
		// in this way, I felt like I can use more of the interface.

		if(object instanceof DownPoint)
		{
			//nothing happens, and the x and y are printed in small letters.
			//you can delete this if statement, but I put it to explicitly show the conditions.
		}

		if(object instanceof UpPoint) // In the answer code, JC used interface just to distinguish from Capital/Small letters.
			str = str.toUpperCase(); // But I'd like to go more standard(?) way.

		System.out.println(str); // printing out str
	}
}
