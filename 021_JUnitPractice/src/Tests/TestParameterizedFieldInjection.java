package Tests;
  import org.junit.Test;
  import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

  import java.util.Arrays;
  import java.util.Collection;

  import static org.hamcrest.CoreMatchers.is;
  import static org.hamcrest.MatcherAssert.assertThat;
  
public class TestParameterizedFieldInjection {

    //default value = 0
    @Parameter(value = 0)
    public int numberA;

    @Parameter(value = 1)
    public int numberB;

    @Parameter(value = 2)
    public int expected;
	  
	  public  int add(int a, int b) {
	        return a + b;
	   }

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
