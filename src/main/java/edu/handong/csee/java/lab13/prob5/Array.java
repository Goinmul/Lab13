package edu.handong.csee.java.lab13.prob5;

public class Array {

	
	public static int equals(int[][] a1, int[][] a2) {

		if (a1.length != a2.length) { // comparing size of rows
			return -1; // if they are different, return false
		}

		// double iteration, comparing all the matching indexes.
		else {
			int count=0;
			for (int i = 0; i<a1.length;i++) 
			{
				for (int j =0; j<a1[i].length;j++) 
				{
					if (a1[i][j] != a2[i][j])
					{
						count++; // when any index's number is different, increase count by one.
						
					}

				}
			}
			
			if (count == 0) return 0; // just the same

			else if(count<=3) // maximum difference is 3, which is count == 3
			{
				return 1;

			}
			else return 2; // condition of count => 3
			
			
			
		}
		
		
		
		

	}
}
