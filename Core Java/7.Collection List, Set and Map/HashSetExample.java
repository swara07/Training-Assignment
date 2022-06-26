import java.util.*;
class HashSetExample {

	public static void main(String[] args) {
		// no duplicate values
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		set1.add("E");
		set1.add("A");
		
		
		System.out.println(set1);
		
		System.out.println(set1.contains("A"));
		
		set1.remove("D");
		
		System.out.println(set1);
		
		// union of two sets
		Set<Integer> first =new HashSet();
		first.addAll(Arrays.asList(new Integer[] {1,3,5,7,2,4}));
		
		Set<Integer> second =new HashSet();
		second.addAll(Arrays.asList(new Integer[] {4,7,2,8,0,11,10}));
		
		Set<Integer> union =new HashSet(first);
		union.addAll(second);
		System.out.println("Union:"+union);
		
		
		System.out.println("--------------");
		//intersection
		
		Set<Integer> intersection =new HashSet(first);
		intersection.retainAll(second);
		System.out.println("Intersection:"+intersection);
		
		
		System.out.println("--------------");
		//difference
		
		Set<Integer> diff =new HashSet(first);
		diff.removeAll(second);
		System.out.println("diff:"+diff);
		
		
		}
	}

