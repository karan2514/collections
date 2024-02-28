package java_collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ImmutableListExample {

	public static void main(String[] args) {
		  // Create an ArrayList to store fruits
			/*
			 * List<String> fruits = new ArrayList<>();
			 * 
			 * // Add fruits to the list fruits.add("Banana"); fruits.add("Apple");
			 * fruits.add("Grapes"); fruits.add("Mango");
			 * 
			 * fruits = Collections.unmodifiableList(fruits); fruits.add("Avocado");
			 * System.out.println(fruits);
			 */
		
			/*
			 * List<String> list = List.of("banana", "Apple", "grapes", "Mango");
			 * System.out.println(list);
			 */
		
		
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(21);
		list.add(2);
		list.add(98);
		list.add(47);
		
		Collections.sort(list);
		System.out.println(list);
		
		/*
		 * ListIterator<Integer> li = list.listIterator(list.size());
		 * while(li.hasPrevious()) { System.out.println(li.previous()); }
		 */
		
		
		
	}
}
