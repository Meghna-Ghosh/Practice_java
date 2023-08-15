//java program to calculate sum of 2 number

import java.util.*;

class Sum2{
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any two integer number: ");
		Scanner s = new Scanner(System.in);

		a=s.nextInt();
		b=s.nextInt();

		c = a+b;
		System.out.println("Sum of two integer number: "+c);
		s.close();
	}
}