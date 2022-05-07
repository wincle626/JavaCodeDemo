import java.io.*;

public class nullpointerexception {
	
	static void case1() {

        // Initializing String variable with null value
		String ptr = null;
		 
        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("gfg")) // avoid null pointer
                System.out.println("Same");
            else
                System.out.println("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException Caught Case 1");
        }
        
        try
        {
            if ("gfg".equals(ptr))
                System.out.println("Same");
            else
                System.out.println("Not Same");           
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught NullPointerException Case 2");
        }
        
	}
	
	// Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null"); // avoid null pointer
        return s.length();
    }
	
	static void case2() {

		// String s set an empty string  and calling getLength()
        String s = "";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught Case 2");
        }
 
        // String s set to a value and calling getLength()
        s = "life is dang dang dang dang dang";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught Case 2");
        }
 
        // Setting s as null and calling getLength()
        s = null;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught Case 2");
        }
        
	}
	
	static void case3() {
		
		// Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" :
                          str.substring(0,5); // avoid null pointer
        System.out.println(message);
 
        // Initializing String variable with null value
        str = "life is dang dang dang dang dang";
        message = (str == null) ? "" : str.substring(0,5); // avoid null pointer
        System.out.println(message);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		case1();
		case2();
		case3();
	}

}
