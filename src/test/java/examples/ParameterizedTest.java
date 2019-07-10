package examples;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {


    @Parameters("test1")
    @Test
    public void ParaTest(String test1){
        System.out.println("This is"+test1);
    }
}
