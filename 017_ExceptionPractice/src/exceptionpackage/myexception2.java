package exceptionpackage;

public class myexception2  extends Throwable {

	// default constructor
	public myexception2() { 
		
	}
 
    // parameterized constructor
	public myexception2(String message) {
        super(message);
    }

    public myexception2(String message, Throwable cause) {
        super(message, cause);
    }

    public myexception2(Throwable cause) {
        super(cause);
    }

    protected myexception2(String message, Throwable cause, boolean enableSuppression, boolean     writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
