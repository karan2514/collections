package java_collections_framework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_demo {

	public static void main(String[] args) {
		
		Collection<String> color_collection = new ArrayList<>();
		color_collection.add("red");
		color_collection.add("Blue");
		color_collection.add("Green");
		color_collection.add("Black");
		
		color_collection.forEach((element)->{
			System.out.println(element);
			
		});
		
		

	}

}
