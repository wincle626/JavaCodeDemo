import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User2
{
	 String name, role;
	 User2(String a, String b) {
	     name = a;
	     role = b;
	 }
	 String getRole() { return role; }
	 String getName() { return name; } 
	 
	 public String toString() {
		 return "User Name : " + name + ", Role :" + role;
	 }

	 public static void main(String args[])
	 { 
	     List<User2> users = 
	         new ArrayList<User2>();
	     users.add(new User2("John", "admin"));
	     users.add(new User2("Peter", "member"));
	       
		 // This line uses Predicates to filter
		 // out the list of users with the role "admin".
		 // List admins = process(users, (User u) -> 
		 // u.getRole().equals("admin"));
		
		 // Replacing it with the following line 
		 // using Stream API and lambda functions 
		 // produces the same output
		   
		 // the input to the filter() is a lambda 
		 // expression that returns a predicate: a 
		 // boolean value for each user encountered 
		 // (true if admin, false otherwise)
		 List<User2> admins = users.stream()
								 .filter((user) -> user.getRole().equals("admin"))
								 .collect(Collectors.toList());
		       
		 System.out.println(admins);
		 
	}
}