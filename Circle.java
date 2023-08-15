//java program to calculate the area of circle

import java.util.*;
class Circle
{
	public static void main(String args[])
	{
        double r;
	    System.out.println("The radious of the circle is: ");
		Scanner sc = new Scanner(System.in);  // Create Scanner object
		r = sc.nextDouble(); // Read the next integer from the screen
        double area = 3.14*r*r;
		System.out.println("The area of circle is "+area);
	    sc.close();
	}
}