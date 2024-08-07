package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import co.com.bancolombia.certification.prueba.interactions.Wait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.bancolombia.certification.prueba.questions.CalculationResult.calculationResult;
import static co.com.bancolombia.certification.prueba.tasks.ClickConvertidorTasasInteresTasks.clickConvertidorTasasInteres;
import static co.com.bancolombia.certification.prueba.tasks.ClickGestionarFinanzasTasks.clickGestionarFinanzas;
import static co.com.bancolombia.certification.prueba.tasks.ClickHerramientasTasks.clickHerramientas;
import static co.com.bancolombia.certification.prueba.tasks.ClickNegociosTasks.clickNegocios;
import static co.com.bancolombia.certification.prueba.tasks.ClickSolucionesNoFinancierasTasks.clickSolucionesNoFinancierasTasks;
import static co.com.bancolombia.certification.prueba.tasks.ClickTasaNominalAEfectivaTasks.clickTasaNominalAEfectiva;
import static co.com.bancolombia.certification.prueba.tasks.InputTheData.inputTheData;
import static co.com.bancolombia.certification.prueba.utils.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BancolombiaStepDefinitions {

    @Given("Select go to Bancolombia")
    public void SelectGoToBancolombiaBancolombia() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL.getConstant()));
    }

    @And("^Select button Negocios$")
    public void SelectNegociosButton() {
        theActorInTheSpotlight().attemptsTo(clickNegocios());
    }

    @And("Select button Soliciones no financieras")
    public void SelectSolicionesNoFinancierasButton() {
        theActorInTheSpotlight().attemptsTo(clickSolucionesNoFinancierasTasks());
    }

    @And("Select button Herramientas")
    public void SelectHerramientasButton() {
        theActorInTheSpotlight().attemptsTo(clickHerramientas());
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));
    }

    @And("Select Gestionar las finanzas de mi negocio")
    public void SelectGestionarLasFinanzasDeMiNegocioButton(){
        theActorInTheSpotlight().attemptsTo(clickGestionarFinanzas());
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));
    }

    @And("Select Convertidor de tasas de interes tool")
    public void SelectConvertidorTasasInteresButton(){
        theActorInTheSpotlight().attemptsTo(clickConvertidorTasasInteres());
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));

    }

    @And("Select De tasa nominal a tasa efectiva")
    public void SelectDeTasaNominalAEfectivaButton() {
        theActorInTheSpotlight().attemptsTo(clickTasaNominalAEfectiva());
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));

    }

    @When("Input data to calculate the tasa nominal a tasa efectiva")
    public void InputDataToCalculateTheTasaNominalATasaEfectiva() {
        theActorInTheSpotlight().attemptsTo(inputTheData());
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));
    }

    @Then("Validate the calculation result")
    public void ValidateTheCalculationResult() {
        theActorInTheSpotlight().should(seeThat(calculationResult()));
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));
    }
}
