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
        System.out.println("Area of square= "+area+"cms");
        
    }
    void getPerimeter()
    {
        perimeter=side*4;
        System.out.println("perimeter of square= "+perimeter+"cms");
        
    }
}


class Circle extends Shape
{
    void getArea()
    {  
        area=3.14*side*side;
        System.out.println("Area of circle= "+area+"cms");
        
    }
    void getPerimeter()
    {
        perimeter=2*3.14*side;
        System.out.println("Circumference of the circle= "+perimeter+"cms");
        
    }
}



class HierarchicalInheritance
{
    public static void main(String args[])
    {
        Sqaure sq=new Sqaure();
        Circle c=new Circle();
        sq.getData();
        sq.getArea();
        sq.getPerimeter();
        c.getData();
        c.getArea();
        c.getPerimeter();


    }
}