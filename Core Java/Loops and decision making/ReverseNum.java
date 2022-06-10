import java.util.*;
class ReverseNum
{
    public int findReverse(int num)
    {
        int rem,result=0;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            result=result*10+rem;
        }
        return result;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        ReverseNum obj=new ReverseNum();
        System.out.println("Enter a no:");
        n=sc.nextInt();
        System.out.println("Reverse is "+obj.findReverse(n));

    }
}