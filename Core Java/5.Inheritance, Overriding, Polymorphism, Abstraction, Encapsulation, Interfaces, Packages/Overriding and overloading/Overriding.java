class Shape
{
    void draw()
    {

    }

}

class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing rectangle");

    }
}


class Square extends Shape
{
    void draw()
    {
        System.out.println("Drawing square");
        
    }
}

class Overriding
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        Square s=new Square();
        r.draw();
        s.draw();
    }
}