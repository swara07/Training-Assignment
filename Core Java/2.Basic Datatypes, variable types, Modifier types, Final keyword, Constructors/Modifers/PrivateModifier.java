//Private : only accessible inside its class
//Public : can be accessed everywhere

class P
{
    private String name="swara";

    public void show()
    {
        System.out.println(name);
    }    
}

class PrivateModifier
{
public static void main(String args[])
    {

        P pm=new P();
        pm.show();
        System.out.println(pm.name);   // this will give error as main method is not a part of class
    }
}
