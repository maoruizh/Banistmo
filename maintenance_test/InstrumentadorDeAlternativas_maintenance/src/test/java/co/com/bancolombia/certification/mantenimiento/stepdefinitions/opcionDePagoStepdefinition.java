package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.bancolombia.certification.mantenimiento.questions.MensajeNuevasCondicionesFecha.mensajeNuevasCondicionesFecha;
import static co.com.bancolombia.certification.mantenimiento.questions.MensajeNuevasCondicionesCuota.mensajeNuevasCondicionesCuota;
import static co.com.bancolombia.certification.mantenimiento.questions.MensajeOpcionDePago.mensajeOpcionDePago;
import static co.com.bancolombia.certification.mantenimiento.questions.MensajeCreditosEnMora.mensajeCreditosEnMora;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonCambiar.botonCambiar;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonFlechaAbajo.botonFlechaAbajo;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonSalir.botonSalir;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonAplazarPago.botonAplazarPago;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonAplazarPagoYDisminuirCuota.botonAplazarPagoYDisminuirCuota;
import static co.com.bancolombia.certification.mantenimiento.tasks.BotonVolver.botonVolver;
import static co.com.bancolombia.certification.mantenimiento.tasks.LoginUser.loginUser;
import static co.com.bancolombia.certification.mantenimiento.utils.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class opcionDePagoStepdefinition {

    @Given("^that I entered the opcion de pago screen with the data$")
    public void thatIEnteredTheOpcionDePagoScreenWithTheData(List<ModelData> modelDataList) {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL.getConstant()));
        theActorInTheSpotlight().wasAbleTo(loginUser(modelDataList.get(0)));
        theActorInTheSpotlight().wasAbleTo(botonFlechaAbajo());
        theActorInTheSpotlight().wasAbleTo(botonCambiar());
    }

    @When("^I can see the data to the opcion de pago screen$")
    public void ICanSeeTheDataToTheOpcionDePagoScreen() {
    }

    @Then("^I validate the following messages to the opcion de pago screen$")
    public void IValidateTheFollowingMessagesToTheOpcionDePagoScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(mensajeOpcionDePago(modelDataList.get(0))));
    }

    @When("^I click on button salir opcion de pago")
    public void IClickOnButtonSalirOpcionDePago() {
        theActorInTheSpotlight().attemptsTo(botonSalir());

    }

    @When("^I click on button aplazar mi pago")
    public void IClickOnButtonAplazarMiPago() {
        theActorInTheSpotlight().attemptsTo(botonAplazarPago());
    }

    @Then("^I validate the following message in nuevas condiciones fecha screen$")
    public void IValidateTheFollowingMessageInNuevasCondicionesFechaScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(mensajeNuevasCondicionesFecha(modelDataList.get(0))));
    }

    @When("^I click on button aplazar mi pago y disminuir mi cuota")
    public void IClickOnButtonAplazarMiPagoYDisminuirMiCuota() {
        theActorInTheSpotlight().attemptsTo(botonAplazarPagoYDisminuirCuota());
    }

    @Then("^I validate the following message in nuevas condiciones cuota screen$")
    public void IValidateTheFollowingMessageInNuevasCondicionesCuotaScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(mensajeNuevasCondicionesCuota(modelDataList.get(0))));
    }

    @When("^I click on button volver in the opcion de pago screen")
    public void IClickOnButtonVolverInTheOpcionDePagoScreen() {
        theActorInTheSpotlight().attemptsTo(botonVolver());
    }

//    @Then("^I validate the following messages in creditos en mora screen$")
//    public void IValidateTheFollowingMessagesInCreditosEnMoraScreen(List<ModelData> modelDataList) {
//        theActorInTheSpotlight().should(seeThat(mensajeCreditosEnMora(modelDataList.get(0))));
//    }
}
