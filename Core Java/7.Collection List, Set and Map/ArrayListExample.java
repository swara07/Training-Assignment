import java.util.*;
class ArrayListExample 
{
    public static void main(String args[])
    {
        ArrayList<Object> ar=new ArrayList<Object>();

        //add items to the list
        ar.add(10);
        ar.add("Swara");
        ar.add(true);
        ar.add(12.3);

        System.out.println("Size: "+ar.size());
        System.out.println(ar);
        System.out.println(ar.get(3));//get any particular item

        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> numbers=new ArrayList<Integer>();
        System.out.println("Enter 4 numbers");
        for(int i=0;i<4;i++)
        {
            numbers.add(sc.nextInt());
        }

        System.out.println(numbers);


        //Iterating using iterator
        System.out.println("Using for iterator");
        Iterator<Integer> it=numbers.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    
}
