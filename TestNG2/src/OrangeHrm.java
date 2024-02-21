import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHrm {
    @Test(dataProvider= "testDate", dataProviderClass = dataprovidate.class)
    public void logintest1(String userName, String password){
        System.out.println("username"+userName);
        System.out.println("password"+password);
        System.out.println();
    }
////    public void logintest2() {
////        System.out.println("username" + "admin");
////        System.out.println("password" + "admin123456");
////    }
//    public void logintest3() {
//        System.out.println("username" + "admin123");
//        System.out.println("password" + "admin123");
//    }
//    public void logintest4() {
//        System.out.println("username" + "admin123");
//        System.out.println("password" + "admin123456");
//    }
    @DataProvider(name="testDate")
    public Object[][] provideDate(){
        Object[][] objects=new Object[4][2];

        objects[0][0]="admin";
        objects[0][1]="admin123";

        objects[1][0]="admin";
        objects[1][1]="admin123456";

        objects[2][0]="admin123";
        objects[2][1]="admin123";

        objects[3][0]="admin123";
        objects[3][1]="admin123456";

        return objects;
    }
}
