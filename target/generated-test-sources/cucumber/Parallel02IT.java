import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/D/QURATE/JUnitCucumberParallelExecutionPractise/src/main/resources/features/fileupload.feature"},
        plugin = {"json:C:/D/QURATE/JUnitCucumberParallelExecutionPractise/target/2.json"},
        monochrome = false,
        tags = {},
        glue = {"com.qa.stepdef"})
public class Parallel02IT {
}
