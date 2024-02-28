package java_collections_framework.sorting;

public class Employee {

	private int id,age;
	private String name;
	private Long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Employee(int id, int age, String name, Long salary) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]\n";
	}
	
	
	
}
