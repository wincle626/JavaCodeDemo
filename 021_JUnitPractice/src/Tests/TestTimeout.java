package Tests;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TestTimeout {

    //This test will always failed :)
    @Test(timeout = 1000)
    public void infinity() {
        while (true) ;
    }

    //This test can't run more than 5 seconds, else failed
    @Test(timeout = 5000)
    public void testSlowMethod() {
        //...
    }

    //global timeout rule
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

	//This test will be failed, because it will take more than 1 second to finish!
    @Test
    public void testSlowMethod1() throws InterruptedException {
        //...
        TimeUnit.SECONDS.sleep(5000);
    }

	//passed
    @Test
    public void testSlowMethod2() {
        //...
    }

}
