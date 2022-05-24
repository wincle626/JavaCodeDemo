import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFilter {
	
	public static Predicate<Customer> isAdult() {
	    return p -> p.getAge() > 18 ;
	}
	
	public static Predicate<Customer> isMale() {
	    return p -> p.getGender().equalsIgnoreCase("M");
	}
	
	public static Predicate<Customer> isFemale() {
	    return p -> p.getGender().equalsIgnoreCase("F");
	}
	
	public static Predicate<Customer> isAgeMoreThan(Integer age) {
	    return p -> p.getAge() > age;
	}
	
	public static Predicate<Customer> lastPurchaseMoreThan(Double amount) {
	    return p -> p.getLastPurchaseAmount() > amount;
	}
	
	public static Predicate<Customer> purchaseTimesMoreThan3() {
	    return p -> p.getTotalPurchaseCount() > 3;
	}
	
	public static List<Customer> filterCustomers (List<Customer> customers, Predicate<Customer> predicate) {
        return customers.stream().filter( predicate ).collect(Collectors.<Customer>toList());
    }
	
	public static void main(String args[]) {
		    Customer c1 = new Customer(1,23,"M","BB","Bee", 10000.0, 5);
        Customer c2 = new Customer(2,13,"F","HH","Horse", 300.0, 2);
        Customer c3 = new Customer(3,43,"M","MM","Monkey", 100.0, 1);
        Customer c4 = new Customer(4,23,"M","LL","Leopard", 40000.0, 10);
        Customer c5 = new Customer(5,19,"F","MM","Moose", 700.0, 7);
        Customer c6 = new Customer(6,15,"M","FF","Frog", 2300.0, 5);
        Customer c7 = new Customer(7,63,"F","RR","Rat", 9000.0, 2);
        Customer c8 = new Customer(8,70,"M","GG","Goose", 4000.0, 8);
        Customer c9 = new Customer(9,15,"F","SS","Seal", 670.0, 1);
        Customer c10 = new Customer(10,45,"M","JJ","Jaguar", 100000.0, 39);
         
        List<Customer> Customers = new ArrayList<Customer>();
        
        Customers.addAll(Arrays.asList(new Customer[]{c1,c2,c3,c4,c5,c6,c7,c8,c9,c10}));
                
        System.out.println("find the male adult customers：[isMale().and(isAdult())]");
        List<Customer> adultMaleCustomer = filterCustomers(Customers, isMale().and(isAdult()) );
        adultMaleCustomer.stream().forEach( s -> System.out.println(s));
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("find the female adult customers：[isFemale().and(isAdult())]");
        List<Customer> adultFemaleCustomer = filterCustomers(Customers, isFemale().and(isAdult()));
        adultFemaleCustomer.stream().forEach( s -> System.out.println(s));
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("find customers older than 25：[isAgeMoreThan(25)]");
        List<Customer> ageMoreThanTwentyFiveCustomers = filterCustomers(Customers, isAgeMoreThan(25));
        ageMoreThanTwentyFiveCustomers.stream().forEach( s -> System.out.println(s));
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("find customers younger than 25：[isAgeMoreThan(25).negate()]");
        List<Customer> ageLessThanTwentyFiveCustomers = filterCustomers(Customers, isAgeMoreThan(25).negate());
        ageLessThanTwentyFiveCustomers.stream().forEach( s -> System.out.println(s));
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("find those male customers with more than 3 time purchase records：[isMale().and(purchaseTimesMoreThan3())]");
        List<Customer> adultMaleBuyMoreThan3TimesCustomer = filterCustomers(Customers, isMale().and(purchaseTimesMoreThan3()));
        adultMaleBuyMoreThan3TimesCustomer.stream().forEach( s -> System.out.println(s));
        
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("find the customers spent more than 10000 in last purchase：[s -> s.getLastPurchaseAmount() > 10000]");
        List<Customer> lastPurchaseAmountMoreThan10000 = filterCustomers(Customers, s -> s.getLastPurchaseAmount() > 10000);
        lastPurchaseAmountMoreThan10000.stream().forEach( s -> System.out.println(s));
        
	}
	

	
}

class Customer {


	public Customer(Integer id, Integer age, String gender, String firstName, String lastName,
			Double lastPurchaseAmount, Integer totalPurchaseCount) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastPurchaseAmount = lastPurchaseAmount;
		this.totalPurchaseCount = totalPurchaseCount;
	}


	private Integer id;
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;
	private Double lastPurchaseAmount;
	private Integer totalPurchaseCount;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Double getLastPurchaseAmount() {
		return lastPurchaseAmount;
	}


	public void setLastPurchaseAmount(Double lastPurchaseAmount) {
		this.lastPurchaseAmount = lastPurchaseAmount;
	}


	public Integer getTotalPurchaseCount() {
		return totalPurchaseCount;
	}


	public void setTotalPurchaseCount(Integer totalPurchaseCount) {
		this.totalPurchaseCount = totalPurchaseCount;
	}


	@Override
	public String toString() {
		return "Age("+this.age.toString()+"), Gender("+this.gender+"), lastName:["
				+ this.lastName +"], lastPurchaseAmount("+this.lastPurchaseAmount.doubleValue()+"), totalPurchaseCount("+this.totalPurchaseCount.intValue()+")"; 
	}
}