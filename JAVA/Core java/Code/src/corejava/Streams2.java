package corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams2 {
	
	public static void main(String[] args) {
		streamCreation();
	}
	
	public static  void streamCreation() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("1", "Jeff Bezos", "100000"));
				empList.add(new Employee("2", "Bill Gates", "200000"));
						empList.add(new Employee("3", "Mark Zuckerberg", "300000"));
						
						Stream.of(empList);
						empList.stream();
						
			
			empList.stream().forEach((Employee emp) -> System.out.println(emp.getAddress()));
						
						
			
	}

}
