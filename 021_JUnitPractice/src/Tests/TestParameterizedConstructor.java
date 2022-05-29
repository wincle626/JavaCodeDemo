package Tests;
  import org.junit.Test;
  import org.junit.runner.RunWith;
  import org.junit.runners.Parameterized;
  import org.junit.runners.Parameterized.Parameters;

  import java.util.Arrays;
  import java.util.Collection;

  import static org.hamcrest.CoreMatchers.is;
  import static org.hamcrest.MatcherAssert.assertThat;

  @RunWith(value = Parameterized.class)
  public class TestParameterizedConstructor {
	  
      private int numberA;
      private int numberB;
      private int expected;
	  
	  public  int add(int a, int b) {
	        return a + b;
	   }

      // Inject via constructor
      // for {8, 2, 10}, numberA = 8, numberB = 2, expected = 10
      public TestParameterizedConstructor(int numberA, int numberB, int expected) {
          this.numberA = numberA;
          this.numberB = numberB;
          this.expected = expected;
      }

  	// name attribute is optional, provide an unique name for test
  	// multiple parameters, uses Collection<Object[]>
      @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
      public static Collection<Object[]> data() {
          return Arrays.asList(new Object[][]{
                  {1, 1, 2},
                  {2, 2, 4},
                  {8, 2, 10},
                  {4, 5, 9},
                  {5, 5, 10}
          });
      }

      @Test
      public void test_addTwoNumbes() {
          assertThat(add(numberA, numberB), is(expected));
      }

  }

