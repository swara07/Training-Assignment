class MyException extends Exception
{
    MyException(String str)
    {
        super(str);
    }
}

class UserDefinedException
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException("This is a user Defined exception");
        }
        catch(Exception e)
        {
            System.out.println("my exception is caught");
        }
    }
}