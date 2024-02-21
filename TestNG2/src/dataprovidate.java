import org.testng.annotations.DataProvider;

public class dataprovidate {
    @DataProvider(name="testDate")
    public static Object[][] provideDate() {
        Object[][] objects = new Object[4][2];

        objects[0][0] = "admin";
        objects[0][1] = "admin123";

        objects[1][0] = "admin";
        objects[1][1] = "admin123456";

        objects[2][0] = "admin123";
        objects[2][1] = "admin123";

        objects[3][0] = "admin123";
        objects[3][1] = "admin123456";

        return objects;
    }
}
