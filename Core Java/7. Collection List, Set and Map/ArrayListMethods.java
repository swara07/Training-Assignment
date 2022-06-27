import java.util.*;

class ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("swara");
		ar1.add("swarangi");
		ar1.add("dali");
		ar1.add("spencer");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("betty");
		ar2.add("jughead");
		ar2.add("archie");
		ar2.add("veronica");
		
		//cloning the arraylist
		ArrayList<String>  cloneList=(ArrayList<String>)ar1.clone();
		System.out.println("Cloned list : "+cloneList);
	
		
		//contains IMP
		System.out.println(ar1.contains("swara"));
		
		//IndexOf IMP
		System.out.println(ar1.indexOf("swarangi"));
		
		// add elements of one array to another 
		ar1.addAll(ar2);
		System.out.println(ar1);
		
		// add elements after an index
		ar1.addAll(2,ar2);
		System.out.println(ar1);
		
		
		//removing an element
		ar1.remove(1);
		ar1.remove("betty");
		System.out.println(ar1);
		
		
		// removeIf IMP
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		numbers.removeIf(num -> num%2 ==0);
		System.out.println(numbers);
		
		// RetainAll IMP
		ArrayList<Integer> nu=new ArrayList<Integer>(Arrays.asList(1,1,1,2,1,6,6,3,4,5,6));
		nu.retainAll(Collections.singleton(6));
		System.out.println(nu);
		
		
		// emptying arraylist
				ar2.clear();
				System.out.println(ar2);
				
		//creating a sublist
		ArrayList<String> sublist= new ArrayList<String>(ar1.subList(2,5));
		System.out.println(sublist);
		
		// arrayList to normal Array
		
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		Object my_arr[]=list.toArray();
		System.out.println(Arrays.toString(my_arr));
		
		for(Object o:my_arr) {
			System.out.println(o);
		}
		
	}

}
