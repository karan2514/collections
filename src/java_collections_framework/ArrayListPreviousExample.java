package java_collections_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPreviousExample {

	public static void main(String[] args) {
		List<String> listIterator1 = new ArrayList<>();
		listIterator1.add("Java");
		listIterator1.add("C");
		listIterator1.add("C++");
		listIterator1.add("Python");

		ListIterator<String> listIterator = listIterator1.listIterator(listIterator1.size()); // Start from the end
		while (listIterator.hasPrevious()) {
		    String ab = listIterator.previous();
		    System.out.println(ab);
		}
	}
}
