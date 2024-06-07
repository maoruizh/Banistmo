package co.com.bancolombia.certification.mantenimiento.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/opcion_de_pago.feature",
        glue = {"co.com.bancolombia.certification.mantenimiento.stepdefinitions", "co.com.bancolombia.certification.mantenimiento.setup"},
//        tags = "@Scenario5",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class OpcionDePago {
}
