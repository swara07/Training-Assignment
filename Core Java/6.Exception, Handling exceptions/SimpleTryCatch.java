import java.util.*;
class SimpleTryCatch
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos:");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            int div=a/b;
            System.out.println("division is:"+div);
        }

        catch(Exception e)
        {
            System.out.println(e+" Cannot divide by zero");
        }

        finally
        {
            System.out.println("Finally block executes with or without exception");
        }
    }
}