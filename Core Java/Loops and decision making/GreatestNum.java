import java.util.*;
class GreatestNum
{
    //find the greatest number
    public int findGreatest(int a,int b, int c)
    {
        if(a>b)
        {
            if(a>c)
                return a;
            else
                return c;
        }
        else
        {
            if(b>c)
                return b;
            else
                return c;
        }

    }

    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        GreatestNum obj=new GreatestNum();
        System.out.println("Enter three nos:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        System.out.println("Greatest no: "+obj.findGreatest(x,y,z));

    }

}