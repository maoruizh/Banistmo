package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.bancolombia.certification.mantenimiento.questions.ValidateCreditosEnMoraDetalleMessage.validateCreditosEnMoraDetalleMessage;
import static co.com.bancolombia.certification.mantenimiento.tasks.ArrowDownButton.arrowDownButton;
import static co.com.bancolombia.certification.mantenimiento.tasks.LoginUser.loginUser;
import static co.com.bancolombia.certification.mantenimiento.utils.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class creditosEnMoraDetalleStepdefinition {

    @Given("^that I entered the listado creditos en mora detalle screen with the data$")
    public void thatIEnteredTheListadoCreditosEnMoraDetalleScreenWithTheData(List<ModelData> modelDataList) {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL.getConstant()));
        theActorInTheSpotlight().wasAbleTo(loginUser(modelDataList.get(0)));
        theActorInTheSpotlight().wasAbleTo(arrowDownButton());
    }

    @When("^I can see the data to the listado creditos en mora detalle screen$")
    public void iCanSeeTheDataToTheListadoCreditosEnMoraDetalleScreen() {
    }

    @Then("^I validate the following messages to the listado creditos en mora detalle screen$")
    public void iValidateTheFollowingMessagesToTheListadoCreditosEnMoraDetalleScreen(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(validateCreditosEnMoraDetalleMessage(modelDataList.get(0))));
    }

}
