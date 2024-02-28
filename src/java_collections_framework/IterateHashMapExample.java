package java_collections_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> courseMap = new HashMap<>();
		courseMap.put(1, "C");
		courseMap.put(2, "C++");
		courseMap.put(3, "java");
		courseMap.put(4, "Angular");
		courseMap.put(5, "Python");
		
		/*
		 * Iterator<Entry<Integer,String>> iterator = courseMap.entrySet().iterator();
		 * while(iterator.hasNext()) { Entry<Integer,String> entry = iterator.next();
		 * System.out.println(entry.getKey()); System.out.println(entry.getValue()); }
		 */
		
		/*
		 * Iterator<Integer> itr = courseMap.keySet().iterator(); while(itr.hasNext()) {
		 * Integer key = itr.next(); System.out.println(key);
		 * System.out.println(courseMap.get(key)); }
		 */
		
		for(Map.Entry<Integer, String>entry: courseMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
