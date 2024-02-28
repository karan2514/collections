package java_collections_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("C");
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Angular");
		
		/*
		 * for(String li:list) { System.out.println(li); }
		 */
		
		//System.out.println(list.indexOf("C++"));
		
		//access the linked list using iterator
		/*
		 * Iterator<String> itr = list.iterator(); while(itr.hasNext()) { //String a
		 * =(String)itr.next(); System.out.println((String)itr.next());
		 * //System.out.println(a.getClass().getName()); }
		 */
		
		list.forEach((items)->{
			System.out.println(items);
		});
	}
}
