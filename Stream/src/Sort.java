import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	
	public static void main(String[] args) {
		List<Employee> srtEmployee = Employee.getAllEmployee().stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		List<Employee> srtEmployee1 = Employee.getAllEmployee().stream().sorted(Comparator.comparing(Employee::getMark)).collect(Collectors.toList());
		System.out.println(srtEmployee);
		System.out.println(srtEmployee1);
		
		List<Employee> srtEmployee3 = Employee.getAllEmployee().stream().sorted((e1,e2)->e1.getMark().compareTo(e2.getMark())).collect(Collectors.toList());
		System.out.println(srtEmployee3);
		List<Employee> srtEmployee4 = Employee.getAllEmployee().stream().sorted((e1,e2)-> new Integer(e1.getName().length()).compareTo(e2.getName().length())).collect(Collectors.toList());
	}

}
