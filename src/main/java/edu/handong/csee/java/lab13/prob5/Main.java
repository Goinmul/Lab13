package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row1, col1, row2, col2; // integers to use.

		Scanner keyboard = new Scanner(System.in); // instantiating Scanner

		//getting the size(rows and columns) of the array that you are going to make.
		System.out.println("For the first array,");
		System.out.print("Enter row size(maximum 5) : ");
		row1 = keyboard.nextInt();

		System.out.print("Enter column size(maximum 5) : ");
		col1 = keyboard.nextInt();
		System.out.println();

		//getting the size(rows and columns) of the array that you are going to make. Same as above.
		System.out.println("For the second array,");
		System.out.print("Enter row size(maximum 5) : ");
		row2 = keyboard.nextInt();
		System.out.print("Enter column size(maximum 5) : ");
		col2 = keyboard.nextInt();

		//Instantiating two arrays, with the size of user input.
		int[][] myArray1 = new int[row1][col1];
		int[][] myArray2 = new int[row2][col2];

		//getting value to first list
		System.out.println("Enter List1 : ");
		for (int i=0; i<myArray1.length;i++)//double iteration, iterate row1*col1 times
		{
			for(int j = 0; j<myArray1[i].length;j++)
			{
				System.out.print("index["+i+"]["+j+"] : ");
				myArray1[i][j] = keyboard.nextInt();//getting value of index [i][j] from user
			}

		}

		//Just the same as first list(right above). Giving values to the second list
		System.out.println("Enter List2 : ");
		for (int i=0; i<myArray2.length;i++)
		{
			for(int j = 0; j<myArray2[i].length;j++)
			{
				System.out.print("index["+i+"]["+j+"] : ");
				myArray2[i][j] = keyboard.nextInt();
			}

		}

		//printing out all the values of list
		System.out.println("First array : ");
		for (int i=0; i<myArray1.length;i++)
		{
			for(int j = 0; j<myArray1[i].length;j++)
			{
				System.out.print(myArray1[i][j]+" " );
			}

		}
		System.out.println();

		//printing out all the values of list(same as above)
		System.out.println("Second array : ");
		for (int i=0; i<myArray2.length;i++)
		{
			for(int j = 0; j<myArray2[i].length;j++)
			{
				System.out.print(myArray2[i][j]+" " );
			}

		}

		System.out.println();
		
		Array inst1 = new Array(); // Instantiating Array Class to use the equals() method.
		//there are 4 different conditions, see below.

		if (inst1.equals(myArray1, myArray2) == -1) { // different in row size
			System.out.println("The two arrays are different.");
		}
		else if (inst1.equals(myArray1, myArray2) == 0) { // all the values are the same
			System.out.println("The two arrays are exactly identical.");
		}
		
		else if (inst1.equals(myArray1, myArray2) == 1) { // maximum 3 difference of values are approximately same
			System.out.println("The two arrays are approximately identical.");
		}
		
		else{ // more than 3 (starting from 4) difference of values are different.
			System.out.println("The two arrays are different.");
		}

	}
	

}
