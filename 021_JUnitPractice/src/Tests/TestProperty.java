package Tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import Functions.Calculation;
// third party unit test library
import net.jqwik.api.*;

public class TestProperty {
	
    public Calculation calculator = new Calculation();

	@Property
	public boolean listlengthequal(@ForAll List<String> list1,
		    @ForAll List<String> list2) {
		return list1.size() == list2.size();
	}
	
    @Test
    void testlistlength(List<String> list1, List<String> list2) {
        assertTrue(listlengthequal(list1, list2));
    }
}
