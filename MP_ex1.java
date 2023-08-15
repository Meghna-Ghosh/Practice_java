//Write a Java program to test if a is number double or integer.

import java.util.Scanner;
public class MP_ex1 {
    public static void main(String[] args) {
        double i;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextDouble();
        
        if ((i % 1) == 0)
        {
            System.out.println("It is an integer number "+i);
        }
        else
        {
            System.out.println("It is an double number "+i);
        }
        sc.close();
    }
    
}
