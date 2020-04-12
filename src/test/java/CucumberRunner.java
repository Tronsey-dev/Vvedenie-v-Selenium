import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"ru.autotests"},
        plugin = {
                "ru.autotests.utils.AllureReporter",
        }
)
public class CucumberRunner {
}
