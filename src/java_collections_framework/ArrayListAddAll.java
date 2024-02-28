package java_collections_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListAddAll {

	public static void main(String[] args) {
		/*
		 * List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		 * firstFivePrimeNumbers.add(2); firstFivePrimeNumbers.add(3);
		 * firstFivePrimeNumbers.add(5); firstFivePrimeNumbers.add(7);
		 * firstFivePrimeNumbers.add(11);
		 * 
		 * List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		 * 
		 * List<Integer> secondTenPrimeNumbers = new ArrayList<>();
		 * secondTenPrimeNumbers.add(13); secondTenPrimeNumbers.add(15);
		 * secondTenPrimeNumbers.add(17); secondTenPrimeNumbers.add(19);
		 * secondTenPrimeNumbers.add(23);
		 * 
		 * firstTenPrimeNumbers.addAll(secondTenPrimeNumbers);
		 */

		List<String> listIterator1 = new ArrayList<>();
		listIterator1.add("Java");
		listIterator1.add("C");
		listIterator1.add("C++");
		listIterator1.add("Python");
		
		//System.out.println(listIterator1);
		
		ListIterator<String> listIterator = listIterator1.listIterator();
		while(listIterator.hasPrevious()) {
			String ab = listIterator.previous();
			System.out.println(ab);
		}
		
		
	}

}
