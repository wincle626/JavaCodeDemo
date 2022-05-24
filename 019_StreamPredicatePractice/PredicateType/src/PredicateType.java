import java.util.function.Predicate;
import java.util.*;

public class PredicateType {
	
	// simple example
	public static void simple()
    {
        // Creating predicate
        Predicate<Integer> lesserthan = p -> (p < 18); 
  
        // Calling Predicate method
        System.out.println(lesserthan.test(10)); 
        
    }
	
	// chaining predicate
	public static void chain()
    {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
  
        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
  
        // Calling Predicate method
//        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
//        System.out.println(result2);
    }
	
	// predicate of function
	static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }	
    public static void function()
    {
        pred(10, (p) -> p > 7);
    }

    // predicate or method
    static Predicate<String> hasLengthOf5 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 5;
        }
    };  
    public static void predicate_or()
    {
  
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
    
    // predicate and                                p -> p.length() >10;
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return (t.length() > 10) && (t.length() < 20);
        }
    };  
    public static void predicate_and()
    {
        Predicate<String> nonNullPredicate = Objects::nonNull;
  
        String nullString = null;
  
        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println(outcome);
  
        String lengthGTThan10 = "Welcome to the machine";
        boolean outcome2 = nonNullPredicate.and(hasLengthOf10).
        test(lengthGTThan10);
        System.out.println(outcome2);
    }
    
    // predicate negate
    public static Predicate<String> hasLengthOf15 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 15;
        }
    };  
    public static void predicate_negate()
    {
  
        String lengthGTThan15 = "Thunderstruck is a 2012 children's "
                                + "film starring Kevin Durant";
  
        boolean outcome = hasLengthOf10.negate().test(lengthGTThan15);
        System.out.println(outcome);
    }
    
    // predicate in collection
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		simple();
//		chain();
//		function();
		predicate_or();
//		predicate_and();
//		predicate_negate();

	}

}
