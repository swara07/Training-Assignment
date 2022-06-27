class Overloading
{
    public static void addIntegers(int a, int b)
    {
        System.out.println("Addition of Integers: "+(a+b));
    }

    public static void addDecimals(double a, double b)
    {
        System.out.println("Addition of Decimals: "+(a+b));
    }


    public static void main(String args[])
    {
        addIntegers(5,10);
        addDecimals(20.4,45.8);
    }
}