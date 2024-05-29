package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import java.util.List;
import java.util.Map;
import static co.com.bancolombia.certification.mantenimiento.questions.ValidateCreditosEnMoraEnProcesoMessage.ValidateCreditosEnMoraEnProcesoMessage;
import static co.com.bancolombia.certification.mantenimiento.questions.ValidateCreditosEnMoraMessage.validateCreditosEnMoraMessage;
import static co.com.bancolombia.certification.mantenimiento.questions.ValidateExitScreenMessage.validateExitScreenMessage;
import static co.com.bancolombia.certification.mantenimiento.questions.ValidateExitScreenListadoCreditosMessage.validateExitScreenListadoCreditosMessage;

import static co.com.bancolombia.certification.mantenimiento.tasks.AnotherTimeButton.anotherTimeButton;
import static co.com.bancolombia.certification.mantenimiento.tasks.ExitButton.exitButton;
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
        theActorInTheSpotlight().should(seeThat(validateCreditosEnMoraMessage(modelDataList.get(0))));
    }

    @When("^I click the button en otro momento$")
    public void IClickTheButtonEnOtroMomento() {
        theActorInTheSpotlight().attemptsTo(anotherTimeButton());
    }

    @Then("^I validate the following messages in salir screen$")
    public void IValidateTheFollowingMessagesInSalirScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(validateExitScreenMessage(modelDataList.get(0))));
    }

    @Then("^I validate the following messages in creditos en mora en proceso screen$")
    public void IValidateTheFollowingMessagesInCreditosEnMoraNnProcesoScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(ValidateCreditosEnMoraEnProcesoMessage(modelDataList.get(0))));
    }

    @When("^I click the button salir")
    public void IClickTheButtonsalir() {
        theActorInTheSpotlight().attemptsTo(exitButton());
    }

    @Then("^I validate the following messages in salir listado creditos screen$")
    public void IValidateTheFollowingMessagesInSalirListadoCreditosScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(validateExitScreenListadoCreditosMessage(modelDataList.get(0))));
    }
}