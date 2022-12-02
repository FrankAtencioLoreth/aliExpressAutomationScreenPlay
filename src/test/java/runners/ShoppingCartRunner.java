package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  features = "src/test/resources/features/shoppingCart.feature",
  glue = "src/test/java/stepDefinitions/ShoppingCartStepDefinitions.java",
  tags = "",
  snippets = SnippetType.CAMELCASE
)
public class ShoppingCartRunner {
}
