package Tests;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestIgnore {

    @Test
    public void testMath1() {
        assertThat(1 + 1, is(2));
        assertThat(1 + 1, is(3));
    }

    @Ignore
    @Test
    public void testMath2() {
        assertThat(1 + 2, is(5));
    }

    @Ignore("some one please create a test for Math3!")
    @Test
    public void testMath3() {
        //...
    }

}