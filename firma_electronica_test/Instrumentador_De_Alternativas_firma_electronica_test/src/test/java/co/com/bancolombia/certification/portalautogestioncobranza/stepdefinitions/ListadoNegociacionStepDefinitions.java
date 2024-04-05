package co.com.bancolombia.certification.portalautogestioncobranza.stepdefinitions;

import co.com.bancolombia.certification.portalautogestioncobranza.models.SetData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.bancolombia.certification.portalautogestioncobranza.tasks.Open.experiencePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ListadoNegociacionStepDefinitions {

    private final SetData modelData = new SetData();

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
        theActorCalled("crico@bamcolombia.com.co");
    }

    @Given("that entered to sign my documents with the correct username and password")
    public void thatEnteredToSignMyDocumentsWithTheCorrectUsernameAndPassword(DataTable credentials) {
        theActorInTheSpotlight().attemptsTo(experiencePage(modelData.setData(credentials)));
    }

    @When("I enter to listado negaciacion")
    public void iEnterToListadoNegaciacion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be able to see mi name {string}")
    public void iShouldBeAbleToSeeMiName(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
