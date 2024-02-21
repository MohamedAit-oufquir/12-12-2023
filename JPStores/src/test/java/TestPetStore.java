import browser.Browser;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;


@RunWith(Enclosed.class)
public class TestPetStore {
    public static class HomePage{
        @Test
        public void Test1(){
            Browser browser = new Browser();
            browser.openBrowser().clickLinkElement("FISH");
        }
    }
}