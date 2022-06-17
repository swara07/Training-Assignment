import java.util.*;
class ThrowExample
{

    public static void main(String args[])
    {
        int age;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your age:");
        age=sc.nextInt();
        if(age<18)
            throw new ArithmeticException("Person not eligible to drive");
        
        else
            System.out.println("Person can drive");
        
    }

}