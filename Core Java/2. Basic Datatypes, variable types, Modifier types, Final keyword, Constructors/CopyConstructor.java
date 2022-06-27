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

//copy constructor
Student(Student s)
{
    age=s.age*2;
    name=s.name;
}



void display()
{
    System.out.println(name+"'s profile\nage= "+age+"\nstudent");
}
}

class CopyConstructor
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
        System.out.println("calling parameterized constructor");
        st.display();
        
        Student cp=new Student(st);
        System.out.println("calling copy constructor");
        cp.display();

        
    }
}