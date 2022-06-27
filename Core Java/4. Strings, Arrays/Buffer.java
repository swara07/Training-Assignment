import java.util.*;
class Buffer
{
    public static void main(String args[])
    {
        StringBuffer s1=new StringBuffer();
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 1st string");

        //append() adds the string to the StringBuffer
        s1.append(sc.nextLine());
        s1.append("dali");
        System.out.println(s1);

        //insert()
        s1.insert(5,"jitendra");
        System.out.println(s1);

        //reverse()
        s1.reverse();
        System.out.println("reverse is :"+s1);

        //delete() and replace()
        s1.delete(0,17);
        s1.append("swarangi");
        s1.replace(2,6,"dali");
        System.out.println("after replacing: "+s1);        
    }
}

//NOTE: StringBuffer is mutable unlike String class
