import java.util.*;
class NestedIf
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        n=sc.nextInt();
        if(n>0)
            System.out.println("positive");
        else if(n<0)
            System.out.println("negative");
        else
            System.out.println("zero");

    }
}