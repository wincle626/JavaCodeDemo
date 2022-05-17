package exceptionpackage;
// List of Java Exceptions: https://programming.guide/java/list-of-java-exceptions.html

// exception is used for robust code development, especially collaboratively

// exception can only handle one error at a time

// exception can have multiple catch block for catching different errors in sequential order

// only the first catch clause block with matching error type will be executed

// the order of multiple catch clause block does matter

// exception will not terminate the program with fatal errors

// exception is more integrated in debug rather than customised control flow approach (if-else/switch)

// using if-else/switch is faster than exception in debug but it is at its own risk in defining error handling

// try{the developing functionality might have error}
// catch(exceptiontype e){solution when there is an error}
// finally{always executed functionality}

// 'try' is divided code from program for testing or handling any potential error
// 'catch' gives solution or any assertion to the error
// 'finally' is used for some function that must execute (e.g. clean memory, close file/socket handle, etc.) 

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
		}finally {
            System.out.println ("I am in finally block.");
        }
		
		try {				
			if(caseind>5){
				myexception2 excep2 =
	                       new myexception2("case id should be smaller than 6!");
	                    throw excep2;
			}
		}catch(myexception2 e2) {
			e2.printStackTrace();
		}finally {
            System.out.println ("I am in finally block.");
        }

		try {	
			myexception3 excep3 =
                    new myexception3("warning for unhandled cases! will fix it later! ");
                 throw excep3;
		}catch(myexception3 e3) {
			e3.printStackTrace();
		}finally {
            System.out.println ("I am in finally block.");
        }
				
	}
	
	public static int exceptionorder1() {

		try{ // one exception at a time
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ; 
            System.out.println(num);
            return 1/0;
        }
		catch(ArithmeticException e){
            System.out.println ("Can't divide a number by 0");
        	e.printStackTrace();			
		}
		catch(NullPointerException e) {
            System.out.println("NullPointerException.");
        }
		catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException.");
        } 
		catch(NumberFormatException e) {
            System.out.println("Number format exception.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds.");
        }finally {
            System.out.println ("I am in finally block.");
        }
        System.out.println ("Now I am returning from exceptionorder1().");
		return 0;
		
	}
	public static int exceptionorder2() {

		int num = 0;
		try{
			num = 1/0;
            return num;
        }
		catch(ArithmeticException e){
            System.out.println ("Can't divide a number by 0");
        	e.printStackTrace();			
		}
		catch(NullPointerException e) {
            System.out.println("NullPointerException.");
        }
		catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException.");
        } 
		catch(NumberFormatException e) {
            System.out.println("Number format exception.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds.");
        }finally {
            System.out.println ("I am in finally block.");
            // num = 999999;
        }
        System.out.println ("Now I am returning from exceptionorder2() .");
		return num;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Java buildin exceptions
//		int caseind = 5;
//		buildinexception(caseind);
		// Exception execution orders
//		int num = 1/0; 
		exceptionorder1(); // no interruption to program
		exceptionorder2();
		// Custom exceptions
//		int caseind = 7;
//		customexception(caseind);
//		int caseind = -3;
//		customexception(caseind);

	}

}

