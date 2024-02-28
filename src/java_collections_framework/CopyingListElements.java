package java_collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyingListElements {

	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Black");
		colors.add("Pink");
		
		// copying using the constructor
		
		//copyUsingConstructor(colors);
		 
		
		// using addall() method
		
		//copyUsingAddAll(colors);
		
		//copy using Collections.copy()
		//copyUsingCollections(colors);
		
		// using java 8 Stream
		List<String> colors_copy = colors.stream().collect(Collectors.toList());
		System.out.println(colors_copy);
		
		//using java 10
		List<String> colors_copy2 = List.copyOf(colors);
		System.out.println(colors_copy2);
		
		

	}

	private static void copyUsingCollections(List<String> colors) {
		List<String> colors_copy = new ArrayList<>(colors.size());
		colors_copy.add("Yellow");
		colors_copy.add("Purple");
		colors_copy.add("Brown");
		colors_copy.add("Gray");
		colors_copy.add("Orange");
		Collections.copy(colors_copy, colors);
		System.out.println(colors_copy);
	}

	private static void copyUsingAddAll(List<String> colors) {
		List<String> copyAddAll = new ArrayList<>();
		copyAddAll.addAll(colors);
		System.out.println(copyAddAll);
	}

	private static void copyUsingConstructor(List<String> colors) {
		List<String> copy_colors = new ArrayList<>(colors);
		copy_colors.forEach((elements)->{ System.out.println(elements); });
	}

}
