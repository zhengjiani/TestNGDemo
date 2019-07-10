package examples;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test(enabled=false)
    public void testIgnore(){
        System.out.println("This test case will ignore");
    }
}
