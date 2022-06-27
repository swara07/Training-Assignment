import java.util.*;

//parent class
class Shape
{
    int side;
    double area;
    double perimeter;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side:");
        side=sc.nextInt();
    }
}

//child class
class Sqaure extends Shape
{
    void getArea()
    {  
        area=side*side;
        System.out.println("Area= "+area+"cms");
        
    }
    void getPerimeter()
    {
        perimeter=side*4;
        System.out.println("perimeter= "+perimeter+"cms");
        
    }
}



class SimpleInheritance
{
    public static void main(String args[])
    {
        Sqaure sq=new Sqaure();
        sq.getData();
        sq.getArea();
        sq.getPerimeter();


    }
}