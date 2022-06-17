class GrandParent
{
    void displayGrandparent()
    {
        System.out.println("Inside Grandparent class");
    }
}

class Parent extends GrandParent
{
    void displayParent()
    {
        System.out.println("Inside parent class");
    }
}

class Child extends Parent
{
    void displayChild()
    {
        System.out.println("Inside child class");
    }
}


class MultilevelInheritance
{
    public static void main(String args[])
    {
        Child c=new Child();
        c.displayChild();
        c.displayParent();
        c.displayGrandparent();
    }

}