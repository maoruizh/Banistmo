package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.bancolombia.certification.mantenimiento.questions.CalculationResult.calculationResult;
import static co.com.bancolombia.certification.mantenimiento.tasks.ClickConvertidorTasasInteresTasks.clickConvertidorTasasInteres;
import static co.com.bancolombia.certification.mantenimiento.tasks.ClickGestionarFinanzasTasks.clickGestionarFinanzas;
import static co.com.bancolombia.certification.mantenimiento.tasks.ClickHerramientasTasks.clickHerramientas;
import static co.com.bancolombia.certification.mantenimiento.tasks.ClickNegociosTasks.clickNegocios;
import static co.com.bancolombia.certification.mantenimiento.tasks.ClickSolucionesNoFinancierasTasks.clickSolucionesNoFinancierasTasks;
import static co.com.bancolombia.certification.mantenimiento.tasks.ClickTasaNominalAEfectivaTasks.clickTasaNominalAEfectiva;
import static co.com.bancolombia.certification.mantenimiento.tasks.InputTheData.inputTheData;
import static co.com.bancolombia.certification.mantenimiento.utils.Constants.URL;
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
    }

    @And("Select Gestionar las finanzas de mi negocio")
    public void SelectGestionarLasFinanzasDeMiNegocioButton(){
        theActorInTheSpotlight().attemptsTo(clickGestionarFinanzas());
    }

    @And("Select Convertidor de tasas de interes tool")
    public void SelectConvertidorTasasInteresButton(){
        theActorInTheSpotlight().attemptsTo(clickConvertidorTasasInteres());
    }

    @And("Select De tasa nominal a tasa efectiva")
    public void SelectDeTasaNominalAEfectivaButton() {
        theActorInTheSpotlight().attemptsTo(clickTasaNominalAEfectiva());
    }

    @When("Input data to calculate the tasa nominal a tasa efectiva")
    public void InputDataToCalculateTheTasaNominalATasaEfectiva() {
        theActorInTheSpotlight().attemptsTo(inputTheData());
    }

    @Then("Validate the calculation result")
    public void ValidateTheCalculationResult() {
        theActorInTheSpotlight().should(seeThat(calculationResult()));
    }
}
