abstract class A
{
    abstract void display();
    void show()
    {
        System.out.println("Non abstract method");
    }

}

class B extends A
{
    public void display()
    {
        System.out.println("abstract method");
    }
}

class AbstractClass
{
    public static void main(String args[])
    {
        B b=new B();
        b.show();
        b.display();
    } 
}