//java program to calculate the avg of 3 numbers.

import java.util.*;
class Avg
{
	public static void main(String args[])
	{
	    int a, b, c, avg;
        System.out.println("Please input the three numbers: ");   

		Scanner sc = new Scanner(System.in);  // Create Scanner object
		a = sc.nextInt(); // Read the 1st integer from the screen
		b = sc.nextInt(); // Read the 2nd integer from the screen
		c = sc.nextInt(); // Read the 3rd integer from the screen

        avg = (a+b+c)/3;
	   	System.out.println("The average of three number is "+avg);
	   	sc.close();
	}
}
