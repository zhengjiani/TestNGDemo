package examples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestNGsimple {


    @Test
    public void TestNgsimple(){
        System.out.println("this is TestNG test case");
    }

    @Test
    public void TestNgsimple1(){
        System.out.println("this is TestNG test case1");
    }

    @Test
    public void TestNgsimple2(){
        System.out.println("this is TestNG test case");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("this is after class");
    }
}
