import java.util.*;

public class arraylistprint {
		
	static void loopprint() {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Java");
        names.add("Kotlin");
        names.add("Android");
         
        for(String name:names) {
            System.out.println(name);
        }
        
	}
	
	static void foreachprint() {
		
		ArrayList<String> names = new ArrayList<String>();
        
        names.add("Java");
        names.add("Kotlin");
        names.add("Android");
         
        names.forEach(name ->{
            System.out.println(name);
        });
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Using for loop: ");
		loopprint();
        System.out.println("");
        System.out.println("Using forEach method: ");
		foreachprint();
	}

}
