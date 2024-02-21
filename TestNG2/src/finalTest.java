import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class finalTest {
    @BeforeMethod
    public void bMethod() {
        System.out.println("Open Browser");
    }
    // this is for repetive methods
    // after method

    @AfterMethod
    public void aMethod() {
        System.out.println("Close Browser");
        System.out.println();
    }

    @Test(priority = 1)

    public void test1() {
        System.out.println("Add username");
        System.out.println("Add password");
        System.out.println("Click on the login");
        System.out.println("We will be in the dashboard page");


    }

    @Test(priority = 2)

    public void test2() {
        System.out.println("Hello World");
        System.out.println("Second Test");

    }
    @Test(priority = 3)
    public void validateAddition(){
        int actual = addTwonumber(2,3);
        int expected=5;
        Assert.assertEquals(actual,expected);
        Assert.assertTrue(expected> 3);
        Assert.assertEquals(actual,expected);
    }
    public int addTwonumber(int num1,int num2){
        return num1+num2;
    }
    public int subTwonumber(int num1, int num2){
        return num1 - num2 ;
    }

}