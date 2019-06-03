
public class Array {
	public static void main(String[] args) {
		
		
		
		
		Employee[] employees= 
				Employee.getAllEmployee().stream().toArray(Employee[]::new);
		
	}

}
