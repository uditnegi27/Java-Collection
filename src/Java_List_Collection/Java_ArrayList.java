package Java_List_Collection;

import java.util.ArrayList;
import java.util.List;

public class Java_ArrayList {

	public static void main(String[] args) {
		
//		Creating a ArrayList from ArrayList class where List is instance
		List<Integer> list = new ArrayList<>();
		
//		Adding the value in the ArrayList
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
//		Printing size of an ArrayList
		System.out.println(list.size());
		
//		Printing an ArrayList
		System.out.println(list);
		
//		Printing an element of ArrayList at index 5
		System.out.println(list.get(5));
		
//		Removing an element of ArrayList at index 5
		list.remove(5);
		
//		Printing an element of ArrayList at index 5 after removing
		System.out.println(list);

	}

}
