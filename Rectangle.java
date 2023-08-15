import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int w,l,area,perimeter;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        l = sc.nextInt();

        System.out.println("Please enter the width of the rectangle:");
        w = sc.nextInt();

        area = l*w;
        perimeter = 2*(l+w);
        System.out.println("The area of the rectangle "+area);
        System.out.println("The perimeter of the rectangle "+perimeter);
        sc.close();
    }
    
}
