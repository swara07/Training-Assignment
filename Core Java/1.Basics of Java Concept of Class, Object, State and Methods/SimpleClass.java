
class SimpleClass
{
    int id=10;   //instance variable
    String name="Swarangi";  //instance variable

//main method
public static void main(String args[])
{
    char div='A'; // local variable

    //creating object of the class
    SimpleClass sc=new SimpleClass();
    System.out.println("id="+sc.id);
    System.out.println("name="+sc.name);
    System.out.println("class="+div);
}
}
