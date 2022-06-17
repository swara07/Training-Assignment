class MultipleCatch
{
    public static void main(String args[])
    {
        try
        {
            int a[]={1,2,3,4,5,6};
            System.out.println(a[9]);
            int b=100/0;
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of Bounds");
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}