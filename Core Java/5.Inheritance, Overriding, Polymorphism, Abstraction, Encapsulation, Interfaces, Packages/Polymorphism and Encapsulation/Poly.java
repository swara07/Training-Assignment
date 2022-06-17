class A
{
    void show()
    {
        System.out.println("Inside class A");
        
    }
}

class B extends A
{
    void show()
    {
        System.out.println("Inside class B");
        
    }

}

class Poly 
{
    public static void main(String args[])
    {
        A b=new B();  //Dynamic polymorphism
        b.show();
    }
}