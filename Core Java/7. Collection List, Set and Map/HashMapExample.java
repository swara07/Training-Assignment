import java.util.*;
import java.util.Map.Entry;

class HashMapExample
{
    public static void main(String args[])
    {
        HashMap<Integer,String> students =new HashMap<Integer,String>();

        students.put(1,"mike");
        students.put(2,"will");
        students.put(3,"dustin");
        students.put(4,"mike");
        students.put(null,"swara");

        System.out.println(students);
        System.out.println(students.get(3));


        Iterator<Integer> it=students.keySet().iterator();

        while(it.hasNext())
        {
            Integer key=it.next();
            String value=students.get(key);
            System.out.println("key="+key+ "  value="+value);
        }

        // iterator over the set (pair) : by using entrySet
		Iterator<Entry<Integer,String>> it1 =students.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<Integer,String> entry=it1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		



    }
}

/* NOTE:
1. no order no indexing
2. key and value pair
3. key cannot be duplicate
4. can store many null values but only one null
*/