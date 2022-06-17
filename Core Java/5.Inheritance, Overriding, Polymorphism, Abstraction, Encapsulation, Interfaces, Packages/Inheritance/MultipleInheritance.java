import java.util.*;

interface Science
{  
    void displayScieneOptions();
}

interface Commerce
{
    void displayCommerceOptions();
}

class Student implements Science,Commerce
{
    String stream;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your stream");
        stream=sc.next();  
    }
    public void displayScieneOptions()
    {
        System.out.println("Your options are :\n1. doctor \n2.engineer");
    }

    
    public void displayCommerceOptions()
    {
        System.out.println("Your options are :\n1. accountant \n2.banker");
    }
}


class MultipleInheritance 
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.getData();
        if(s.stream.equals("science"))
            s.displayScieneOptions();
        else if(s.stream.equals("commerce"))
            s.displayCommerceOptions();
    }
}
