// Used to stored unique value in a sequential order. 

package Java_Set_Collection;

import java.util.Set;
import java.util.TreeSet;

public class Java_TreeSet {

	public static void main(String[] args) {
		
//		Creating a HashSet from HashSet class where Set is instance
		Set<Integer> set = new TreeSet<>();
		
//		Adding the value in the HashSet
		for(int i=0; i<10; i++) {
			set.add(i);
		}
		
//		Printing size of an HashSet
		System.out.println(set.size());
		
//		Printing if the value present in HashSet
		System.out.println(set.contains(5));
		
//		Printing an element in HashSet of value 100
		System.out.println(set.add(100));
		
//		Adding duplicate element in HashSet of value 100
		System.out.println(set.add(100));
		
//		Removing an element from HashSet of value
		set.remove(4);
		
//		Printing an elements of HashSet after removing
		System.out.println(set);

	}

}
