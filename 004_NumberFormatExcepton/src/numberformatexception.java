
public class numberformatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = Integer.parseInt("1a"); // there is format mismatch
	        System.out.println(a);
		} catch (NumberFormatException nfe) {
	        System.out.println("NumberFormat Exception: invalid input string");
	    }
	    System.out.println("Continuing execution...");
		
		try {
			float a = Float.parseFloat("1a"); // there is format mismatch
	        System.out.println(a);
		} catch (NumberFormatException nfe) {
	        System.out.println("NumberFormat Exception: invalid input string");
	    }
	    System.out.println("Continuing execution...");	    

	}

}
