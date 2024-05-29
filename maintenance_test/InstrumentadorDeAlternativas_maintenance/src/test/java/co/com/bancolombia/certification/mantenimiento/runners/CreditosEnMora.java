package co.com.bancolombia.certification.mantenimiento.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/creditos_en_mora.feature",
        glue = {"co.com.bancolombia.certification.mantenimiento.stepdefinitions", "co.com.bancolombia.certification.mantenimiento.setup"},
//        tags = "@Scenario4",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class CreditosEnMora {
}
