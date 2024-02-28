package java_collections_framework;

import java.util.ArrayList;
import java.util.List;

public class List_demo {

	public static void main(String[] args) {
		List<String> fruits_list = new ArrayList<>();
		
		fruits_list.add("Apple");
		fruits_list.add("Banana");
		fruits_list.add("Pomogranate");
		fruits_list.add("Orange");
		fruits_list.add("Custard Apple");
		fruits_list.add("Custard Apple");
		fruits_list.add("Custard Apple");
		fruits_list.add(null);
		fruits_list.add(null);
		
		fruits_list.forEach((e)->
		{
			System.out.println(e);
		});
		
		System.out.println(fruits_list.get(2));

	}

}
