package Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class DateDisplay {
	
	public String Day;
	public String Month;
	public String Year;
	
	public DateDisplay(){
		this.Day = "01";
		this.Month = "01";
		this.Year = "1970";
	}
	
	public DateDisplay(String D, String M, String Y) {
		this.Day = D;
		this.Month = M;
		this.Year = Y;
	}
	
	public DateDisplay GetNowDate() {
		
		LocalDate Now = java.time.LocalDate.now();
		int d = Now.getDayOfMonth();
		int m = Now.getMonthValue();
		int y = Now.getYear();
		DateDisplay DD = new DateDisplay(Integer.toString(d),
				Integer.toString(m),Integer.toString(y));		
		return DD;
		
	}
	
	public DateDisplay InputDay()
	        throws IOException
	    {
			DateDisplay DD = new DateDisplay();
			// Read Day
	        BufferedReader reader1 = new BufferedReader(
	            new InputStreamReader(System.in));	 
	        System.out.println("Please input the day of month:");
	        String d = reader1.readLine();
	        DD.Day = d;
	        return DD;
	    }
	
	public DateDisplay InputMonth()
	        throws IOException
	    {
			DateDisplay DD = new DateDisplay();
			// Read Day
	        BufferedReader reader2 = new BufferedReader(
		            new InputStreamReader(System.in));	 
		        System.out.println("Please input the month of year:");
		        String m = reader2.readLine();
	        DD.Month = m;
	        return DD;
	    }
	
	public DateDisplay InputYear()
	        throws IOException
	    {
			DateDisplay DD = new DateDisplay();
			// Read Year
	        BufferedReader reader3 = new BufferedReader(
	            new InputStreamReader(System.in));	 
	        System.out.println("Please input the year:");
	        String y = reader3.readLine();
	        DD.Year = y;
	        return DD;
	    }
	
	public DateDisplay InputAll()
	        throws IOException
	    {
			// Read Day
	        BufferedReader reader1 = new BufferedReader(
	            new InputStreamReader(System.in));	 
	        System.out.println("Please input the day of month:");
	        String d = reader1.readLine();
			// Read Month
	        BufferedReader reader2 = new BufferedReader(
	            new InputStreamReader(System.in));	 
	        System.out.println("Please input the month of year:");
	        String m = reader2.readLine();
			// Read Year
	        BufferedReader reader3 = new BufferedReader(
	            new InputStreamReader(System.in));	 
	        System.out.println("Please input the year:");
	        String y = reader3.readLine();
	        
	        DateDisplay DD = new DateDisplay(d, m, y);
	        
	        return DD;
	        
	    }
	
	public void OutputDate(DateDisplay DD) {
//		System.out.println(DD.Year+"-"+DD.Month+"-"+DD.Day);
		System.out.println(Integer.parseInt(DD.Year));
		System.out.println(Integer.parseInt(DD.Month));
		System.out.println(Integer.parseInt(DD.Day));
	}
	
}
