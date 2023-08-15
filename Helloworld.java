public class Helloworld
{
    public static void main(String[] args) {
        System.out.println("hello");
        Helloworld pt1 = new Helloworld();
        pt1.pattern1();
        Helloworld pt2 = new Helloworld();
        pt2.pattern2();
        Helloworld pt3 = new Helloworld();
        pt3.pattern3();
        Helloworld pt4 = new Helloworld();
        pt4.pattern4();
        Helloworld pt5 = new Helloworld();
        pt5.pattern5();
        Helloworld pt6 = new Helloworld();
        pt6.pattern6();
        Helloworld pt7 = new Helloworld();
        pt7.pattern7();
        Helloworld pt8 = new Helloworld();
        pt8.pattern8();
    }

    public void pattern8()
    {
        System.out.println("hello 8");
        int n=4;
        for(int i =1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }  

    public void pattern7()
    {
        System.out.println("hello 7");
        int n=4;
        for(int i =1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6()
    {
        System.out.println("hello 6");
        int n=4;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern5()
    {
        System.out.println("hello 5");
        int n=4;
        for(int i =1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }  
    
    public void pattern4()
    {
        System.out.println("hello 4");
        int n=4;
        for(int i =1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    

    public void pattern3()
    {
        System.out.println("hello 3");
        int n=4;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k =n;k>=i;k--)
            {
                System.out.print("*");
            }
            for(int l =n-1;l>=i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2()
    {
        System.out.println("hello 2");
        int n=4;
        for(int i =1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern1()
    {
        System.out.println("hello 1");
        int n=4;
        for(int i =1;i<=n;i++)
        {
            for(int j =n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1;i<=n;i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k =n-1;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }      
}    

