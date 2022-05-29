package Tests;

//Annotations for Junit testing 4.x/5.x
//@Test annotation specifies that method is the test method.
//@Test(timeout=1000) annotation specifies that method will be failed if it takes longer than 1000 milliseconds (1 second).
//@BeforeClass/@BeforeAll annotation specifies that method will be invoked only once, before starting all the tests.
//@Before/@BeforeEach annotation specifies that method will be invoked before each test.
//@After/@AfterEach annotation specifies that method will be invoked after each test.
//@AfterClass/@AfterAll annotation specifies that method will be invoked only once, after finishing all the tests.

import org.junit.jupiter.api.*;

public class TestAnnotation {

    // Run once, e.g. Database connection, connection pool
    @BeforeAll
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    // Run once, e.g close connection, cleanup
    @AfterAll
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @BeforeEach
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Should rename to @AfterTestMethod
    @AfterEach
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }

    @Test
    public void test_method_3() {
        System.out.println("@Test - test_method_3");
    }

}
