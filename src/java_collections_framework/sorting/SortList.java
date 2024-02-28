package java_collections_framework.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
	List<Employee> employees = new ArrayList<>();
	employees.add(new Employee(10, 30, "Mark", (long) 400000));
	employees.add(new Employee(20, 35, "David", (long) 20000));
	employees.add(new Employee(30, 36, "Eric", (long) 6000000));
	employees.add(new Employee(40, 32, "John", (long) 2400000));
	employees.add(new Employee(50, 24, "Paul", (long) 3200000));
	
	/*
	 * Collections.sort(employees, new MySort()); System.out.println(employees);
	 */
	
	Collections.sort(employees, new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (int)(o1.getSalary() - o2.getSalary());
		}
	});
	
	Collections.sort(employees, (o1,o2)->Long.compare(o1.getSalary(),o2.getSalary()));
	
	System.out.println(employees);
	
	}
}

class MySort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int)(o1.getSalary() - o2.getSalary());
	}
	
}
