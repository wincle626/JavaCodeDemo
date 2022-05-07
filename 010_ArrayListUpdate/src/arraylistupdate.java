import java.util.*;

public class arraylistupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alstr = new ArrayList<>();
		alstr.add("irfan");
		alstr.add("yogesh");
		alstr.add("kapil");
		alstr.add("rajoria");
    
		alstr.forEach(name ->{
			System.out.println(name);
		});
    
		alstr.set(0, "feaip");

		System.out.println("");
		alstr.forEach(name ->{
			System.out.println(name);
		});
		
		int ind = alstr.indexOf("kapil");
		alstr.set(ind, "fejwa");

		System.out.println("");
		alstr.forEach(name ->{
			System.out.println(name);
		});
	    
	}

}
