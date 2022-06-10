import java.util.*;

class Student
{
int age;
String name;

//default constructor
Student()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your name:");
name=sc.next();
System.out.println("enter your age:");
age=sc.nextInt();
}

void display()
{
    System.out.println(name+"'s profile\nage= "+age+"\nstudent");
}
}

class DefaultConstructor
{
    public static void main(String args[])
    {
        Student st=new Student();
        st.display();
    }
}