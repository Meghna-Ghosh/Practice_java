//java program to check + or - number

import java.util.Scanner;

public class Ck_p0n {
      public static void main(String[] args) {
        int i;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        if(i<0)
        {
            System.out.println("The number " +i+ " is negative.");
        }
        else if(i>0)
        {
            System.out.println("The number " +i+ " is positive."); 
        }
        else
        {
            System.out.println("The number " +i+ " is equal to zero."); 
        }
        sc.close();
      }    
    
}
