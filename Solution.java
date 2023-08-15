// import java.util.Scanner;
public class Solution {
    public static void main (String[] agrs) {
        int n = 5;
        // System.out.println("enter n value:");
        // Scanner sc = new Scanner(System.in);
        // // int n = sc.nextInt();
        // for(int i = 0; i <= n; i++) {
        //     for(int j = 0; j < i; j++) { 
        //         System.out.print("* ");
        //     } 
        //    System.out.println("");
        // }

        // for(int i = 0; i < n; i++) {
        //     for(int j = i; j < n; j++) { 
        //         System.out.print("* ");
        //     } 
        //    System.out.println("");
        // }
        //    sc.close(); 

        // not working code -->
        // for(int i = 0; i < n; i++) {
        //     for(int j = 2*(n-i); j >= 0; j++) { 
        //         System.out.print("");
        //     }
        //     for(int j = 0; j <= 1; j++) {
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }
        // <-- not working code


         for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        //     for (int i = 1; i <= n; i++) {
        //     // Print spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     // Print stars
        //     for (int k = 1; k <= 2 * i - 1; k++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


    }
}     