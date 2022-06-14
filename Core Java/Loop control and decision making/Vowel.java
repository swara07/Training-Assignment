import java.util.*;
class Vowel
{
    public static void main(String args[])
    {
        char a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        a=sc.nextLine().charAt(0);
        switch(a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
              System.out.println("vowel"); 
              break; 
            default:
                System.out.println("consonant");  

        }

    }
}