import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class Process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee> emplpoyee = Employee.getAllEmployee().stream().map(e->new Employee(e.getName(),e.getMark()*2)).collect(Collectors.toList());	
		System.out.println(emplpoyee);
		List<Employee> emplpoyee1 = Employee.getAllEmployee().stream().filter(e->e.getName().contains("i")).map(e->new Employee(e.getName(),e.getMark()*3))
				.collect(Collectors.toList());
		
		
		Long emplpoyee2 = Employee.getAllEmployee().stream().filter(e->e.getName().contains("i")).count();
		System.out.println(emplpoyee2);
		
		
		List<Student> student = Student.getAllStudent().stream()
				.filter(s->Period.between(s.getDoB(), LocalDate.now()).getYears() >18).collect(Collectors.toList());
		System.out.println(student);
	}

}
