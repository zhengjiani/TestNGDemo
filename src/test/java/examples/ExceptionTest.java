package examples;

import org.junit.Test;


public class ExceptionTest {

    @org.testng.annotations.Test(expectedExceptions=IllegalArgumentException.class,expectedExceptionsMessageRegExp="NullPoint")
    public void testException(){
        throw new IllegalArgumentException("NullPoint");
    }
}

