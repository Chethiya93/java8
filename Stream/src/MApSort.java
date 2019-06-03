import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MApSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<String,Integer> students = new HashMap<>();
		
		students.put("chethiya", 110);
		students.put("lahiru", 70);
		students.put("chathura", 40);
		students.put("tharindu", 50);
		students.put("pathum", 90);
		
		for (Entry<String, Integer> entry : students.entrySet()) {
			if(entry.getValue()>55)
			
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		

	}

}
