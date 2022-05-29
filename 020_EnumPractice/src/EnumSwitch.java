import java.io.*;

enum Level {
	LOW,
	MEDIUM,
	HIGH
}

public class EnumSwitch {
	public static void main(String[] args) throws IOException {
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
        
//		Level myVar = Level.MEDIUM;
        Level myVar = Level.valueOf(name);
	
		switch(myVar) {
			case LOW:
				System.out.println("Low level");
				break;
			case MEDIUM:
				System.out.println("Medium level");
				break;
			case HIGH:
				System.out.println("High level");
				break;
			default:
				System.out.println("Unknown level");
				break;
		}
	}
}