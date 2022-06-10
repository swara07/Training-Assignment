import java.util.*;

class Student
{
int age;
String name;

//parameterized constructor
Student(int a, String b)
{
age=a;
name=b;
}

void display()
{
    System.out.println(name+"'s profile\nage= "+age+"\nstudent");
}
}

class ParameterizedConstructor
{
    public static void main(String args[])
    {
        int age;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        name=sc.next();
        System.out.println("enter your age:");
        age=sc.nextInt();
        Student st=new Student(age,name);
        st.display();
    }
}