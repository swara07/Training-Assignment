import java.util.*;

class BasicDatatypes
{
    public static void main(String args[])
    {
        int age;
        double salary;
        String name;
        char letter;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name");
        name=sc.next();
        System.out.println("enter your salary");
        salary=sc.nextDouble();
        System.out.println("enter your age");
        age=sc.nextInt();
        System.out.println("enter your initial letter");
        letter=sc.next().charAt(0);


        
        System.out.println(name+" 's profile");
        System.out.println("age="+age);
        System.out.println("salary="+salary);
        System.out.println("letter="+letter);

    }

}