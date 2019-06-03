import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("chethiya",90));
		employee.add(new Employee("lahiru",90));
		employee.add(new Employee("Kasun",90));
		employee.add(new Employee("tharindu",90));
		employee.add(new Employee("waruna",90));
		
		
		List<Employee>employeelist=employee.stream().filter(e->e.getName().length()>5).collect(Collectors.toList());
		
		
		
		
	}

}
