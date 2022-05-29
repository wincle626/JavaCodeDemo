/**
 * 
 */
package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import Functions.DateDisplay;

/**
 * @author UDRC
 *
 */
class TestDateDisplay {

	List<String> LongMonth = new ArrayList<>(
			List.of("01", "03", "05", "07", "08", "10", "12"));
	List<String> ShortMonth = new ArrayList<>(
			List.of("04", "06", "09", "11"));
	List<String> SpecialMonth = new ArrayList<>(
			List.of("02"));
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass(TestInfo testInfo) throws Exception {
		System.out.println("@BeforeAll Test Case");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass(TestInfo testInfo) throws Exception {
		System.out.println("@AfterAll Test Case");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp(TestInfo testInfo) throws Exception {
		System.out.println("Before testing "+testInfo.getDisplayName());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown(TestInfo testInfo) throws Exception {
		System.out.println("After testing "+testInfo.getDisplayName());
	}

	@Test
	void testInitialDay() {
		DateDisplay DD = new DateDisplay();
		assertEquals(DD.Day.length(), 2);
		assertTrue(Integer.parseInt(DD.Day)>0 &&
			((LongMonth.contains(DD.Month) && Integer.parseInt(DD.Day)<=31) ||
			(ShortMonth.contains(DD.Month) && Integer.parseInt(DD.Day)<=30) ||
			(SpecialMonth.contains(DD.Month) && Integer.parseInt(DD.Day)<=28))
		);
//		fail("Not yet implemented");
	}

	@Test
	void testInitialMonth() {
		DateDisplay DD = new DateDisplay();
		assertEquals(DD.Month.length(), 2);
		assertTrue(Integer.parseInt(DD.Month)>0 &&Integer.parseInt(DD.Month)<=12);
//		fail("Not yet implemented");
	}

	@Test
	void testInitialYear() {
		DateDisplay DD = new DateDisplay();
		assertEquals(DD.Year.length(), 4);
		assertTrue(Integer.parseInt(DD.Year)>1900 &&Integer.parseInt(DD.Year)<=2000);
//		fail("Not yet implemented");
	}


	@Test
	void testInputDay() throws IOException {
		DateDisplay DD = new DateDisplay();
		DD = DD.InputDay();
		assertEquals(DD.Day.length(), 2, "Day string length should be 2");
		assertTrue(Integer.parseInt(DD.Day)>0 &&
			((LongMonth.contains(DD.Month) && Integer.parseInt(DD.Day)<=31) ||
			(ShortMonth.contains(DD.Month) && Integer.parseInt(DD.Day)<=30) ||
			(SpecialMonth.contains(DD.Month) && Integer.parseInt(DD.Day)<=28))
		);
	}

	@Test
	void testInputMonth() throws IOException {
		DateDisplay DD = new DateDisplay();
		DD = DD.InputMonth();
		assertEquals(DD.Month.length(), 2, "Month string length should be 2");
		assertTrue(Integer.parseInt(DD.Month)>0 &&Integer.parseInt(DD.Month)<=12);
//		fail("Not yet implemented");
	}

	@Test
	void testInputYear() throws IOException {
		DateDisplay DD = new DateDisplay();
		DD = DD.InputYear();
		assertEquals(DD.Year.length(), 4, "Year string length should be 4");
		assertTrue(Integer.parseInt(DD.Year)>1900 &&Integer.parseInt(DD.Year)<=2000);
//		fail("Not yet implemented");
	}
}
