import java.util.*;

public class arraylistsearch {
	

	
	static ArrayList<Integer> arraylistinteger() {
		
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
        
        return arrli;
		
	}
	
	static ArrayList<String> arrayliststring() {
		
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
        
        return names;
		
	}
	
	static ArrayList<Person> arraylistobject() {

        // Make Person data-type objects
        Person p1 = new Person("Aditya", 19);
        Person p2 = new Person("Shivam", 19);
        Person p3 = new Person("Anuj", 15);
        Person p4 = new Person("James", 18);
 
        // Create an ArrayList object
        //(Declaring List of Person type)
        ArrayList<Person> names = new ArrayList<Person>();
 
        // Adding objects to the ArrayList
        names.add(p1);
        names.add(p2);
        names.add(p3);
        names.add(p4);
 
        // Print and display the elements of adobe ArrayList
        // using get() method
        System.out.println(names.get(0).name);
        System.out.println(names.get(0).age);
        System.out.println(names.get(1).name);
        System.out.println(names.get(1).age);
        System.out.println(names.get(2).name);
        System.out.println(names.get(2).age);
        System.out.println(names.get(3).name);
        System.out.println(names.get(3).age);
 
        // New Line
        System.out.println();
 
        // Optional Part for better understanding
        System.out.println(
            "Optional Part Added For Better Understanding");
 
        // (Optional)
        // Displaying what happens if printed by simply
        // passing List object as parameter
        System.out.println(names);
        
        return names;
	}
	
	static void searchintegerarraylist(ArrayList<Integer> arr) {

		  
        // use contains() to check if the element
        // 2 exits or not
        boolean ans = arr.contains(2); // search for 2
        int ind = arr.indexOf(2);
  
        if (ans)
            System.out.println("The list contains 2 at position " + ind);
        else
            System.out.println("The list does not contains 2");
  
        // use contains() to check if the element
        // 5 exits or not
        ans = arr.contains(3); // search for 3
        ind = arr.indexOf(3);
  
        if (ans)
            System.out.println("The list contains 3 at position " + ind);
        else
            System.out.println("The list does not contains 3");
        
	}
	
	static void searchstringarraylist(ArrayList<String> arr) {

		  
        // use contains() to check if the element
        // "geeks" exits or not
        boolean ans = arr.contains("life"); // search for 'life' 
        int ind = arr.indexOf("life");
  
        if (ans)
            System.out.println("The list contains life at position " + ind);
        else
            System.out.println("The list does not contains life");
  
        // use contains() to check if the element
        // "coding" exits or not
        ans = arr.contains("coding"); // search for 'coding'
        ind = arr.indexOf("coding");
  
        if (ans)
            System.out.println("The list contains coding at position " + ind);
        else
            System.out.println("The list does not contains coding");
        
	}
	
	static void searchobjectarraylist(ArrayList<Person> arr) {
        
        // Using basic loop
        for (Person p : arr) {
            if (p.getName().equals("Aditya")) {
                System.out.println("result 1 : " + "Aditya");
                break;
            }
        }
        
        // Using Iterator
        Iterator<Person> iterator = arr.iterator();
        while (iterator.hasNext()) {
        	Person customer = iterator.next();
            if (customer.getName().equals("Anuj")) {
                System.out.println("result 2 : " + "Anuj");
                break;
            }
        }
        
        // feature only after Java 8 stream API
		Person Shivam = arr.stream()
			  .filter(person -> "Shivam".equals(person.getName())) // single conditions
			  .findAny()
			  .orElse(null);
        System.out.println("result 3 : " + Shivam.getName());
        
		Person James = arr.stream()
			  .filter(person -> "James".equals(person.getName()) && person.getAge()==16) // multiple conditions
			  .findAny()
			  .orElse(null);
        if (James == null)
            System.out.println("result 4 : Null");
        else
            System.out.println("result 4 : " + James.getName());
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1 = arraylistinteger();
		searchintegerarraylist(arr1);
		ArrayList<String> arr2 = arrayliststring();
		searchstringarraylist(arr2);
		ArrayList<Person> arr3 = arraylistobject();
		searchobjectarraylist(arr3);
	}

}

//Class user-defined
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
	 
	String getName(){
		return name;
	}
	 
	int getAge() {
		return age;
	}
}
