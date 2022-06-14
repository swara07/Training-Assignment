import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Sorted list :");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        




    }
}