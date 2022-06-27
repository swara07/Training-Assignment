class MinimumNumber
{
    public static void main(String args[])
    {
        int num[]={3,45,67,-9,65};
        int i,min;

        min=num[0];
        for(i=0;i<num.length;i++)
        {
            if(num[i]<min)
            {
                min=num[i];
            }
        }

        System.out.println("The minimum no is "+min );
    }
}