import java.util.ArrayList;

public class arraylist {
	
	static void arraylistinteger() {
		
		// Size of the
        // ArrayList
        int n = 5;
 
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arrli
            = new ArrayList<Integer>(n);
 
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);
 
        // Printing elements
        System.out.println(arrli);
 
        // Remove element at index 3
        arrli.remove(3);
 
        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);
 
        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
		
	}
	
	static void arrayliststring() {
		
		// Creating an ArrayList object
        // (Declaring List of String type)
        ArrayList<String> names = new ArrayList<String>();
 
        // Adding (appending) elements to List
        // Custom inputs using add() method
        names.add("Computer");
        names.add("Science");
        names.add("Portal");
 
        // Printing all the elements of ArrayList
        // Declaring generic ArrayList of String type
        System.out.print(names);
		
	}
	
	static void arraylistobject() {

        // Make Person data-type objects
        Person p1 = new Person("Aditya", 19);
        Person p2 = new Person("Shivam", 19);
        Person p3 = new Person("Anuj", 15);
 
        // Create an ArrayList object
        //(Declaring List of Person type)
        ArrayList<Person> names = new ArrayList<Person>();
 
        // Adding objects to the ArrayList
        names.add(p1);
        names.add(p2);
        names.add(p3);
 
        // Print and display the elements of adobe ArrayList
        // using get() method
        System.out.println(names.get(0).name);
        System.out.println(names.get(0).age);
        System.out.println(names.get(1).name);
        System.out.println(names.get(1).age);
        System.out.println(names.get(2).name);
        System.out.println(names.get(2).age);
 
        // New Line
        System.out.println();
 
        // Optional Part for better understanding
        System.out.println(
            "Optional Part Added For Better Understanding");
 
        // (Optional)
        // Displaying what happens if printed by simply
        // passing List object as parameter
        System.out.println(names);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylistinteger();
		arrayliststring();
		arraylistobject();
	}

}

// Class user-defined
class Person {
 
    // Random properties associated with the person
    // Person name
    String name;
    // Person age
    int age;
 
    // Constructor for class Person
    // for initializing objects
    Person(String name, int age)
    {
        // This keyword for efering to current object
        this.name = name;
        this.age = age;
    }
}
