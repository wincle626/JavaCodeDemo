import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FileReadWrite {
	
	static String readfilename = "errors1_16.txt";
	static String writefilename = "errors1_16_copy.txt";
	
	static void ReadMethod1() {
		// Passing the path to the file as a parameter
        FileReader fr = null;
		try {
			fr = new FileReader(readfilename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        // Declaring loop variable
        int i;
        // Holds true till there is nothing to read
        try {
			while ((i = fr.read()) != -1)
 
			    // Print all the content of a file
			    System.out.print((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	static void ReadMethod2() {

        // File path is passed as parameter
        File file = new File(readfilename);
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        try {
			while ((st = br.readLine()) != null)
 
			    // Print the string
			    System.out.println(st);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	static void ReadMethod3() {
		
		// pass the path to the file as a parameter
	    File file = new File(readfilename);
	    Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
	}
	
	static void ReadMethod4() {
		
		File file = new File(readfilename);
	    Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    // we just need to use \\Z as delimiter
	    sc.useDelimiter("\\Z");
	 
	    System.out.println(sc.next());
	    
	}
	
	static void ReadMethod5() {
		
		String data = "";
	    try {
			data = new String(Files.readAllBytes(Paths.get(readfilename)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(data);
	    
	}
	
	static void WriteMethod1() {
		
		String text = "";
	    try {
	    	text = new String(Files.readAllBytes(Paths.get(readfilename)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        // Defining the file name of the file
        Path fileName = Path.of(writefilename);
 
        // Writing into the file
        try {
			Files.writeString(fileName, text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.print(
                "File is created successfully with the content.");
 
        // Reading the content of the file
//        String file_content = null;
//		try {
//			file_content = Files.readString(fileName);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
// 
//        // Printing the content inside the file
//        System.out.println(file_content);
        System.out.println("1st write method done!");
        
	}
	
	static void WriteMethod2() {
		
		String text = "";
	    try {
	    	text = new String(Files.readAllBytes(Paths.get(readfilename)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Create a FileWriter object
        // to write in the file
        FileWriter fWriter = null;
		try {
			fWriter = new FileWriter(writefilename);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

        // Writing into file
        // Note: The content taken above inside the
        // string
        try {
			fWriter.write(text);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // Printing the contents of a file
//        System.out.println(text);

        // Closing the file writing connection
        try {
			fWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Display message for successful execution of
        // program on the console
        System.out.print(
            "File is created successfully with the content.");
        System.out.println("2nd write method done!");
		
	}
	
	static void WriteMethod3() {
		
		String text = "";
	    try {
	    	text = new String(Files.readAllBytes(Paths.get(readfilename)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Step 1: Create an object of BufferedWriter
        BufferedWriter f_writer = null;
		try {
			f_writer = new BufferedWriter(new FileWriter(writefilename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Step 2: Write text(content) to file
        try {
			f_writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Step 3: Printing the content inside the file
        // on the terminal/CMD
//        System.out.print(text);

        // Step 4: Display message showcasing
        // successful execution of the program
        System.out.print(
            "File is created successfully with the content.");

        // Step 5: Close the BufferedWriter object
        try {
			f_writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("3rd write method done!");
        
	}
	
	static void WriteMethod4() {
		
		String text = "";
	    try {
	    	text = new String(Files.readAllBytes(Paths.get(readfilename)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

        FileOutputStream outputStream = null;
		
		// Step 1:  Create an object of FileOutputStream
        try {
			outputStream = new FileOutputStream(writefilename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Step 2: Store byte content from string
        byte[] strToBytes = text.getBytes();

        // Step 3: Write into the file
        try {
			outputStream.write(strToBytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Print the success message (Optional)
        System.out.print(
            "File is created successfully with the content.");

        try {
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("4th write method done!");
        
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ReadMethod1();
		ReadMethod2();
		ReadMethod3();
		ReadMethod4();
		ReadMethod5();
		WriteMethod1();
		WriteMethod2();
		WriteMethod3();
		WriteMethod4();

	}

}
