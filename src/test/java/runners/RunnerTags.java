package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/utest_reto.feature"},
        tags = "@stories",
        glue = "stepsdefinition",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
    public RunnerTags() {
    }


}
