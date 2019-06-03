import java.util.Comparator;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Employee>employee = Employee.getAllEmployee().stream().min(Comparator.comparing(Employee::getMark));
		System.out.println(employee);
		
		
		

	}

}
