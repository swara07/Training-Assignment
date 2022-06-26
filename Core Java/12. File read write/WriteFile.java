import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class WriteFile 
{
    public static void main(String args[]) throws IOException
    {
        String text;
        Scanner sc=new Scanner(System.in);
        FileWriter f=new FileWriter("try.txt");

        System.out.println("Enter the text to enter");
        text=sc.nextLine();

        for(int i=0;i<text.length();i++)
        {
            f.write(text.charAt(i));
        }


        System.out.println("Text is saved in File");
        f.close();

    }
}