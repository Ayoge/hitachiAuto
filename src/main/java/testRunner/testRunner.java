package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java",glue="testRunner",publish = true,tags= "@Searchwithkeyword")
public class testRunner
{

}


