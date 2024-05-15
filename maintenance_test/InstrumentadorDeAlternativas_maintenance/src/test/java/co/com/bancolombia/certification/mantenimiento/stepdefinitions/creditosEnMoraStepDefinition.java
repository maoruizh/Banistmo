package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import co.com.bancolombia.certification.mantenimiento.questions.CreditosEnMora;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certification.mantenimiento.tasks.CreditosEnMora.*;
import static co.com.bancolombia.certification.mantenimiento.utils.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class creditosEnMoraStepDefinition {

    @DataTableType(replaceWithEmptyString = "[vacio]")
    public ModelData configModel(Map<String, String> row) {
        return ModelData.configModel(row);
    }
    @Given("^that I entered the home page$")
    public void thatIEnteredTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL.getConstant()));
    }
    @When("^I check the data$")
    public void ICheckTheData(List<ModelData> modelDataList) {
        theActorInTheSpotlight().attemptsTo(withTheData(modelDataList.get(0)));
    }

    @Then("^I can see the following messages$")
    public void ICanSeeTheFollowingMessages(List<ModelData> modelDataList) {
        theActorInTheSpotlight().should(seeThat(CreditosEnMora.message(modelDataList.get(0))));
    }
}