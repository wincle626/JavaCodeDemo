package Tests;

import static org.junit.Assert.assertEquals;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Functions.Calculation;

public class TestComposeAnnotation {
	
    public Calculation calculator = new Calculation();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }
    
    public String testmethod() {
    	return "hello";
    }
    
    // custom annotation
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Tag("fast")
    @DisplayName("Fast Test")
    @Test
    public @interface FastTest {
    	int testsomething = 0;
    	String testmethod();
    }
    
    @FastTest(testmethod = "")
    public void test1() {
    	System.out.println("test something");
    }
}
