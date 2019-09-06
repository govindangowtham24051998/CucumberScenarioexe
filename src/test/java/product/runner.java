package product;
import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(monochrome=true,plugin={"pretty","json:report1.json"},tags="@sanity")
	public class runner {

	}

