package stepsdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Answer;
import tasks.Fill;
import tasks.PageUp;

import java.util.List;

public class UtestRetoStepsDefinition {

    @Given("^that (.*) is in the homepage of Utest go to create an account$")
    public void thatTheUserIsInTheHomepageOfUtestGoToCreateAnAccount(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(PageUp.thePage());

    }

    @When("^he complete all the require data$")
    public void heCompleteAllTheRequireData(List<DataModel> dataModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.the(
                dataModel.get(0).getName(),
                dataModel.get(0).getLast_name(),
                dataModel.get(0).getEmail(),
                dataModel.get(0).getBirth_day(),
                dataModel.get(0).getBirth_month(),
                dataModel.get(0).getBirth_year(),
                dataModel.get(0).getCity(),
                dataModel.get(0).getZip_code(),
                dataModel.get(0).getPassword()
        ));
    }

    @Then("^the account is create$")
    public void theAccountIsCreate(List<DataModel> dataModel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Question<Boolean>) Answer.toThe(dataModel.get(0).getText_successful())));

    }

}
