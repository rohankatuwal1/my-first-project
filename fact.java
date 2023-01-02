import java.util.Scanner;

public class fact
{
    public static int Factorial_noRecursion (int n)
    {
        int fact = 1;
        for (int c=1; c<=n; c++)
            fact = fact*c;
        return fact;
    }
    public static void main (String [] args){
        int f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial of:");
        f = sc.nextInt();
        System.out.println("The factorial the number "+ f + "is: " + Factorial_noRecursion(f));
    }

}
