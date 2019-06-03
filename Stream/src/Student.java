import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	LocalDate DoB;
	
public LocalDate getDoB() {
		return DoB;
	}
	public void setDoB(LocalDate doB) {
		DoB = doB;
	}
	
public Student(String name, LocalDate doB) {
		super();
		this.name = name;
		DoB = doB;
	}

public Student() {
	super();
}
public static  List<Student> getAllStudent()
{
	List<Student>student = new ArrayList<>();
	student.add(new Student("chethiya",LocalDate.of(2000,Month.JANUARY,14)));
	student.add(new Student("chethiya",LocalDate.of(2000,Month.JANUARY,14)));
	student.add(new Student("chethiya",LocalDate.of(2000,Month.JANUARY,14)));
	student.add(new Student("chethiya",LocalDate.of(2000,Month.JANUARY,14)));
	return student;
	
	
	
}


	

}
