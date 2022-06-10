import java.util.*;

class Factorial
{

    public int findFactorial(int num)
    {
        int fact=1;
        int i;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        Factorial obj=new Factorial();
        System.out.println("Enter a no:");
        n=sc.nextInt();

        System.out.println("Factorial of "+n+" = "+obj.findFactorial(n));

    }
}