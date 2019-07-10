package examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @DataProvider(name="user")
    public Object[][] Users(){
        return new Object[][]{
                {"root","password"},
                {"cnblogs.com","zhengjiani"},
                {"tank","xiao"}
        };
    }

    @Test(dataProvider="user")
    public void verifyUser(String userName,String password){
        System.out.println("Username:"+userName+"Password:"+password);
    }
}
