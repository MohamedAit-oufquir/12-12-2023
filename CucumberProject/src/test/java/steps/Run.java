package steps;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featunres",
        glue = "src/test/java/steps")

public class Run extends AbstractTestNGCucumberTests {

}