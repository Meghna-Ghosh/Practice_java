import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)
    {    
        int h,b;
        double area;
        System.out.println("Please enter the hight of the triangle:");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        
        System.out.println("Please enter the base of the triangle:");
        b = sc.nextInt();

        area = (0.5)*(h*b);
        System.out.println("The area of the triangle is "+area);
        sc.close();
    }

}