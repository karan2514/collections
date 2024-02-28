package java_collections_framework.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
	
		public static void main(String[] args) {
			  ArrayList<String> fruits = new ArrayList<>();

		        // Add fruits to the list
		        fruits.add("Banana");
		        fruits.add("Apple");
		        fruits.add("Grapes");
		        fruits.add("Mango");
		        
				/*
				 * List<String> sorted_fruits =
				 * fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()
				 * ); System.out.println(sorted_fruits);
				 * 
				 * List<String> sorted_fruits1 =
				 * fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList()
				 * ); System.out.println(sorted_fruits1);
				 * 
				 * List<String> sorted_fruits2 =
				 * fruits.stream().sorted().collect(Collectors.toList());
				 * System.out.println(sorted_fruits2);
				 */
		        
		        List<Employee> employees = new ArrayList<>();
		    	employees.add(new Employee(10, 30, "Mark", (long) 400000));
		    	employees.add(new Employee(20, 35, "David", (long) 20000));
		    	employees.add(new Employee(30, 36, "Eric", (long) 6000000));
		    	employees.add(new Employee(40, 32, "John", (long) 2400000));
		    	employees.add(new Employee(50, 24, "Paul", (long) 3200000));
		    	
		    	//sortUsingComparatorAnonymousImpl(employees);
		    	//sortUsingComparatorAnonymousImplByName(employees);
		    	
		    	//sort using lambda function
				/*
				 * List<Employee> employees1 =
				 * employees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).
				 * collect(Collectors.toList()); System.out.println(employees1);
				 */
		    	
		    	//List<Employee> employees2 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
		    	//System.out.println(employees2);
		    	
		    	
		    	//sorting the employees based on the age using stream API
		    	
		    	List<Employee> employeesByAge = employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		    	System.out.println(employeesByAge);
		    	
		    	//Reverse sort the employees based on the age using stream API
		    	
		    	List<Employee> employeesByAgeReverse = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		    	System.out.println(employeesByAgeReverse);
		    	
		}

		private static void sortUsingComparatorAnonymousImpl(List<Employee> employees) {
			List<Employee> employees1 = employees.stream().sorted(new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					return (int)(o1.getSalary() - o2.getSalary());
				}
			}).collect(Collectors.toList());
			
			System.out.println(employees1);
		}
		
		private static void sortUsingComparatorAnonymousImplByName(List<Employee> employees) {
			List<Employee> employees1 = employees.stream().sorted(new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					return (int)(o1.getName().compareTo(o2.getName()));
				}
			}).collect(Collectors.toList());
			
			System.out.println(employees1);
		}
}
