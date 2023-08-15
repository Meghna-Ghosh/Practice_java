//java program to check password using  if condition

import java.util.Scanner;

public class Condition_if {
    public static void main(String[] args) {
        //int pswd;
        System.out.println("Enter correct password:- ");
        Scanner obj = new Scanner(System.in);
        int pswd = obj.nextInt();

        if(pswd==6289)
        {
            System.out.println("This is correct password :)");
            System.out.println("Your name is Meghna Ghosh ");
        }
        else{
            System.out.println("This is incorrect password :(");
        }
        obj.close();
    }
}