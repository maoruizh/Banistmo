package co.com.bancolombia.certification.portalautogestioncobranza.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/listado_negociacion.feature",
        glue = "co.com.bancolombia.certification.portalautogestioncobranza.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class ListadoNegociacion {
}
