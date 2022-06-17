import java.util.*;
class Member
{
    String name,address,phone;
    int age;
    double salary;
    void printSalary()
    {
        System.out.println("Your salary is "+salary);
    }
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        name=sc.nextLine();
        System.out.println("enter your phone");
        phone=sc.nextLine();
        System.out.println("enter your address");
        address=sc.nextLine();
        System.out.println("enter your age");
        age=sc.nextInt();
    }

    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("phone : "+phone);
        System.out.println("address : "+address);
        
    }
}

class Employee extends Member
{
    String specialization;
    void employeeInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your specialization");
        specialization=sc.nextLine();
        salary=30000;
        System.out.println("specialization : "+specialization);
    }

}


class Manager extends Member
{
    String department;
    void managerInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your department");
        department=sc.nextLine();
        salary=50000;
        System.out.println("department : "+department);
    }

}


class Office
{
    public static void main(String args[])
    {
        String post;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter for with post:");
        post=sc.nextLine();

        if(post.equals("employee"))
        {
            Employee e=new Employee();
            e.getData();
            e.employeeInfo();
            e.display();
            e.printSalary();
        }

        else if(post.equals("manager"))
        {
            Manager m=new Manager();
            m.getData();
            m.managerInfo();
            m.display();
            m.printSalary();
        }
    }

}