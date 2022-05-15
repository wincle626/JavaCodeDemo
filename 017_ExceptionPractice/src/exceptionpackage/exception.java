package exceptionpackage;
// List of Java Exceptions: https://programming.guide/java/list-of-java-exceptions.html

import java.io.*;
import java.util.*;

import exceptionpackage.*;

import java.lang.*;


@SuppressWarnings({ "unused", "serial" })
public class exception 
	{
	
	public static void buildinexception(int caseind) {
		
		switch(caseind) {
			case 0:
				try {			
		            int a = 30, b = 0;
		            int c = a/b;  // cannot divide by zero
		            System.out.println ("Result = " + c);			
				}catch(ArithmeticException e){
		            System.out.println ("Can't divide a number by 0");
		        	e.printStackTrace();			
				}
				break;

			case 1:
				try {
		            String a = null; //null value
		            System.out.println(a.charAt(0));
		        } catch(NullPointerException e) {
		            System.out.println("NullPointerException.");
		        	e.printStackTrace();
		        }
				break;

			case 2:
				try {
		            String a = "This is like chipping "; // length is 22
		            char c = a.charAt(24); // accessing 25th element
		            System.out.println(c);
		        }
		        catch(StringIndexOutOfBoundsException e) {
		            System.out.println("StringIndexOutOfBoundsException.");
		        	e.printStackTrace();
		        }
				break;

			case 3:
				try {			 
		            // Following file does not exist
		            File file = new File("E://file.txt"); 
		            FileReader fr = new FileReader(file);
		            fr.close();
		        } catch (FileNotFoundException e) {
		           System.out.println("File does not exist.");
		        } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 4:
				try {
		            // "akki" is not a number
		            int num = Integer.parseInt ("akki") ; 
		            System.out.println(num);
		        } catch(NumberFormatException e) {
		            System.out.println("Number format exception.");
		        	e.printStackTrace();
		        }
				break;

			case 5:
				try{
		            int a[] = new int[5];
		            a[6] = 9; // accessing 7th element in an array of
		                      // size 5
		        }
		        catch(ArrayIndexOutOfBoundsException e){
		            System.out.println ("Array Index is Out Of Bounds.");
		        	e.printStackTrace();
		        }
				break;
		
		}
		
	}
	
	public static void customexception(int caseind) {
		
		try {		
			if(caseind<0) {
				myexception1 excep1 =
	                       new myexception1("case id should be larger than 0!");
	                    throw excep1;
			}
		}catch(myexception1 e1) {
			e1.printStackTrace();
		}
		
		try {				
			if(caseind>5){
				myexception2 excep2 =
	                       new myexception2("case id should be smaller than 6!");
	                    throw excep2;
			}
		}catch(myexception2 e2) {
			e2.printStackTrace();
		}
				
	}
	
	public static int exceptionorder() {

		try{
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ; 
            System.out.println(num);
            return 0;
        }
		catch(NullPointerException e) {
            System.out.println("NullPointerException.");
            return 0;
        }
		catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException.");
            return 0;
        } 
		catch(NumberFormatException e) {
            System.out.println("Number format exception.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds.");
            return 0;
        }finally {
            System.out.println ("I am in finally block.");
        }
        System.out.println ("Now I am returning.");
		return 0;
		
	}

	public static void main(String[] args) 
			throws IOException, IllegalFormatException, RuntimeException
	{
		// TODO Auto-generated method stub
		// Java buildin exceptions
		int caseind = 5;
		buildinexception(caseind);
		// Exception execution orders
//		exceptionorder();
		// Custom exceptions
//		int caseind = 7;
//		customexception(caseind);
//		int caseind = -3;
//		customexception(caseind);

	}

}
