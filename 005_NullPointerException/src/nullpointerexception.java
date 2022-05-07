import java.util.UUID;
import java.io.*;

public class nullpointerexception {
	
	private static nullpointerexception single = null;
    private String ID = null;
    
    private nullpointerexception()
    {
        /* Make it private, in order to prevent the
           creation of new instances of the Singleton
           class. */
 
        // Create a random ID
        ID = UUID.randomUUID().toString();
    }
    
    public static nullpointerexception getInstance()
    {
        if (single == null) // avoid null 
            single = new nullpointerexception();
        return single;
    }
 
    public String getID()
    {
        return this.ID;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nullpointerexception s = nullpointerexception.getInstance();
        System.out.println(s.getID());
	}

}
