import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User1
{
    String name, role;
    User1(String a, String b) {
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
        List<User1> users = new ArrayList<User1>();
        users.add(new User1("John", "admin"));
        users.add(new User1("Peter", "member"));
        List<User1> admins = process(users, (User1 u) -> u.getRole().equals("admin"));
        System.out.println(admins);
    }
  
    public static List<User1> process(List<User1> users, 
                            Predicate<User1> predicate)
    {
        List<User1> result = new ArrayList<User1>();
        for (User1 user: users)        
            if (predicate.test(user))            
                result.add(user);
        return result;
    }
}