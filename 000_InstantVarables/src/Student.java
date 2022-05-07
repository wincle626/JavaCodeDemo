public class Student
{
 
	public String name;
	 
	private int marks;
	 
	public Student (String stuName) {
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
		
		Student StuOne = new Student("Ross"); // instant variable StuOne
		Student StuTwo = new Student("Rachel"); // instant variable StuTwo
		Student StuThree = new Student("Phoebe"); // instant variable StuThree
		 
		StuOne.setMarks(98);
		StuTwo.setMarks(89);
		StuThree.setMarks(90);
		 
		StuOne.printStu();
		StuTwo.printStu();
		StuThree.printStu();
	 
	}
	
}