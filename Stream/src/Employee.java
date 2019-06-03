import java.util.ArrayList;
import java.util.List;

public class Employee{
	Integer mark;
		
	
	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [mark=" + mark + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	
	public Employee(String name, Integer mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public static List<Employee> getAllEmployee()
	{
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("chethiya",90));
		employee.add(new Employee("lahiru",90));
		employee.add(new Employee("Kasun",90));
		employee.add(new Employee("tharindu",90));
		employee.add(new Employee("waruna",90));
		
		return employee;
	}
	
	
	

}
