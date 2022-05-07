
public class NoMatchingIDException extends Exception {
	
	public NoMatchingIDException(String dup){
		super("No Matching id = " + dup);
	}

}
