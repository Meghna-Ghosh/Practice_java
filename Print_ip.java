//java program to print the input as o/p

//import java.io.*;
import java.util.Scanner;

class Print_ip{

	public static void main(String[] args)
		{
		 int num;   // Declare the variables
		 System.out.println("Enter the integer: ");   // Input the integer
		 Scanner sc = new Scanner(System.in);   // Create Scanner object
		 num = sc.nextInt();   // Read the next integer from the screen
		 System.out.println("Entered integer is: "+num);   // Display the integer
		 sc.close();
		}
}