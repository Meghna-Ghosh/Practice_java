//java program to check Leap Year or not
import java.util.*;
public class LeapYear
{
	public static void main(String Args[])
	{
		int year;
		System.out.println("Please enter the year to be checked as Leap Year:");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(+year+" is a Leap Year.");
			}
			else
			{
				System.out.println(+year+" is not a Leap Year.");
			}
		}
		else
		{
			if(year%4==0)
			{
				System.out.println(+year+" is a Leap Year.");
			}
			else
			{
				System.out.println(+year+" is not a Leap Year.");
			}
		}
		sc.close();
    }    
}