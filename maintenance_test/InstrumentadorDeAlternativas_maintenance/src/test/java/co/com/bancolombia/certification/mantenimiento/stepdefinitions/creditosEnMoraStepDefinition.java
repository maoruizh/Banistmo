package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import java.util.List;
import java.util.Map;
import static co.com.bancolombia.certification.mantenimiento.questions.MensajeCreditosEnMoraEnProceso.mensajeCreditosEnMoraEnProceso;
import static co.com.bancolombia.certification.mantenimiento.questions.MensajeCreditosEnMora.mensajeCreditosEnMora;
import static co.com.bancolombia.certification.mantenimiento.questions.MensajeSalir.mensajeSalir;
import static co.com.bancolombia.certification.mantenimiento.questions.MensajeSalirListadoDeCreditos.mensajeSalirListadoDeCreditos;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonEnOtroMomento.botonEnOtroMomento;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonSalir.botonSalir;
import static co.com.bancolombia.certification.mantenimiento.tasks.LoginUser.loginUser;
import static co.com.bancolombia.certification.mantenimiento.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class creditosEnMoraStepDefinition {

    @DataTableType(replaceWithEmptyString = "[vacio]")
    public ModelData configModel(Map<String, String> row) {
        return ModelData.configModel(row);
    }

    @Given("^that I entered the home page with the data$")
    public void thatIEnteredTheHomePageWithTheData(List<ModelData> modelDataList) {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL.getConstant()));
        theActorInTheSpotlight().wasAbleTo(loginUser(modelDataList.get(0)));
    }

    @When("^I can see the data$")
    public void ICanSeeTheData() {
    }

    @Then("^I validate the following messages$")
    public void IValidateTheFollowingMessages(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(mensajeCreditosEnMora(modelDataList.get(0))));
    }

    @Then("^I validate the following messages in creditos en mora en proceso screen$")
    public void IValidateTheFollowingMessagesInCreditosEnMoraEnProcesoScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(mensajeCreditosEnMoraEnProceso(modelDataList.get(0))));
    }

    @When("^I click the button en otro momento$")
    public void IClickTheButtonEnOtroMomento() {
        theActorInTheSpotlight().attemptsTo(botonEnOtroMomento());
    }

    @Then("^I validate the following messages in salir screen$")
    public void IValidateTheFollowingMessagesInSalirScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(mensajeSalir(modelDataList.get(0))));
    }

    @When("^I click the button salir")
    public void IClickTheButtonsalir() {
        theActorInTheSpotlight().attemptsTo(botonSalir());
    }

    @Then("^I validate the following messages in salir listado creditos screen$")
    public void IValidateTheFollowingMessagesInSalirListadoCreditosScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(mensajeSalirListadoDeCreditos(modelDataList.get(0))));
    }
}