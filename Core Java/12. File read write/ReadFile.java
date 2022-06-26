import java.io.FileReader;
import java.io.IOException;
class ReadFile 
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        FileReader f=new FileReader("try.txt");
        while ((ch=f.read())!=-1)
            System.out.print((char)ch);
        
        f.close();

    }
}
