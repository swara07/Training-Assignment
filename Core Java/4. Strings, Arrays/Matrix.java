import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and col:");
        row=sc.nextInt();
        col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("Enter no the numbers for the matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("The matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}