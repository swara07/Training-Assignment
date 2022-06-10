//static keyword is used to save memory

class StaticMethods
{
    //static variables
    static int id;
    static String name;

    //static function to get data
    public static void getinfo(int x, String y)
    {
        id=x;
        name=y;
    }

    //static function to display data
    public static void display()
    {
        System.out.println("name="+name);
        System.out.println("id="+id);
    }


    public static void main(String args[])
    {
        //calling static function without using object
        getinfo(1,"Swara");
        display();
    }
}


