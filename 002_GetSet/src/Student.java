public class Student
{
 
	public String name;
	 
	private int marks;
	 
	public Student (String stuName) { // Constructor of Student class
		name = stuName;
	} 
	
	public void setMarks(int stuMar) { 
		marks = stuMar;
	}
	 
	// This method prints the student details.
	public void printStu() {
		System.out.println("Name: " + name );
		System.out.println("Marks:" + marks);
	}
	 
	public static void main(String args[]) {
		
		Student StuOne = new Student("Ross"); // calling constructor
		Student StuTwo = new Student("Rachel"); // calling constructor
		Student StuThree = new Student("Phoebe"); // calling constructor
		 
		StuOne.setMarks(98); // set class variable marks
		StuTwo.setMarks(89); // set class variable marks
		StuThree.setMarks(90); // set class variable marks
		 
		StuOne.printStu(); // get class variable name and marks
		StuTwo.printStu(); // get class variable name and marks
		StuThree.printStu(); // get class variable name and marks
	 
	}
	
}