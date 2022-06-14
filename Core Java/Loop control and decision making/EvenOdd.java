import java.util.*;
class EvenOdd
{

    //check whether the no is even or odd
    public String checkEven(int num)
    {
        if(num%2==0)
            return "even";
        
        else
            return "odd";   
    }

    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        EvenOdd obj=new EvenOdd();
        System.out.println("Enter a no:");
        n=sc.nextInt();
        System.out.println(n+" is "+obj.checkEven(n));

    }
}