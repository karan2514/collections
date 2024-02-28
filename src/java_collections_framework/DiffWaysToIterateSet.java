package java_collections_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DiffWaysToIterateSet {

	public static void main(String[] args) {
		Set<String> electonics = new HashSet<>();
		electonics.add("Phone");
		electonics.add("Tv");
		electonics.add("Refrigerator");
		electonics.add("Fan");
		electonics.add("Air Conditioner");
		//System.out.println(electonics);
		
		// iterate using enhanced loop
		//iterateUsingEnhancedFor(electonics);
		
		// basic loop with iterator
		//iterateUsingBasicFor(electonics);
		
		//iterate using while loop
		
		//iterateUsingWhileLoop(electonics);
		
		//using for each()
		//iterateUsingForEach(electonics);
		
		//using stream()
		electonics.stream().filter(elements -> !"Fan".equals(elements))
		.forEach(elements -> System.out.println(elements));
		
		/*electonics.stream().forEach((itemss)->
		{
			System.out.println(itemss);
		});*/

	}

	private static void iterateUsingForEach(Set<String> electonics) {
		electonics.forEach((item) -> {
		    System.out.println(item);
		});
	}

	private static void iterateUsingWhileLoop(Set<String> electonics) {
		Iterator<String> items = electonics.iterator();
		while (items.hasNext()) {
			String type = (String) items.next();
			System.out.println(type);
			
		}
	}

	private static void iterateUsingBasicFor(Set<String> electonics) {
		for(Iterator<String> itr = electonics.iterator(); itr.hasNext();) {
			String elements =(String)itr.next();
			System.out.println(elements);
		}
	}

	private static void iterateUsingEnhancedFor(Set<String> electonics) {
		for(String items:electonics)
		{
			System.out.println(items);
		}
	}

}
