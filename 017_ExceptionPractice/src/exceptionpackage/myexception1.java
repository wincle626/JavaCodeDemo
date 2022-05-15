package exceptionpackage;

public class myexception1 extends Exception {

	// default constructor
	public myexception1() { 
		
	}
 
    // parameterized constructor
	public myexception1(String message) {
        super(message);
    }

    public myexception1(String message, Throwable cause) {
        super(message, cause);
    }

    public myexception1(Throwable cause) {
        super(cause);
    }

    protected myexception1(String message, Throwable cause, boolean enableSuppression, boolean     writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
