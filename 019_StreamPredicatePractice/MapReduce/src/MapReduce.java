import java.util.ArrayList;
import java.util.List;

public class MapReduce { 
	
	public static void main(String args[]) {
		
		List<Employee> peoples = new ArrayList<>(); 
		peoples.add(new Employee(101, "Victor", 23)); 
		peoples.add(new Employee(102, "Rick", 21)); 
		peoples.add(new Employee(103, "Sam", 25)); 
		peoples.add(new Employee(104, "John", 27)); 
		peoples.add(new Employee(105, "Grover", 23)); 
		peoples.add(new Employee(106, "Adam", 22)); 
		peoples.add(new Employee(107, "Samy", 24)); 
		peoples.add(new Employee(108, "Duke", 29));
		peoples.add(new Employee(109, "Jack", 26));
		peoples.add(new Employee(110, "Ben", 20));
		
		double average = calculateAverage(peoples); 
		System.out.println("Average age of employees are (classic way) : " + average); 
		average = average(peoples); 
		System.out.println("Average age of employees are (lambda way) : " + average); 
	}

	/** 
	 	Java Method to calculate average from a list of object without using 
		lambdas, doing it on classical java way. 
 		@param employees 
		@return average age of given list of Employee 
	*/ 
	private static double calculateAverage(List<? extends Employee> employees){ 
		
//		int totalEmployee = employees.size(); 
		int totalEmployee = 0;
		double sum = 0; 
		for(Employee e : employees){ 
			if(e.getId()>105) {
				sum += e.getAge(); 
				totalEmployee += 1;
			}
		} 
		double average = sum/totalEmployee; 
		return average; 

	}
	
	/** 
		Java method which uses map reduce to calculate average of list of 
		employees in JDK 8. 
		@param peoples 
		@return average age of given list of Employees 
	*/ 
	private static double average(List<? extends Employee> peoples){ 
		
		return peoples.stream().filter(p->p.getId()>105)// Predicate<>
				.mapToInt(p-> p.getAge()) // map
				.average() // reduce
				.getAsDouble(); 
		
	}
	
}

class Employee{
	private final int id; 
	private final String name; 
	private final int age; 
	
	public Employee(int id, String name, int age){ 
		this.id = id; this.name = name; this.age = age; 
	} 
	
	public int getId(){ 
		return id; 
	} 
	
	public String getName(){ 
		return name;
	} 
	
	public int getAge(){ 
		return age; 
	} 
}



