import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listenerClass extends TestListenerAdapter {

    public void onTestFailure(ITestResult tr){
        System.out.println("test failed"+tr.getTestName());
    }
    public void onTestStart(ITestResult result){
        System.out.println("test starting"+ result.getTestName());
    }
}
