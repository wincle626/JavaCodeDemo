package exceptionpackage;

public class myexception3 extends Exception{

	// default constructor
	public myexception3() { 
		
	}
 
    // parameterized constructor
	public myexception3(String message) {
        super(message);
    }

    public myexception3(String message, Throwable cause) {
        super(message, cause);
    }

    public myexception3(Throwable cause) {
        super(cause);
    }

    protected myexception3(String message, Throwable cause, boolean enableSuppression, boolean     writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
